public class pattern1 {
    public static void main(String[] args) {

        System.out.println();

        for (int i = 0; i < 5; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();



        for (int i = 0; i < 5 ; i++) {

            int n = 8;

            for (int j = i; j <5 ; j++) {
                System.out.print(n + " ");
                n--;
            }
            System.out.println();
        }


    }
}
