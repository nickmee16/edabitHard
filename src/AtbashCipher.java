public class AtbashCipher {

    public static void main(String[] args) {

        System.out.println(atbash("apple"));
        System.out.println(atbash("Hello world!"));

    }

    public static String atbash(String str) {
        StringBuilder newStr = new StringBuilder();
        int diff;
        char ch = '0';

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {

                if(Character.isUpperCase(str.charAt(i))) {

                    diff = 25 + ((int) str.charAt(i) - (int) 'z');
                    ch = (char) ((int) 'Z' - diff);
                    newStr.append(Character.toUpperCase(ch));

                } else {
                    diff = 25 + ((int) str.charAt(i) - (int) 'z');
                    ch = (char) ((int) 'z' - diff);
                    newStr.append(ch);
                }
            } else {
                newStr.append(str.charAt(i));
            }
        }

        return newStr.toString();
    }
}
