public class reverse_N_digits_num {
    public static void main(String[] args) {

        int n = 123,remain=0,temp=0;

        while (n != 0){

            remain = n % 10;
            //System.out.println(temp);
            temp = (temp * 10) + remain ;
            n = n / 10;

        }

        System.out.println(temp);

    }
}
