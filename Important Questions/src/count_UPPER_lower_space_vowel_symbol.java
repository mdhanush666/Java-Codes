public class count_UPPER_lower_space_vowel_symbol {
    public static void main(String[] args) {

        StringBuffer buff = new StringBuffer("Ram-age is 12 @");

        int upper = 0, lower = 0, sym = 0,num = 0, space = 0,vow = 0;

        for (int i = 0; i < buff.length() ; i++) {

            if (buff.charAt(i) >= 65 && buff.charAt(i) <= 90){
                upper++;
            }
            else if (buff.charAt(i) >= 97 && buff.charAt(i) <= 122){
                lower++;
            }
            else if (buff.charAt(i) >= 48 && buff.charAt(i) <= 57){
                num++;
            }
            else if (buff.charAt(i) == 32){
                space++;
            }
            else {
                sym++;
            }

            if (buff.charAt(i) == 'A' || buff.charAt(i) == 'E' || buff.charAt(i) == 'I'
                    || buff.charAt(i) == 'O' || buff.charAt(i) == 'U' || buff.charAt(i) == 'a'
                    || buff.charAt(i) == 'e' || buff.charAt(i) == 'i' || buff.charAt(i) == 'o'
                    || buff.charAt(i) == 'u') {

                vow++;

            }

        }


        System.out.println();

        System.out.println("Total UPPERCASE are : " + upper);
        System.out.println("Total lowercase are : " + lower);
        System.out.println("Total Numbers are   : " + num);
        System.out.println("Total Spaces are    : " + space);
        System.out.println("Total Symbols are   : " + sym);
        System.out.println("Total Vowels are    : " + vow);

    }
}
