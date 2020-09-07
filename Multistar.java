public class Multistar{
  /*
  > "You're dividing integers, which means that you're using **integer division**.
  > In integer division the fractional part of the result is thrown away."
    [https://stackoverflow.com/questions/7286681/why-does-integer-division-code-give-the-wrong-answer](https://stackoverflow.com/questions/7286681/why-does-integer-division-code-give-the-wrong-answer)
*/
  public static void main(String[] args) {
    Turtle roo = new Turtle();
    multistar(roo, 7,100);
    roo.penup();
    roo.forward(200);
    roo.pendown();
    multistar(roo, 10,70);
  }

//draw a very cute small star
  public static void a_cute_star(Turtle t, int n, double length){
    for(int i = 0; i < n; i++){
    t.forward(length);
    t.penup();
    t.backward(length);
    t.pendown();
    t.left(360.0/n);
    }
  }

//put the cutey on the tips of a big ugly star
  public static void multistar(Turtle t, int n, double length){
    t.delay(5);
    //this is like a self-similar thing
    for(int i = 0; i < n; i++){
    t.forward(length);
    a_cute_star(t, n,length/4);
    t.backward(length);
    t.left(360.0/n);
    t.pendown();
    }
  }
}
