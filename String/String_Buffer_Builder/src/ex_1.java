public class ex_1 {
    public static void main(String[] args) {

        StringBuffer buff = new StringBuffer("Dhanush");

        System.out.println(buff.append(" Dhanu"));                   // add text
        System.out.println(buff.insert(13," working"));     // insert text desired place
        System.out.println(buff.replace(8,13,"@@"));    // replace text desired place
        System.out.println(buff.delete(8,11));                      // delete text desired place
        System.out.println(buff.reverse());                         // reverse the text
        buff.reverse();
        System.out.println(buff.charAt(0));                         // take a character in the String
        System.out.println(buff.length());                          // length of the String
        System.out.println(buff.substring(8));                 // select text
        System.out.println(buff.substring(0,7));                   // select text with start point and end point
        buff.setCharAt(8,'W');
        System.out.println(buff);                                  // replace the character in desired place

    }
}
