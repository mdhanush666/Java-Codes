public class even_odd_Count {

    public static void main(String[] args) {

        int c_o = 0, c_e = 0;
        int a[] = {10,2,8,46,7,11,25,6,24,25};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0){
                c_e++;
            }
            else {
                c_o++;
            }
        }

        System.out.println("Total Count of Even Numbers is  : " + c_e);
        System.out.println("Total Count of Odd Numbers is   : " + c_o);

    }

}
