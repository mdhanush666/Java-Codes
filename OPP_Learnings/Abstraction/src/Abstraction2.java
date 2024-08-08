package Notes.OOP;


abstract class Shape{      // Abstract class 

  abstract void draw();    // Abstract method 
  abstract void msg();    // Abstract method 

}

class Circle extends Shape{

  @Override
  void draw(){
    System.out.println("Draw a Circle");
  }

  @Override
  void msg(){
    System.out.println("I am Circle ");
  }

}

class Rectangle extends Shape{

  @Override
  void draw(){
    System.out.println("Draw a Rectangle");
  }

  @Override
  void msg(){
    System.out.println("I am Rectangle");
  }

}

public class Abstraction2 {
  public static void main(String[] args) {

    /*
     *  Abstraction is a concept of OOP programming that SHOWS only the essential
     *  attribute and HIDE unecessary information.
     *  
     *  Here is a example..
     *   
     */

     Shape c1 = new Circle();

     Shape r1 = new Rectangle();
     
     c1.draw();
     c1.msg();

     System.out.println("----------------------------");

     r1.draw();
     r1.msg();


  }
  
}
