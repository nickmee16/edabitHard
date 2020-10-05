import java.util.ArrayList;

public class ShinySemiprimesBrilliantNumbers {

    public static void main(String[] args) {

        System.out.println(isBrilliant(11));

    }

    public static boolean isBrilliant(int n) {
        ArrayList<Integer> allPrimeNumsForN = new ArrayList<>();
        boolean isPrime;
        boolean isBrilliant = true;
        int num = n;

        for (int i = 2; i <= num; ) {
            isPrime = true;
            for (int y = 2; y <= i / 2; y++) {
                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num % i == 0) {
                num = num / i;
                allPrimeNumsForN.add(i);
                i = 2;
            } else {
                i++;
            }
        }

        if(allPrimeNumsForN.size() < 2) {
            return false;
        }


        for (int i = 0; i < allPrimeNumsForN.size() - 1; i++) {
            int count = 1;

            if (String.valueOf(allPrimeNumsForN.get(i)).length() != String.valueOf(allPrimeNumsForN.get(i + 1)).length()) {
                isBrilliant = false;
            }

            for (int j = i + 1; j < allPrimeNumsForN.size(); j++) {
                if (allPrimeNumsForN.get(i) == allPrimeNumsForN.get(j)) {
                    count++;
                }
            }

            if (count > 2) {
                isBrilliant = false;
            }
        }

        return isBrilliant;
    }
}
