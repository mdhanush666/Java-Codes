public class strongNum {
    public static void main(String[] args) {

        int n =145, f = 1, pn = n, remind,sum = 0;

        while(n != 0) {

            remind = n % 10;

            for (int i = 1; i <= remind; i++) {
                f *= i;
            }
            sum += f;
            f = 1;

            n = n / 10;
        }

        if (sum == pn){
            System.out.println(pn + " is a Strong Number");
        }
        else{
            System.out.println(pn + " is not a Strong Number");
        }

    }
}
