public class perfectNumber_1_999 {
    public static void main(String[] args) {

        int temp = 0;

        for (int i = 1; i < 1000 ; i++) {

            for (int j = 1; j < i ; j++) {

                if(i % j == 0){
                    temp += j;
                }

            }

            if (temp == i){
                System.out.println(i + " is a Perfect Number");
            }

            temp = 0;

        }

    }
}
