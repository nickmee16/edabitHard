import java.util.ArrayList;

public class PowerfulNumbers {

    public static void main(String[] args) {
        System.out.println(isPowerful(36));
        System.out.println(isPowerful(674));
        System.out.println(isPowerful(600));

    }

    public static boolean isPowerful(int num) {
        String primeNumbers = "";

        for (int i = 1; i <= num; i++) {
            int count = 0;

            for(int j = i; j >= 1; j--) {
                if(i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        String[] primeNumsSplit = primeNumbers.split(" ");
        ArrayList<Integer> intArrList = new ArrayList<>();

        for(int i = 0; i < primeNumbers.length(); i++) {
            if(Integer.parseInt(primeNumsSplit[i]) > num) {
                break;
            }

            if(num % Integer.parseInt(primeNumsSplit[i]) == 0) {
                intArrList.add(Integer.parseInt(primeNumsSplit[i]));
                num /= Integer.parseInt(primeNumsSplit[i]);
                i--;
            }
        }

        int temp = 0;
        int countMultipleTimes = 0;
        boolean isCorrect = true;
        boolean isTrue;

        for(int i = 0; i < intArrList.size();) {
            temp = intArrList.get(i);
            countMultipleTimes = 0;
            isTrue = true;

            while (isTrue) {
                if(intArrList.contains(temp)) {
                    intArrList.remove(Integer.valueOf(temp));
                    countMultipleTimes++;
                } else {
                    isTrue = false;
                    i = 0;
                }
            }

            if(countMultipleTimes == 1) {
                isCorrect = false;
                break;
            } else {
                i = 0;
            }

        }
        return isCorrect;
    }
}
