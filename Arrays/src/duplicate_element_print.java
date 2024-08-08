import java.util.Arrays;

public class duplicate_element_print {
    public static void main(String[] args) {

        int a[] = {10,20,30,90,50,50,60,10,80,90};

        System.out.println("Before Check : " + Arrays.toString(a));
        System.out.println();

        System.out.println("Duplicate Elements are  : ");
        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j <a.length ; j++) {

                if (a[i] == a[j]){
                    System.out.print(a[i] + ", ");
                }
            }
        }

    }
}
