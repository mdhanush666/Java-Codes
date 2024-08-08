public class two_dimension_ex_1 {

    public static void main(String[] args) {

        int a[][] =
                {
                        {10,20,30},
                        {40,50,60},
                        {70,80,90}
                };
                            // r // c
        //System.out.println(a[1][2]);


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                System.out.print(" " + a[i][j]);

            }
            System.out.println();
        }

        // printing using enhanced for loop
//        for (int ele [] : a){
//            for (int k : ele){
//                System.out.print(" " + k);
//            }
//            System.out.println();
//        }

    }

}
