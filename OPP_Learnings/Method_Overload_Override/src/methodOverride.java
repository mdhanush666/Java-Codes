

class Vehicle{
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{

    @Override
    void run() {
        System.out.println("Bike is running safely");
    }

}

public class methodOverride {
    public static void main(String[] args) {

        Vehicle o1 = new Bike();

        o1.run();

    }
}
