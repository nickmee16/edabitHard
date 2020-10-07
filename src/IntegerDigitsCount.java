public class IntegerDigitsCount {

    public static void main(String[] args) {

    }

    public static int count(int n) {
        String strN = Integer.toString(n);
        int count = 0;

        for(int i = 0; i < strN.length(); i++) {
            if(Character.isDigit(strN.charAt(i))) {
                count++;
            }
        }

        return count;
    }

}
