public class two_dimension_ex_2 {
    public static void main(String[] args) {

        int [][]a = new int[2][3];

        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;

        a[1][0] = 40;
        a[1][1] = 50;
        a[1][2] = 60;

        /*
        *       10,20,30
        *       40,50,60
        *
        * */

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j <= a.length ; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

    }
}
