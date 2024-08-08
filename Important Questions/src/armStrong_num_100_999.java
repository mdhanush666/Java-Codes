public class armStrong_num_100_999 {

    public static void main(String[] args) {

        int remain = 0, temp = 0;

        for (int i = 100; i < 1000; i++) {

            int j = i;

            while (j != 0){

                remain = j % 10;
                temp += (remain * remain * remain);
                j = j / 10;
            }

            if (temp == i){
                System.out.println(i + " is a Armstrong Number");
            }
            temp = 0;

        }

    }

}
