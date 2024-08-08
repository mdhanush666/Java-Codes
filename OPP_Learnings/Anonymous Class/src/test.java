
abstract class demoTest{
    abstract void testPrint();
}

class testDemo{
    testDemo(){
        demoTest o1 = new demoTest(){
            @Override
            void testPrint(){
                System.out.println("Test Pass");
            }
        };
        o1.testPrint();
    }
}


public class test {
    public static void main(String[] args) {

        testDemo obj1 = new testDemo();

    }
}
