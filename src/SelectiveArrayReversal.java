import java.util.Arrays;

public class SelectiveArrayReversal {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(selReverse(new int[]{1, 2, 3, 4, 5, 6}, 2)));
        System.out.println(Arrays.toString(selReverse(new int[]{2, 4, 6, 8, 10, 12, 14, 16}, 3)));
        System.out.println(Arrays.toString(selReverse(new int[]{5, 7, 2, 6, 0, 4, 6}, 100)));

    }

    public static int[] selReverse(int[] lst, int length) {
        int[] lsrReversed = new int[lst.length];
        int count;

            if(length == 0) {
                return lst;
            }


        for(int i = 0; i < lst.length; i += length) {

            if(lst.length % length != 0 && i == lst.length-  lst.length % length) {
                count = 0;

                for(int j = lst.length % length - 1; j >= 0; j--) {
                    lsrReversed[i + count] = lst[i + j];
                    count++;
                }

            } else {
                count = 0;

                for(int j = length - 1; j >= 0; j--) {
                    lsrReversed[i + count] = lst[i + j];
                    count++;
                }
            }


        }


        return lsrReversed;
    }
}
