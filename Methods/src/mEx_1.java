
class learn1 {

    //  No Return without Parameters
    public void add(){
        int a = 10;
        int b = 2;
        System.out.println("Addition    : " + (a+b));
    }

    //  No Return with Parameters
    public void sub(int a, int b){
        System.out.println("Subtraction    : " + (a-b));
    }

    //  Return without Parameters
    public int mul(){
        int a = 10;
        int b = 2;
        return a * b;
    }

    //  Return with Parameters
    public double div(int a, int b ){
        return a / b;
    }

}

public class mEx_1 {

    public static void main(String[] args) {

        learn1 c1 = new learn1();

        c1.add();
        c1.sub(10,2);

        System.out.println();

        System.out.println("Multiplication  : " + c1.mul());
        System.out.println("Division        : " + c1.div(10,2));

    }
}
