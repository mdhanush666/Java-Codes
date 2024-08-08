public class paper_2017_Ques5_3 {
    public static void main(String[] args) {

        int n = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
            n = 1;
        }

    }
}
