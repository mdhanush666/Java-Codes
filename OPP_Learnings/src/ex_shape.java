import java.util.Scanner;

public class ex_shape extends shape{

    double square(double w, double h){
        return calArea(w,h);
    }

    double circle(double pi, double r){
        return calArea(pi,r*r);
    }

    public static void main(String[] args) {

        ex_shape c2 = new ex_shape();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Width For Square : ");
        double s_w = scan.nextDouble();

        System.out.print("Enter the Heigth For Square : ");
        double s_h = scan.nextDouble();

        System.out.println("Square Area is : " + c2.square(s_w,s_h));

        System.out.println("Enter the Radius For Circle : ");
        double c_r = scan.nextDouble();

        double pi = 3.14;

        System.out.println("Circle Area is : " + c2.circle(pi,c_r));

    }

}
