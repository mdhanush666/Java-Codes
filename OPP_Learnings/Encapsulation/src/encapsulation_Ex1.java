
class Person{

    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

}

public class encapsulation_Ex1 {
    public static void main(String[] args) {

        Person obj1 = new Person();

        obj1.setName("Dhanush");
        obj1.setAge(19);

        System.out.println("Name is : " + obj1.getName());
        System.out.println("Age is  : " + obj1.getAge());

    }
}
