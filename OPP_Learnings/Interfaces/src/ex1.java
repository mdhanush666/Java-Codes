
interface animal{
    void sleep();
    void eat();
}

interface aniColor{

    void myColor();

}

class Dog implements animal,aniColor{

    @Override
    public void sleep(){
        System.out.println("I am Sleeping");
    }

    @Override
    public void eat(){
        System.out.println("I am Eating");
    }

    @Override
    public void myColor(){
        System.out.println("I am Black");
    }

}

public class ex1 {
    public static void main(String[] args) {

        Dog o1 = new Dog();
        o1.sleep();
        o1.eat();

        System.out.println();

        o1.myColor();

    }
}
