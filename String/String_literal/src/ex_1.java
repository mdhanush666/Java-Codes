import java.util.Arrays;
import java.util.Locale;

public class ex_1 {
    public static void main(String[] args) {

        String name = "Dhanush";

        System.out.println(name.hashCode());                                // Location
        System.out.println(name.equals("DHANUSH"));                         // check equal
        System.out.println(name.equalsIgnoreCase("DHANUSH"));    // check without case
        System.out.println(name.length());                                  // check length
        System.out.println(name.charAt(0));                                 // take single character
        System.out.println(name.toUpperCase());                             // to UPPERCASE
        System.out.println(name.toLowerCase());                             // to lowercase
        System.out.println(name.replace("Ta","Dh"));         // replace
        System.out.println(name.contains("x"));                             // check whether it's available
        System.out.println(name.isEmpty());                                 // check whether it's empty
        System.out.println(name.endsWith("h"));                             // check whether it ends with.
        System.out.println(name.startsWith("T"));                           // check whether it starts with.
        System.out.println(name.substring(1));                     // select from Right to Left
        System.out.println(name.substring(0,5));                            // select from Left to Right

        System.out.println();

        char i[] = name.toCharArray();                                      // take every character's in String
        System.out.println(Arrays.toString(i));

        System.out.println();

        String name2 = " Dhanush ";
        System.out.println("Before Trim : " + name2.length());
        System.out.println("After Trim  : " + name2.trim().length());       // Remove Spaces



    }
}
