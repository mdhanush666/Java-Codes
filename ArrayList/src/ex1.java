
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<String>();

        names.add("Dhanush");
        names.add("Tom");
        names.add("Jerry");
        names.add("Ben");
        names.add("kevin");

        System.out.println(names);

        System.out.println();

        for (String ele : names){
            System.out.println(ele);
        }

        System.out.println();

        System.out.println("2 index is : " + names.get(2));

    }
}
