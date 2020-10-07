public class CountTheDigits {

    public static void main(String[] args) {
        System.out.println(digitsCount(1289396387328L));
    }

    public static int digitsCount(long n) {
        String strN = Long.toString(n);
        int count = 0;

        for(int i = 0; i < strN.length(); i++) {
            if(Character.isDigit(strN.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
