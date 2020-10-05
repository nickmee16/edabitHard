public class BalancedWords {

    public static void main(String[] args) {

        System.out.println(balanced("zips"));
        System.out.println(balanced("brake"));

    }

    public static boolean balanced(String word) {
        int right = 0;
        int left = 0;

        for(int i = 0; i < word.length() / 2; i++) {
            right += (int) word.charAt(i) - (int) 'a';
            left += (int) word.charAt((word.length() - 1) - i) - (int) 'a';
        }

        return (right == left) ? true : false;
    }
}
