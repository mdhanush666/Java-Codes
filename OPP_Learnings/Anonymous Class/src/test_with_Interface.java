
interface testC{
    void display();
}

class test2{
    test2(){
        testC o1 = new testC(){
            @Override
            public void display(){
                System.out.println("Test Pass in Interface");
            }
        };
        o1.display();
    }
}

public class test_with_Interface {
    public static void main(String[] args) {

        test2 obj1 = new test2();

    }
}
