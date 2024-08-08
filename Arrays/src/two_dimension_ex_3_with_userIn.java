import java.util.Scanner;

public class two_dimension_ex_3_with_userIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rows,cols;

        System.out.print("Enter the Rows Count      : ");
        rows = scan.nextInt();
        System.out.print("Enter the Column Count    : ");
        cols = scan.nextInt();

        System.out.println();

        int a[][] = new int[rows][cols];

        // set value
        for (int i = 0; i < rows; i++) {
            System.out.println(i+1 + " Row.. ");

            for (int j = 0; j < cols ; j++) {

                System.out.println(j+1 + " Column.. ");

                System.out.print("Enter the Value   : ");
                a[i][j] = scan.nextInt();

            }
            System.out.println();
        }

        // Print in for loop

//        for (int i = 0; i < rows; i++) {
//
//            for (int j = 0; j < cols ; j++) {
//                System.out.print(" " + a[i][j]);
//            }
//            System.out.println();
//        }

        // Print in enhanced for loop
        for(int ele[] : a){
            for (int i : ele){
                System.out.print(" " + i);
            }
            System.out.println();
        }


    }
}
