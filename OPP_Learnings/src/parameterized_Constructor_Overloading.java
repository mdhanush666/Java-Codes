
// Parameterized Constructor and Constructor Overloading

public class parameterized_Constructor_Overloading {

        private float length,width;

    parameterized_Constructor_Overloading(float l, float w){    // Parameterized Constructor
            length = l;
            width = w;
        }

    parameterized_Constructor_Overloading(float x){
            length = width = x;
        }

    parameterized_Constructor_Overloading(){
            length = 10;
            width = 7;
        }

        double calA(){
        return length * width;
        }

    public static void main(String[] args) {

        parameterized_Constructor_Overloading c1 = new parameterized_Constructor_Overloading();

        System.out.println("Area is : " + c1.calA());

        parameterized_Constructor_Overloading c2 = new parameterized_Constructor_Overloading(10,8);

        System.out.println("Area is : " + c2.calA());

        parameterized_Constructor_Overloading c3 = new parameterized_Constructor_Overloading(5);

        System.out.println("Area is : " + c3.calA());

    }

}
