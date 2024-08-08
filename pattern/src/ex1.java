public class ex1  {

    public static void main(String[] args) {

        /*
        *       12345
        *       1234
        *       123
        *       12
        *       1
        *
        * */

        int c = 1;

        for (int i = 1; i <= 5 ; i++) {

            for (int j = i; j <= 5; j++) {

                System.out.print(c);
                c++;
            }
            System.out.println();
            c=1;
        }

    }

}
