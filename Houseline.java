public class Houseline {

  public static void main(String[] args) {
    Turtle dave = new Turtle();
    houseline(dave,20);
  }

  public static void houseline(Turtle t, int numHouses) {
    t.delay(0);
    for (int i=0; i<numHouses;i++){
      house(t,1+i);
      t.penup();
      t.forward(100/(1+i));
      t.pendown();
    }
  }

  public static void house(Turtle t, double factor) {
    front(t,factor);
    t.left(90);
    t.forward(80/factor);
    t.right(90);
    top(t,factor);
    t.left(90);
    t.backward(80/factor);
    t.right(90);
  }

  public static void front(Turtle t, double factor) {
    walls(t,factor);
    t.forward(30/factor);
    door(t,factor);
    t.penup();
    t.left(90);
    t.forward(50/factor);
    t.right(90);
    t.backward(20/factor);
    t.pendown();
    windows(t,factor);
    t.penup();
    t.backward(10/factor);
    t.left(90);
    t.backward(50/factor);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t, double factor) {
    roof(t,factor);
    t.penup();
    t.forward(10/factor);
    t.left(90);
    t.forward(10/factor);
    t.right(90);
    t.pendown();
    chimney(t,factor);
    t.penup();
    t.backward(10/factor);
    t.right(90);
    t.forward(10/factor);
    t.left(90);
    t.pendown();
  }

  public static void walls(Turtle t, double factor) {
    square(t, 80,factor);
  }

  public static void windows(Turtle t, double factor) {
    square(t, 20,factor);
    t.penup();
    t.forward(40/factor);
    t.pendown();
    square(t, 20,factor);
    t.penup();
    t.backward(40/factor);
    t.pendown();
  }

  public static void door(Turtle t, double factor) {
    for (int i = 0; i < 2; i++) {
      t.forward(20/factor);
      t.left(90);
      t.forward(30/factor);
      t.left(90);
    }
  }

  public static void roof(Turtle t, double factor) {
    t.forward(80/factor);
    t.left(135);
    t.forward(40 * Math.sqrt(2)/factor);
    t.left(90);
    t.forward(40 * Math.sqrt(2)/factor);
    t.left(135);
  }

  public static void chimney(Turtle t, double factor) {
    t.left(90);
    t.forward(20/factor);
    t.right(90);
    t.forward(10/factor);
    t.right(90);
    t.forward(10/factor);
    t.backward(10/factor);
    t.left(90);
    t.backward(10/factor);
    t.left(90);
    t.backward(20/factor);
    t.right(90);
  }

  public static void square(Turtle t, double x, double factor) {
    for (int i = 0; i < 4; i++) {
      t.forward(x/factor);
      t.left(90);
    }
  }

}
