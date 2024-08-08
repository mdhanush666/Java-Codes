import java.util.Arrays;
import java.util.Scanner;

public class insert_specific_index {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a[] = {12,45,97,15,99,76,66,35,25,89};

        System.out.println("Arrays Elements are : " + Arrays.toString(a));
        System.out.println();

        System.out.print("Enter the index   : ");
        int index = scan.nextInt();
        System.out.print("Enter the Value   : ");
        int value = scan.nextInt();

        for (int i =a.length - 1; i > index - 1 ; i--) {
            a[i] = a[i - 1];
        }
        System.out.println();

        a[index -1] = value;
        System.out.println("Arrays Elements are : " + Arrays.toString(a));
        System.out.println();

    }
}
