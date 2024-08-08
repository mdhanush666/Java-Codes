
class complex{

    private int real,img;

    public complex(){
        real = 6;
        img = 1;
    }

    public complex(int x, int y){
        this.real = x;
        this.img = y;
    }

    public complex(complex o2){ // Copy constructor
        real = o2.real;
        img = o2.img;
    }

    void out(){
        System.out.println("("+ real + "+" + img + "i" +")");
    }


}

public class copyConstructor {

    public static void main(String[] args) {

        complex o1 = new complex();
        o1.out();

        complex o2 = new complex(10,50);
        o2.out();

        complex o3 = new complex(o2);
        System.out.print("Copy Constructor : ");
        o3.out();



    }

}
