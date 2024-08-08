import java.util.Arrays;

public class decimal_to_binary {

    public static void main(String[] args) {

        int n = 45,i = 0;
        int temp[] = new int[n];

        while (n != 0){

            temp[i] = n % 2;
            n = n / 2;
            i++;
        }


        for (int j = i-1; j>=0; j--) {
            System.out.print(temp[j]);
        }





    }
}
