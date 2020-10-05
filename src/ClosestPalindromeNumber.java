public class ClosestPalindromeNumber {

    public static void main(String[] args) {
        System.out.println(closestPalindrome(887));
        System.out.println(closestPalindrome(100));
        System.out.println(closestPalindrome(888));
        System.out.println(closestPalindrome(27));
        String newStr = "asdsad";
    }

    public static int closestPalindrome(int num) {
        for (int i = num, j = num; i < num+num && j > 0; i++, j--) {
            if (String.valueOf(j).equals(String.valueOf(new StringBuilder(String.valueOf(j)).reverse().toString()))) return j;
            if (String.valueOf(i).equals(String.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString()))) return i;
        }
        return -1;
    }
}
