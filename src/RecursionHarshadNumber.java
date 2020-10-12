public class RecursionHarshadNumber {

    public static void main(String[] args) {

    }

    public static boolean isHarshad(int n) {
        String strN = Integer.toString(n);
        int temp = 0;

        for(int i = 0; i < strN.length(); i++) {
            temp += Integer.parseInt(String.valueOf(strN.charAt(i)));
        }

        if(n % temp == 0) {
            return true;
        }
        return false;
    }
}
