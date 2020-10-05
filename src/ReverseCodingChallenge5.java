import java.util.Arrays;

public class ReverseCodingChallenge5 {

    public static void main(String[] args) {
        System.out.println(mysteryFunc(832));
    }

    public static int mysteryFunc(int num) {

        String[] digits = ("" + num).split("");
        Arrays.sort(digits);
        int sortedNum = Integer.parseInt(String.join("", digits));
        System.out.println(sortedNum);

        return Math.max(0, num - sortedNum);
    }
}
