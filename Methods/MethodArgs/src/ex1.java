public class ex1 {

    static void getNames(String... names){
        int i=1;

        for(String ele : names){
            System.out.println("Name " + i + " : " + ele);
            i++;
        }
    }

    public static void main(String[] args) {

        // Method with Varargs

        getNames("Tom","Jerry","Ben","Keven");



    }
}
