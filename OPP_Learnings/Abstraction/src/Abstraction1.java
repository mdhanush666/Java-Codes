
abstract class Shape{
	
	abstract void draw();
	abstract void msg();
	
}

class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Draw a Circle");
	}
	
	@Override
	void msg() {
		System.out.println("I'm a Circle");
	}
	
}

public class Abstraction1 {

	public static void main(String[] args) {
		
		/*
		 * 		Abstraction is a concept of OOP programming, that SHOWS  only the essential
		 * 		attributes and HIDES the unnecessary informations.  
		 * 
		 * */
		
		Shape obj1 = new Circle();
		
		obj1.draw();
		obj1.msg();

	}

}
