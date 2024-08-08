public class strongNum_1_999 {
    public static void main(String[] args) {

        int f = 1, sum = 0, pn, reminder;

        for (int i = 1; i < 1000 ; i++) {

            int j = i;
            while (j != 0){

                reminder = j % 10;
                for (int k = 1; k <= reminder ; k++) {
                    f *= k;
                }
                sum += f;
                f = 1;

                j = j / 10;

            }

            if (sum == i){
                System.out.println(i + " is a Strong Number");
            }
            sum = 0;

        }

    }
}
