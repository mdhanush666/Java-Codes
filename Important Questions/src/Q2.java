import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0, c=1;
        float avg;

        System.out.print("Enter how many numbers : ");
        int cN = scan.nextInt();

        for (int i = 0; i < cN; i++) {

            System.out.print("Enter the "+ c +" Number : ");
            sum += scan.nextInt();
            c++;

        }
        avg = sum / cN;

        System.out.println("Sum is      : " + sum);
        System.out.println("Average is  : " + avg);

    }

}
