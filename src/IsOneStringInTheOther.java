public class IsOneStringInTheOther {

    public static void main(String[] args) {

        System.out.println(overlap("ABC", "Ican'tsingmyABC"));
        System.out.println(overlap("abc", "Ican'tsingmyABC"));
        System.out.println(overlap("Ican'tsingmyABC", "abc"));
        System.out.println(overlap("hello world", "hello"));
        System.out.println(overlap("+=", "this should work too +="));
        System.out.println(overlap("hey", "*********"));

    }

    public static boolean overlap(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean isCorrect = true;

        for (int i = 0; i < length; i++) {
            if (str1.length() > str2.length()) {

                if (str1.charAt(((str1.length() - length)) + i) != str2.charAt(i)
                        && str1.charAt(((str1.length() - length)) + i) != '*'
                        && str2.charAt(i) != '*') {
                    isCorrect = false;
                }
            } else if (str1.length() < str2.length()) {

                if (str2.charAt(((str2.length() - length)) + i) != str1.charAt(i)
                        && str2.charAt(((str2.length() - length)) + i) != '*'
                        && str1.charAt(i) != '*'){
                    isCorrect = false;
                }

            } else {
                if(str1.charAt(i) != str2.charAt(i)
                && str1.charAt(i) != '*'
                && str2.charAt(i) != '*') {
                    isCorrect = false;
                }
            }

        }

        return isCorrect;
    }
}
