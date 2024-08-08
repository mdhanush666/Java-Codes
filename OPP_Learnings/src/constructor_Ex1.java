public class constructor_Ex1 {

    private int length,width;

    constructor_Ex1(){
        System.out.println("Constructor Called");
        length = 10;
        width = 5;
    }

    // Setter

    void setLength(int l){
        if (l > 0) {
            length = l;
        }
        else{
            length = 0;
        }
    }

    void setWidth(int w){
        if(w > 0) {
            width = w;
        }
        else {
            width = 0;
        }
    }


    // Getter

    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }

    double calArea (){
        double a = length * width;
        return a;
    }


    public static void main(String[] args) {

        constructor_Ex1 c1 = new constructor_Ex1();

        System.out.println("Area is : " + c1.calArea());

    }

}
