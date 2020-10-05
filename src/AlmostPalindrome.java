public class AlmostPalindrome {

    public static void main(String[] args) {
        System.out.println(almostPalindrome("abcdcbg"));
        System.out.println(almostPalindrome("abcdaaa"));
    }

    public static boolean almostPalindrome(String str) {
        int count = 0;

        for(int i = 0; i < str.length() / 2; i++) {

            if(str.charAt(i) != str.charAt((str.length() - 1) - i)) {
                count++;
            }
        }

        return count == 1;
    }
}
