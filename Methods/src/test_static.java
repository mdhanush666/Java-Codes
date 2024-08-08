
public class test_static {

    //  No Return without Parameters
    public static void add(){
        int a = 10;
        int b = 2;
        System.out.println("Addition    : " + (a+b));
    }

    //  No Return with Parameters
    public static void sub(int a, int b){
        System.out.println("Subtraction    : " + (a-b));
    }

    //  Return without Parameters
    public static int mul(){
        int a = 10;
        int b = 2;
        return a * b;
    }

    //  Return with Parameters
    public static double div(int a, int b ){
        return a / b;
    }

    public static void main(String[] args) {

        add();
        sub(10,2);

        System.out.println();

        System.out.println("Multiplication  : " + mul());
        System.out.println("Division        : " + div(10,2));

    }
}
