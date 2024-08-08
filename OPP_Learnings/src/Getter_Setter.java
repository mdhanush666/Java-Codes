
// Data Hiding Getter and Setter in Java

class ex_g_s{
    private int length,width;

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
        return length * width;
    }
}

public class Getter_Setter {

    public static void main(String[] args) {

        ex_g_s c1 = new ex_g_s();

        c1.setLength(10);
        c1.setWidth(20);

        System.out.println("Length is : " + c1.getLength());
        System.out.println("Width is  : " + c1.getWidth());
        System.out.println("Area is   : " + c1.calArea());

    }

}
