public class primeNumbers_100_999 {
    public static void main(String[] args) {

        int c=0;

        for (int i = 100; i < 1000; i++) {

            for (int j = 1; j <= i ; j++) {

                if(i % j == 0){
                    c++;
                }
            }

            if(c==2){
                System.out.println(i + " is a Prime Number");
            }
            c =0;

        }

    }
}
