import java.util.Arrays;

public class ParenthesesClusters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("()()()")));
        System.out.println(Arrays.toString(split("((()))")));
        System.out.println(Arrays.toString(split("((()))(())()()(()())")));
        System.out.println(Arrays.toString(split("((())())(()(()()))")));
    }

    public static String[] split(String str) {

        if(str.length() == 0) {
            return new String[]{};
        }

        String newStr = "";
        int countOpening = 0;
        int countClosing = 0;
        int temp = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                countOpening++;

            } else if(str.charAt(i) == ')') {
                countClosing++;
            }

            if(countOpening == countClosing) {

                if(i == str.length() - 1) {
                    newStr += str.substring(temp);

                } else {
                    newStr += str.substring(temp, i + 1) + " ";
                    temp = i + 1;
                }
            }
        }

        newStr = newStr.trim();

        return newStr.split(" ");
    }
}
