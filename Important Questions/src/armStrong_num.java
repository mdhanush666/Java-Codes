public class armStrong_num {
    public static void main(String[] args) {

        int n = 101, remain = 0,temp=0;
        int pN = n;

        while (n != 0){
            remain = n % 10;
            temp += (remain * remain * remain);
            n = n / 10;
        }
        System.out.println(temp);

        if (pN == temp){
            System.out.println(pN + " is a Armstrong Number");
        }
        else {
            System.out.println(pN + "  not a Armstrong Number");
        }



    }
}
