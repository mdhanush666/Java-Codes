public class primeNumber {
    public static void main(String[] args) {

        int n = 8,c=0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0){
                c++;
            }
        }

        if (c == 2){
            System.out.println(n + " is a Prime Number");
        }
        else {
            System.out.println(n + " is not a Prime Number");
        }

    }
}
