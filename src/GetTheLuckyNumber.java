import java.util.ArrayList;

public class GetTheLuckyNumber {

    public static void main(String[] args) {

        System.out.println(getLuckyNumber(25, 5));
        System.out.println(getLuckyNumber(3, 2));
        System.out.println(getLuckyNumber(120, 13));

    }

    public static int getLuckyNumber(int size, int nth) {
        boolean isPossible = true;
        int countTimes = 2;
        int luckyNumber = 0;
        int length;
        int countAL;
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            nums.add(i + 1);
        }

        while (isPossible) {
            length = nums.size();
            countAL = 0;

            if(countTimes > nums.size()) {

                luckyNumber = nums.get(nth - 1);
                isPossible = false;
            }


            for(int i = countTimes - 1; i < length; i += countTimes) {
                nums.remove(i - countAL);
                countAL++;
            }

            for (int i = 0; i < nums.size(); i++) {
                if(countTimes < nums.get(i)) {
                    countTimes = nums.get(i);
                    break;
                }
            }
        }

        return luckyNumber;
    }
}
