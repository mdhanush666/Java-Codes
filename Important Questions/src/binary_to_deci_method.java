import java.util.Scanner;

public class binary_to_deci_method {
    public static void bin2deci(int n){

        int temp[] = new int[n], i = 0;

        while (n != 0){
            temp[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i-1; j >= 0 ; j--) {
            System.out.print(temp[j]);
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Binary value to find it's Decimal Number : ");
        int in = scan.nextInt();

        bin2deci(in);

    }


}

