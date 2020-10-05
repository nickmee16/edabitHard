public class ReplaceEveryNthInstanceOfACharacter {

    public static void main(String[] args) {

        System.out.println(replace_nth("Vader said: No, I am your father!", 2, "a", "o"));

    }

    public static String replace_nth(String txt, int nth, String  old_char, String  new_char) {
        if(nth == 0) {
            return txt;
        }

        int count = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < txt.length(); i++) {
            if(String.valueOf(txt.charAt(i)).equals(old_char)) {
                count++;
            }

            if(count == nth) {
                str.append(new_char);
                count = 0;

            } else {
                str.append(String.valueOf(txt.charAt(i)));
            }
        }

        return str.toString();
    }
}
