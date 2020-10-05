public class PositivesAndNegatives {

    public static void main(String[] args) {
        System.out.println(alternateSign(new int[]{3, -2, 5, -5, 2, -8}));
        System.out.println(alternateSign(new int[]{4, 4, -2, 3, -6, 10}));
    }

    public static boolean alternateSign(int[] arr) {
        if(arr.length == 1) {
            return true;
        }

        boolean startsWithPositive = (arr[0] >= 0) ? true : false;
        boolean isCorrect = true;

        for(int i = 0; i < arr.length; i++) {
            if(startsWithPositive) {
                if(i % 2 == 0 && arr[i] < 0) {
                    isCorrect = false;

                } else if(i % 2 != 0 && arr[i] >= 0) {
                    isCorrect = false;
                }
            }

            if(!startsWithPositive) {
                if(i % 2 == 0 && arr[i] >= 0) {
                    isCorrect = false;
                } else if(i % 2 != 0 && arr[i] < 0) {
                    isCorrect = false;
                }
            }
        }

        return isCorrect;
    }
}
