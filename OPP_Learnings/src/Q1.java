import java.util.Scanner;

public class Q1 {

    double avg;

    double calAvg(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1 Marks : ");
        int m1 = scan.nextInt();
        System.out.print("Enter the 2 Marks : ");
        int m2 = scan.nextInt();
        System.out.print("Enter the 3 Marks : ");
        int m3 = scan.nextInt();
        System.out.println();

        avg = (m1 + m2 + m3) / 3;
        System.out.println("Average is : " + avg);
        return avg;
    }

    char calGrade (){

        if (avg >= 90) {
            System.out.println("Grade is : " + 'A');
            return 'A';
        }
        else if(avg >80 && avg < 89){
            System.out.println("Grade is : " + 'B');
            return 'B';
        }
        else if(avg >70 && avg < 79){
            System.out.println("Grade is : " + 'C');
            return 'C';
        }
        else if(avg >60 && avg < 69){
            System.out.println("Grade is : " + 'D');
            return 'D';
        }
        else{
            System.out.println("Grade is : " + 'F');
            return 'F';
        }

    }

    public static void main(String[] args) {


        Q1 c1 = new Q1();

        c1.calAvg();
        c1.calGrade();

    }
}
