import java.util.Scanner;
import java.util.Arrays;

public class ex_1 {

    public static int []arr(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Limit : ");
        int l = scan.nextInt();

        int a[] = new int[l];

        for (int i = 0; i < l; i++) {

            System.out.print("Enter " + (i+1) + " Value : ");
            a[i] = scan.nextInt();
        }

         Arrays.sort(a);

        return a;

    }

    public static void main(String[] args) {

        int array[] = arr();

        for (int ele : array){
            System.out.print(ele + " ");
        }

    }
}
