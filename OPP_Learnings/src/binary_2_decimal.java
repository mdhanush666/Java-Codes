public class binary_2_decimal {

    static void bin2deci(int n){

        System.out.println("Decimal Number is : " + n);
        int temp,i=0,ans=0;

        while (n>0){
            temp = n % 10;
            ans += temp * Math.pow(2,i);
            n = n/10;
            i++;
        }

        System.out.println();
        System.out.println("Binary is : "+ ans);


    }


    public static void main(String[] args) {

        // Program to convert binary number into decimal number

        bin2deci(110000);

        //System.out.println(Math.pow(2,4));

    }
}
