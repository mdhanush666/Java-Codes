import java.util.Scanner;

class StudentIn {
    private int stu_ID;
    private String stu_name;

    StudentIn(int ID, String name){
        this.stu_ID = ID;
        this.stu_name = name;
    }

    void print(){
        System.out.println("ID is       : " + stu_ID);
        System.out.println("Name is     : " + stu_name);
        System.out.println("................................." );
    }
}

public class arrayObject_input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many Data you going to enter    : ");
        int tC = scan.nextInt();

        System.out.println();

        StudentIn []a1 = new StudentIn[tC];

        // data setting loop

        for (int i = 0; i < a1.length; i++) {

            System.out.print("Enter the " + (i+1) + " Student ID    : ");
            int id = scan.nextInt();

            System.out.print("Enter the " + (i+1) + " Student Name  : ");
            String name = scan.next();
            System.out.println();

            a1[i] = new StudentIn(id,name);

        }

        // data getting loop

        for (int i = 0; i < a1.length; i++) {
            a1[i].print();
        }

    }
}
