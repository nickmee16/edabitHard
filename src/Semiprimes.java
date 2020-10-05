public class Semiprimes {

    public static void main(String[] args) {

        System.out.println(semiprime(70));
//        System.out.println(semiprime(15));
//        System.out.println(semiprime(3));

    }

    public static String semiprime(int n) {
        String strNum = "";
        boolean isPrime;

        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int y = 2; y <= i / 2; y++) {
                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                strNum += Integer.toString(i) + " ";
            }
        }

        String[] strNumArr = strNum.split(" ");
        int[] intArr = new int[strNumArr.length];

        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strNumArr[i]);
        }

        int countDiffPrimes = 0;
        int countSamePrime = 0;
        int temp1 = 0;
        int temp2 = 0;

        for(int i = 0; i < intArr.length; i++) {
            temp1 = intArr[i];

            if(n % intArr[i] == 0) {
                n /= intArr[i];
                i--;
                if(temp1 == temp2) {
                    countSamePrime++;

                } else {
                    countDiffPrimes++;
                }
            }

            temp2 = temp1;

            if(n == 1) {
                break;
            }
        }

        if(countDiffPrimes + countSamePrime > 2 || countSamePrime == 0 && countDiffPrimes == 1) {
            return "Neither";
        } else if(countDiffPrimes == 2) {
            return "Squarefree Semiprime";
        } else {
            return "Semiprime";
        }
    }
}
