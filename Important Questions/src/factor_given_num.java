public class factor_given_num {
    public static void main(String[] args) {

        int n = 8;

        for (int i = 1; i <= n ; i++) {

            if(n % i == 0){
                System.out.println(i);
            }
        }

    }
}
