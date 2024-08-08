import java.util.Locale;

public class convert_string_lower_upper {
    public static void main(String[] args) {

        String name = "manomohan dhanush ";

        name = name.trim();
        StringBuffer buff = new StringBuffer(String.valueOf(name));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        for (int i = 0; i < name.length() ; i++) {

            if (buff.charAt(0) >= 97 && buff.charAt(0) <= 122 ) {
                int tc = buff.charAt(0) - 32;
                buff.setCharAt(0,(char)tc);
            }

            if(buff.charAt(i) == 32 && buff.charAt(i+1) >= 90 && buff.charAt(i+1) <= 122){
                int tc = buff.charAt(i+1) - 32;
                buff.setCharAt(i+1,(char)tc);
            }
        }

        System.out.println(buff);


    }
}
