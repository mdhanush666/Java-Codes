public class binary_to_decimal {

    public static void main(String[] args) {

        int n = 101101,i = 0, reminder,temp = 0;
        int printN = n;

        while (n != 0){

            reminder = n % 10;
            temp += (reminder * Math.pow(2,i));
            n = n / 10;
            i++;

        }

        System.out.println(printN + " Binary is : " + temp);


    }

}
