public class factorial {

    public static void main(String[] args) {

        int n = 5,f=1;

        while (n!=0){
            f *= n;
            n--;
        }


        System.out.println(f);

    }
}
