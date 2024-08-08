import java.util.Arrays;

public class first_arrays_syntax {
    public static void main(String[] args) {

        // 1 method
        int a[] = {1,2,3,4,5};

        // 2 method
        int []a2 = {5,4,3,2,1};

//         3 method
//        int a3[];
//        a3 = new int[] {1,2,3,4,5,6,7,8,9,10};

        // int 3 method
        int a3[] = new int[5];

        a3[0] = 1;
        a3[1] = 2;
        a3[2] = 3;
        a3[3] = 4;
        a3[4] = 5;

        System.out.println("1st Array " + Arrays.toString(a));
        System.out.println();

        System.out.println("2nd Array " + Arrays.toString(a2));
        System.out.println();

        System.out.println("3rd Array " + Arrays.toString(a3));
        System.out.println();


    }
}
