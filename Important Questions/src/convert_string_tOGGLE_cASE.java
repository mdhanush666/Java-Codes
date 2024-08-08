public class convert_string_tOGGLE_cASE {
    public static void main(String[] args) {

        StringBuffer a = new StringBuffer("Manomohan Dhanush");

        for (int i = 0; i < a.length() ; i++) {

            if (a.charAt(i) >= 97 && a.charAt(i) <= 122){
                int tc = a.charAt(i) - 32;
                a.setCharAt(i,(char)tc);
            }
        }

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(0) >= 65 && a.charAt(0) <= 90){
                int tc = a.charAt(i) + 32;
                a.setCharAt(i,(char)tc);
            }

            if (a.charAt(i) == 32){
                if (a.charAt(i+1) >= 65 && a.charAt(i+1) <= 90){
                    int tc = a.charAt(i+1) + 32;
                    a.setCharAt(i+1,(char)tc);
                }
            }

        }



        System.out.println(a);

    }
}
