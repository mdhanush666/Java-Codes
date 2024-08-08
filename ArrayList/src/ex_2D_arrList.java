
import java.util.ArrayList;

public class ex_2D_arrList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> grocery = new ArrayList<>();

        ArrayList<String> products = new ArrayList<>();
        products.add("Peper");
        products.add("Dhal");
        products.add("Rice");

        System.out.println("Products : " + products);
        System.out.println();

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("MountainDew");
        drinks.add("Soda");
        drinks.add("7Up");

        System.out.println("Drinks : " + drinks);
        System.out.println();

        grocery.add(products);
        grocery.add(drinks);

        System.out.println("Grocery : " + grocery);
        System.out.println();

    }
}
