public class ReverseTheOddLengthWords {

    public static void main(String[] args) {
        System.out.println(reverseOdd("Bananas"));
        System.out.println(reverseOdd("One two three four"));
    }

    public static String reverseOdd(String str) {
        String[] strArr = str.split(" ");
        String word = "";
        String result = "";

        for(int i = 0; i < strArr.length; i++) {
            word = strArr[i];
            if(strArr[i].length() % 2 != 0) {
                word = "";
                for(int j = strArr[i].length() - 1; j >= 0; j--) {
                    word += strArr[i].charAt(j);
                }
            }
                result += word + " ";
        }
        return result.trim();
    }
}
