public class Polyspiral{
  /*
    3 things to notice:
        1. `i` is also an `int` that participates in the loop
        2. when using exterior angle, remember it turns eventually to the original direction, covered all 360 degrees
        3. when walking backwards, you don't need to change the angle it turns.(draw it!)
  */

  public static void main(String[] args) {
    Turtle roo = new Turtle();
    polyspiral(roo, 5, 10, 4);
    roo.penup();
    roo.forward(100);
    roo.pendown();
    polyspiral(roo, 3, 20, 5);
  }

  public static void polyspiral(Turtle t, int n, double base, int rounds){
    //each repetation has n-1 sides, starting from center and spirals out,
    //the first spiral is n*base, (n+1)*base,
    t.pendown();
    t.delay(5);
      for (int i = 0; i < n*rounds ; i++){
        t.forward(base*(i+1));
        t.right(360/n);
      }
      t.penup();
      for (int i = 0; i < n*rounds ; i++){
        t.backward(base*(i+1));
        t.right(360/n);
      }
      t.pendown();
  }
}
