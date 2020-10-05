public class ProductOfRemainingElements {

    public static void main(String[] args) {

        System.out.println(canPartition(new int[]{2, 8, 4, 1}));
        System.out.println();
        System.out.println(canPartition(new int[]{-1, -20, 5, -1, -2, 2}));
        System.out.println(canPartition(new int[]{0, 0, 1, 1}));

    }

    public static boolean canPartition(int[] arr) {
        int greatestNum = Integer.MIN_VALUE;
        int worstNum = Integer.MAX_VALUE;
        int result = 1;
        int num = 0;
        int zero = 0;
        int one = 0;

        for(int i = 0; i < arr.length; i++) {
            if(greatestNum < arr[i]) {
                greatestNum = arr[i];
            }

            if(worstNum > arr[i]) {
                worstNum = arr[i];
            }

            if(arr[i] == 0) {
                zero++;
            }

            if(arr[i] == 1) {
                one++;
            }
        }

        if(zero > one && (zero + one) == arr.length) {
            return true;
        }

        if(worstNum > 0) {
            num = greatestNum;

        } else if(greatestNum < 0) {
            num = worstNum;

        } else if(worstNum * -1 > greatestNum) {
            num = worstNum;

        } else if(worstNum * -1 <= greatestNum) {
            num = greatestNum;
        }

        System.out.println(num);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != num) {
                result *= arr[i];
            }
        }
        System.out.println(result);

        if(result == num) {
            return true;
        }
        return false;
    }
}
