import java.util.Arrays;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

    }

    public static boolean cons(int[] arr) {
        boolean isCons = true;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1] - 1) {
                isCons = false;
                break;
            }
        }
        return isCons;
    }
}
