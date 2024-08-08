import java.util.Scanner;

public class deci_to_binary_method {

    public static void deci2bin(int n){

        int  i = 0,reminder,temp = 0,printN = n;

        while (n != 0){

            reminder = n % 10;
            temp += (reminder * Math.pow(2,i));
            n = n / 10;
            i++;
        }

        System.out.println(" Binary of " + printN + " = " + temp);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Decimal value to find it's Binary : ");
        int in = scan.nextInt();

        deci2bin(in);

    }
}
