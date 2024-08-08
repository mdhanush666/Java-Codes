
class Student{

    private int st_ID;
    private String st_name;

    Student (int ID, String name){
        st_ID = ID;
        st_name = name;
    }

    void print(){
        System.out.println("Student ID is   : " + st_ID);
        System.out.println("Student Name is : " + st_name);
        System.out.println("_______________________________________________");
    }

}

public class arrayObject {

    public static void main(String[] args) {

        Student [] o1 = new Student[5];

        o1[0] = new Student(1001,"Dhanush");
        o1[1] = new Student(1002,"Kabil");
        o1[2] = new Student(1003,"Jaya");
        o1[3] = new Student(1004,"Manomohan");
        o1[4] = new Student(1005,"Sindhuja");

        for (int i = 0; i < o1.length; i++) {
            o1[i].print();
        }

    }
}
