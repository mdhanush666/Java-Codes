
class Animal{
    void AniSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    @Override
    void AniSound(){
        System.out.println("Bow");
    }
}

public class polymorphism_Ex {
    public static void main(String[] args) {

        Animal o1 = new Dog();

        o1.AniSound();

    }
}
