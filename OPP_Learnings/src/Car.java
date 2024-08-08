
class vehicle{
    protected String brand = "Frod";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

class Car extends vehicle{
    private String modelName = "Mustang";

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.honk();

        System.out.println(c1.brand + " " + c1.modelName);

    }
}