import java.util.ArrayList;

public class FindTheOddInteger {

    public static void main(String[] args) {
        System.out.println(findOdd(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(findOdd(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
    }

    public static int findOdd(int[] arr) {
        int num = 0;
        int count = 0;
        ArrayList<Integer> arrListInt = new ArrayList<>();

        if(arr.length == 1) {
            return arr[0];
        }

        for(int i = 0; i < arr.length; i++) {
            if(!arrListInt.contains(arr[i])) {
                count++;
                arrListInt.add(arr[i]);
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                    }
                }
            } else {
                count = 0;
            }
            if(count % 2 != 0) {
                num = arr[i];
                break;
            } else {
                count = 0;
            }
        }
        return num;
    }
}
