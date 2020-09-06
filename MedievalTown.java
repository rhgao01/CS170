public class MedievalTown {

  public static void main(String[] args){
    Turtle roo = new Turtle();
    town(roo,10);
  }

  /*moving stater point*/
  public static void move(Turtle t, double a, double b,double unit){
    t.penup();
    t.forward(a*unit);
    t.left(90);
    t.forward(b*unit);
    t.right(90);
    t.penup();
  }

  /*STAR*/
  public static void star(Turtle t, double unit){
    t.pendown();
    onestar(t, 1, unit);
    t.penup();
  }
  public static void onestar(Turtle t, double radius, double unit){
    for(int i = 0; i < 8; i++){
    t.forward(radius*unit);
    t.penup();
    t.backward(radius*unit);
    t.left(45);
    t.pendown();
    }
  }//method to draw one star


  /*HILL*/
  public static void hill(Turtle t, double unit){
    t.pendown();
    slope(t, 16, 8, unit);
    slope(t, 6, (-12),unit);
    t.penup();
    t.backward(22*unit);
    t.left(90);
    t.forward(4*unit);
    t.right(90);
  }//draw a integrated hill with a set unit
  public static void slope(Turtle t, double width, double height, double unit){
    t.left(Math.toDegrees(Math.atan(height/width)));
    t.forward(Math.hypot(width,height)*unit);
    t.right(Math.toDegrees(Math.atan(height/width)));
  }//method to draw any slope with given width and height



  /*TREE*/
  //method to draw a Tree
  public static void tree(Turtle t, double unit){
    t.pendown();
    t.left(90);
    t.forward(4*unit);
    for (int i = 0; i < 5; i++){
      t.left(90);
      slope(t, 1, 1, unit);
      t.penup();
      t.backward(unit);
      t.right(90);
      t.forward(unit);
      t.pendown();
      t.right(90);
      slope(t, 1, (-1), unit);
      t.penup();
      t.backward(unit);
      t.left(90);
      t.forward(unit);
      t.pendown();
      t.backward((0.5)*unit);
    }
    t.backward((1.5)*unit);
    t.right(90);
  }

  /*TOWER*/
  public static void tower(Turtle t, double unit){
    t.penup();
    t.left(90);
    t.forward(10*unit);
    t.right(90);
    t.pendown();
    outside(t,unit);
    inside(t,unit);
    t.penup();
    t.backward(unit);
    t.right(90);
    t.forward(3*unit);
    t.left(90);
    t.penup();
  }
  public static void square(Turtle t, double unit){
    for (int i = 0; i < 4 ; i++) {
      t.forward(unit);
      t.right(90);
      t.forward(unit);
      t.right(90);
      t.forward(unit);
      t.right(90);
      t.forward(unit);
      t.right(90);
    }
  }//little squre
  public static void outside(Turtle t, double unit){
    //downer part
    t.right(90);
    t.forward(10*unit);
    t.left(90);
    t.forward(5*unit);
    t.left(90);
    t.forward(10*unit);
    t.right(90);
    //upper part
    slope(t, 2, 1, unit);
    t.left(90);
    t.forward(1*unit);
    //saw part
      //repeating part
    sawrepeat(t, unit) ;
    //end part
    t.forward(1*unit);
    t.left(90);
    t.forward(1*unit);
    t.left(90);
    t.forward(2*unit);
    t.left(90);
    slope(t, 2, (-1), unit);
  }//outside of the tower
  public static void inside(Turtle t, double unit){
    t.penup();
    t.forward(unit);
    t.right(90);
    t.forward(unit);
    t.pendown();
    t.left(90);
    for (int i = 0; i < 3; i++){
      square(t,unit);
      t.penup();
      t.forward(2*unit);
      t.pendown();
      square(t,unit);
      t.penup();
      t.backward(2*unit);
      t.right(90);
      t.forward(2*unit);
      t.left(90);
      t.pendown();
    }
  }//inside of the Towers
  public static void sawrepeat(Turtle t, double unit){
    for (int i = 0; i < 4 ; i++) {
      t.forward(1*unit);
      t.left(90);
      t.forward(1*unit);
      t.left(90);
      t.forward(1*unit);
      t.right(90);
      t.forward(1*unit);
      t.right(90);
    }
  }//repeating part of the TOWER

  /*ARCH*/
  public static void arch(Turtle t,double unit){

    t.penup();
    t.left(90);
    t.forward(3*unit);
    t.right(90);
    t.forward(unit);
    t.pendown();

    semicircle(t,1,unit);

    t.penup();
    t.backward(3*unit);
    t.pendown();
    semicircle(t,2,unit);

    t.right(90);

    t.forward(3*unit);
    t.right(90);
    t.forward(unit);
    t.right(90);
    t.forward(3*unit);

    t.penup();
    t.right(90);
    t.backward(2*unit);
    t.right(90);
    t.pendown();

    t.forward(3*unit);
    t.right(90);
    t.forward(unit);
    t.right(90);
    t.forward(3*unit);

    t.penup();
    t.backward(3*unit);
    t.right(90);

  }
  public static void semicircle(Turtle t, double happyradius, double unit){
    t.left(90);
    for (int i = 0; i< 180; i++){
    t.right(1);
    t.forward(2*happyradius*unit*Math.sin(Math.toRadians(0.5)));
    }
    t.left(90);
  }//draw a semi-circle

  /*WALL*/
  public static void walls(Turtle t, double unit) {
    t.pendown();
    horizontal_lines(t,unit);
    t.left(90);
    t.penup();
    t.backward(4*unit);
    t.pendown();


    for (int i = 0; i < 8; i++){
      up(t,unit,4);
      t.penup();
      t.backward((3.5)*unit);
      t.right(90);
      t.forward((0.5)*unit);
      t.left(90);
      t.pendown();
      up(t,unit,3);
      t.penup();
      t.right(90);
      t.forward((0.5)*unit);
      t.left(90);
      t.backward((3.5)*unit);
      t.pendown();
    }
      up(t,unit,4);
      t.penup();
      t.backward(4*unit);
      t.right(90);
      t.backward(8*unit);
  }
  public static void horizontal_lines(Turtle t,double unit){
    for (int i=0; i<8; i++){
      t.forward(8*unit);
      t.penup();
      t.backward(8*unit);
      t.left(90);
      t.forward((0.5)*unit);
      t.right(90);
      t.pendown();
    }
  }//horizontal repeats
  public static void up(Turtle t,double unit, int numDashes){
    for (int i=0; i<numDashes; i++){
      t.forward((0.5)*unit);
      t.penup();
      t.forward((0.5)*unit);
      t.pendown();
    }
  }//vertical repeats

//OVERALL!!!!!!!!
  public static void town(Turtle t, double unit){

    //get started
    t.delay(0);
    t.penup();
    t.backward(300);
    t.left(90);
    t.backward(100);
    t.right(90);

    // a tower at (8,2)
    move(t, 8, 2, unit);
    tower(t,unit);

    //a wall  (13,2)
    move(t, 5, 0, unit);
    walls(t,unit);

    //an arch (21,2)
    move(t, 8, 0, unit);
    arch(t,unit);

    //wall(4,0)
    move(t, 4, 0, unit);
    walls(t,unit);

    // tower (8,2)
    move(t, 8, 0, unit);
    tower(t,unit);

    //arch (7,3)
    move(t, 7, 3, unit);
    arch(t,unit);

    //arch (5,2)
    move(t, 5, 2, unit);
    arch(t,unit);

    //arch (5,2)
    move(t, 5, 2, unit);
    arch(t,unit);

    //tree (-3,-9)
    move(t, (-3), (-9), unit);
    tree(t,unit);

    //tree (3,0)
    move(t, 3, 0, unit);
    tree(t,unit);

    //tree (3,0)
    move(t, 3, 0, unit);
    tree(t,unit);

    //tree (3,0)
    move(t, 3, 0, unit);
    tree(t,unit);

    //tree(-5,4)
    move(t, (-5), 4, unit);
    tree(t,unit);

    //tree (3,0)
    move(t, 3, 0, unit);
    tree(t,unit);

    //tree (3,0)
    move(t, 3, 0, unit);
    tree(t,unit);

    //tree (3,0)
    move(t, 3, 0, unit);
    tree(t,unit);

    //hill (-21,15)
    move(t, (-21), 15, unit);
    hill(t,unit);

    //hill (-21,2)
    move(t, (-21), 2, unit);
    hill(t,unit);

    //hill (-18,-4)
    move(t, (-18), (-4), unit);
    hill(t,unit);

    //rest of the Stars
    //(44,11)
    move(t, 44, 11, unit);
    star(t,unit);
    //(8,5)
    move(t,8 ,5 , unit);
    star(t,unit);
    //(-14,1)
    move(t,(-14) ,1 , unit);
    star(t,unit);
    //(-13,-5)
    move(t, (-13), (-5), unit);
    star(t,unit);
    //(-4,7)
    move(t, (-4), 7, unit);
    star(t,unit);
    //(-8,-3)
    move(t, (-8), (-3), unit);
    star(t,unit);
    //(-4,-4)
    move(t, (-4), (-4), unit);
    star(t,unit);
    //(-4,4)
    move(t, (-4), 4, unit);
    star(t,unit);














  }



}
