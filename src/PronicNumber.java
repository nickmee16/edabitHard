public class PronicNumber {

    public static void main(String[] args) {
        System.out.println(isHeteromecic(156));
    }

    public static boolean isHeteromecic(int n) {
        boolean isCorrect = true;
        boolean isPossible = true;
        int num;
        int count = 0;

        while (isPossible) {

            num = count * (count + 1);

            if(num == n) {
                isPossible = false;

            } else if(num > n) {
                isCorrect = false;
                isPossible = false;

            } else {
                count++;
            }
        }

        return isCorrect;
    }
}
