
class demo{

    private int n1;
    private int n2;

    demo(int x,int y){
        n1 = x;
        n2 = y;
    }

    int largest(){
        return  n1>n2?n1:n2;
    }

    void display(){
        int pL = largest();
        System.out.println("Largest Number is   : " + pL);
    }

}

public class nested_Method {
    public static void main(String[] args) {

        demo c1 = new demo(10,50);

        c1.display();


    }
}
