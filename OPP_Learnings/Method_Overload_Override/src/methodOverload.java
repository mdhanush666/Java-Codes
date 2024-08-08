
class addition{

    int add(int a, int b){
        System.out.println((a + b));
        return a + b;
    }

    int add(int a, int b, int c){
        System.out.println((a + b + c));
        return a + b + c;
    }

    int add(int a, int b, int c, int d){
        System.out.println((a + b + c + d));
        return a + b + c + d;
    }

}

public class methodOverload {
    public static void main(String[] args) {

        addition o1 = new addition();

        o1.add(10,20);
        o1.add(10,20,30);
        o1.add(10,20,30,40);


    }
}
