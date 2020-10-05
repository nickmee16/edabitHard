import java.util.Arrays;

public class SevenBoom {

    public static void main(String[] args) {
        System.out.println(sevenBoom(new int[]{76, 55, 44, 32}));
    }

    public static String sevenBoom(int[] arr) {
        boolean isSeven = false;
        String strArr = Arrays.toString(arr);
        char[] chArr = strArr.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if(chArr[i] == '7') {
                isSeven = true;
                break;
            }
        }

        if(isSeven) {
            return "Boom!";
        }
        return "there is no 7 in the array";
    }
}
