import java.util.Arrays;

public class ExactFactorialBounds {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isExact(720)));
    }

    public static long[] isExact(long n) {
        long temp = 1;
        long factorial = 0;
        boolean isCorrect = false;

        for(long i = 1; i < n; i++) {
            temp *= i;

            if(temp == n) {
                factorial = i;
                isCorrect = true;
                break;

            } else if(temp > n) {
                isCorrect = false;
                break;
            }
        }

        if(isCorrect) {
            return new long[]{n, factorial};
        }
        return new long[]{};
    }
}
