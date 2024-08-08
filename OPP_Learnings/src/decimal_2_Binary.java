import java.util.Arrays;

public class decimal_2_Binary {

    static void deci2binary(int n){
        int a[] = new int[500];
        int i = 0;

        for (;n > 0 ; i++) {
            a[i] = n % 2;
            n = n / 2;
        }

        //System.out.println(i);
        for (int j = i -1; j >=0 ; j--) {
            System.out.print(a[j]);
        }
    }

    public static void main(String[] args) {

        // Program to convert decimal number into binary number

        deci2binary(48);

    }

}
