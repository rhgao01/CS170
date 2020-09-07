public class Polywheel {
/*
things to notice: 
  here, different from the last one,
  where you change `t.right` to `t.left`
  because you don't want to **repeat** the route!!
*/
  public static void main(String[] args){
    Turtle roo = new Turtle();
    polywheel(roo, 5, 15);
    roo.penup();
    roo.backward(100);
    roo.pendown();
    polywheel(roo, 12, 20);
  }

 public static void polywheel(Turtle t, int numSides, double length){
   t.delay(5);
   for (int i=0; i< numSides; i++){
     polygon(t, numSides,length);
     t.forward(length);
     t.right(360/numSides);
   }
//notice that there is no need to draw the center shape
//it's only consists of numSides of polygons that revoles the center
    }
    //draw the basic polygons
    public static void polygon(Turtle t, int numSides, double length){
      for (int i=0; i< numSides; i++){
        t.forward(length);
        t.left(360/numSides);
      }
 }
}
