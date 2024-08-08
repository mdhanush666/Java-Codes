import java.util.Scanner;
public class oop_ex_1_scanner {

    void cal_area(int h,int w){
        int a  = h*w;
        System.out.println("Area is : " + a + "cm");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        oop_ex_1_scanner a1  = new oop_ex_1_scanner();

        int h,w;

        System.out.print("Enter the Height : ");
        h = scan.nextInt();

        System.out.print("Enter the Width : ");
        w = scan.nextInt();

        a1.cal_area(h,w);

    }
}
