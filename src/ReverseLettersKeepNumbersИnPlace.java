public class ReverseLettersKeepNumbersИnPlace {

    public static void main(String[] args) {
        System.out.println(reverse("ab89c"));
        System.out.println(reverse("jkl5mn923o"));
    }

    public static String reverse(String str) {
        boolean[] isDigitLetter = new boolean[str.length()];
        boolean isLetter = true;
        int count = 0;
        String reverseLetters = "";
        String reverseString = "";

        for(int i = 0; i < isDigitLetter.length; i++) {
            isDigitLetter[i] = Character.isDigit(str.charAt(i));
        }

        for (int i = str.length() - 1; i >=0; i--) {
            if(Character.isLetter(str.charAt(i))) {
                reverseLetters += String.valueOf(str.charAt(i));
            }
        }

        for(int i = 0; i < isDigitLetter.length; i++) {
            if(isDigitLetter[i]) {
                reverseString += String.valueOf(str.charAt(i));
            } else {
                reverseString += String.valueOf(reverseLetters.charAt(count));
                count++;
            }
        }
        return reverseString;
    }
}
