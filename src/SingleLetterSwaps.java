import java.util.Arrays;

public class SingleLetterSwaps {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(validateSwaps(new String[]{"BACDE", "EBCDA", "BCDEA", "ACBED"}, "ABCDE")));

    }

    public static boolean[] validateSwaps(String[] arr, String str) {
        int count;
        boolean[] booArr = new boolean[arr.length];

        for (int i = 0; i < booArr.length; i++) {

            if (arr[i].length() != str.length()) {
                booArr[i] = false;

            } else {

                boolean isCorrect = true;
                char[] chArr1 = str.toCharArray();
                char[] chArr2 = arr[i].toCharArray();
                Arrays.sort(chArr1);
                Arrays.sort(chArr2);

                for(int x = 0; x < chArr1.length; x++) {
                    if(chArr1[x] != chArr2[x]) {
                        isCorrect = false;
                        break;
                    }
                }

                count = 0;
                for (int j = 0; j < str.length(); j++) {

                    if(str.charAt(j) != arr[i].charAt(j)) {
                        count++;
                    }
                }
                if(!isCorrect) {
                    booArr[i] = false;
                } else if(count > 2) {
                    booArr[i] = false;
                } else {
                    booArr[i] = true;
                }
            }

        }

        return booArr;
    }
}
