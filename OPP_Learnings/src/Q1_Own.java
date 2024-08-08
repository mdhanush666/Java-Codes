import java.util.Scanner;

public class Q1_Own {

    int t=0,c=1;
    double avg;

    double calAverage(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many marks you going to enter : ");
        int mC = scan.nextInt();

        for (int i = 0; i < mC; i++) {
            System.out.print("Enter the " + c + " Number : ");
            t += scan.nextInt();
            c++;
        }
        System.out.println();

        avg = t / mC;

        System.out.println("Total     : " + t);
        System.out.println("Average   : " + avg);
        return avg;
    }

    char calGrade () {

        if (avg >= 90) {
            System.out.println("Grade is  : " + 'A');
            return 'A';
        } else if (avg > 80 && avg < 89) {
            System.out.println("Grade is  : " + 'B');
            return 'B';
        } else if (avg > 70 && avg < 79) {
            System.out.println("Grade is  : " + 'C');
            return 'C';
        } else if (avg > 60 && avg < 69) {
            System.out.println("Grade is  : " + 'D');
            return 'D';
        } else {
            System.out.println("Grade is  : " + 'F');
            return 'F';
        }
    }

    public static void main(String[] args) {

        Q1_Own c1 = new Q1_Own();

        c1.calAverage();
        c1.calGrade();

    }
}
