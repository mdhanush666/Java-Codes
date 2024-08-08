
class Animal{

    String identify = "I'm a Animal";

    void eat(){
        System.out.println("I can eat");
    }
    void walk(){
        System.out.println("I can walk");
    }
}

class Dog extends Animal{
    Boolean bark = true;
}

public class inheritance_Ex {
    public static void main(String[] args) {

        Dog obj1 = new Dog();

        System.out.println(obj1.identify);

        System.out.println("Bark : " + obj1.bark);

        obj1.eat();
        obj1.walk();

    }
}
