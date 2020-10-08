import java.util.Arrays;

public class PossiblePalindrome {

    public static void main(String[] args) {

        System.out.println(possiblePalindrome("acabbaa"));
        System.out.println(possiblePalindrome("aacbdbc"));
        System.out.println(possiblePalindrome("aacbdb"));
        System.out.println(possiblePalindrome("abacbb"));

        System.out.println(possiblePalindrome("bbb"));

    }

    public static boolean possiblePalindrome(String str) {
        int countTimes;
        int countOdd = 0;
        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);
        char temp = '0';

        for(int i = 0; i < chArr.length; i++) {

            countTimes = 0;
            if(temp != chArr[i]) {
                temp = chArr[i];

                for(int j = i; j < chArr.length; j++) {
                    if(chArr[i] == chArr[j]) {
                        countTimes++;

                    } else {
                        i = j - 1;
                        break;
                    }
                }
            }

            if(countTimes % 2 != 0) {
                countOdd++;
            }
        }

        if(str.length() % 2 != 0) {
            if(countOdd == 1) {
                return true;
            } else {
                return false;
            }

        } else {
            if(countOdd > 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}
