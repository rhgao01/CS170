public class Pyramid{

  public static void main(String[] args) {
    Turtle roo = new Turtle();
    pyramid(roo, 300,21);

  }
 //number of squares 1,3,5,7,9,...,(2*levels-1)
 //side length of the square: (base/(2*levels-1))
//start with the top one, after each level is finished, down 1, proceed next level
// in each level, squre, right 1, next squre,..., 2*level-1 squares in total

  public static void pyramid(Turtle t, double base, int levels){
    t.delay(5);
    for(int r=0; r<levels;r++){
      for(int i = 0; i < (2*levels-1-2*r); i++){
        square(t,base,levels);
        t.penup();
        t.forward(base/(2*levels-1));
        t.pendown();
      }

      t.backward((base*(2*(levels-r)-1))/(2*levels-1));
      t.penup();
      t.forward(base/(2*levels-1));
      t.left(90);
      t.forward(base/(2*levels-1));
      t.right(90);
      t.pendown();
    }
    t.penup();
    t.backward((base/(2*levels-1))*(levels));
    t.left(90);
    t.backward((base/(2*levels-1))*(levels+1));
    t.right(90);
  }

  public static void square(Turtle t, double base, int levels){
    for (int i = 0; i < 4 ; i++) {
      t.forward(base/(2*levels-1));
      t.right(90);
    }
  }






}
