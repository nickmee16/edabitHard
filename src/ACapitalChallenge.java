public class ACapitalChallenge {

    public static void main(String[] args) {
        System.out.println(selectLetters("heLLO", "GUlp"));
        System.out.println(selectLetters("1234567", "XxXxX"));
        System.out.println(selectLetters("EVERYTHING", "SomeThings"));
        System.out.println(selectLetters("PaTtErN", "pAtTeRn"));
        System.out.println(selectLetters("What do you think of it so far?", "RUBBISH!"));
    }

    public static String selectLetters(String s1, String s2) {
        StringBuilder str = new StringBuilder();
        int length = (s1.length() >= s2.length()) ? s2.length() : s1.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(s1.charAt(i)) && Character.isUpperCase(s2.charAt(i))) {
                str.append(String.valueOf(s1.charAt(i)));
            } else if (Character.isUpperCase(s2.charAt(i))) {
                if (Character.isLowerCase(s1.charAt(i))
                        || Character.isDigit(s1.charAt(i))
                        || String.valueOf(s1.charAt(i)).equals(" ")) {
                    str.append(String.valueOf(s1.charAt(i)));
                }
            }
        }

        for (int i = 0; i < length; i++) {

            if (Character.isUpperCase(s1.charAt(i)) && Character.isUpperCase(s2.charAt(i))) {
                str.append(String.valueOf(s2.charAt(i)));

            } else if (Character.isUpperCase(s1.charAt(i))) {

                if (Character.isLowerCase(s2.charAt(i))
                        || Character.isDigit(s2.charAt(i))
                        || String.valueOf(s2.charAt(i)).equals(" ")) {
                    str.append(String.valueOf(s2.charAt(i)));
                }
            }
        }
        return str.toString();
    }
}
