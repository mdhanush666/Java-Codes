public class jaggedArray_ex_1 {
    public static void main(String[] args) {

        int a[][] =
                {
                        {10,20,30},
                        {10,20},
                        {10,20,30}
                };

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

    }
}
