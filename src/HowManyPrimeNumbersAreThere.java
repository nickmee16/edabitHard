public class HowManyPrimeNumbersAreThere {

    public static void main(String[] args) {
        System.out.println(primeNumbers(10));
    }

    public static int primeNumbers(int num) {
        int count = 0;
        boolean isPrime;

        for (int i = 2; i <= num; i++) {
            isPrime = true;
            for (int y = 2; y <= i / 2; y++) {
                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
