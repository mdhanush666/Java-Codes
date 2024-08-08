public class fibonacci_series {

    public static void main(String[] args) {

        int n = 8,a = -1,b = 1,c;

        for (int i = 0; i < n; i++) {

            c = a + b;  // 0    // 1    // 1    // 2    // 3    // 5    // 8    // 13
            System.out.println(c);  // 0    // 1    // 1    // 2    // 3    //5 // 8    // 13
            a = b;  // 1    // 0    // 1    // 1    // 2    // 3    // 5    // 8
            b = c;  // 0    // 1    // 1    // 2    // 3    // 5    // 8    // 13

        }

    }

}
