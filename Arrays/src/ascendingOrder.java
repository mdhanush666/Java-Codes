import java.util.Arrays;

public class ascendingOrder {
    public static void main(String[] args) {

        int a[] = {54,41,48,67,12,43,6,5,78,66};
        int temp = 0;

        System.out.println("Before Ascending Order : " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }

        System.out.println("After Ascending Order  : " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {

                if (a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("After Descending Order  : " + Arrays.toString(a));

    }
}
