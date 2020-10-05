public class DisariumNumber {

    public static void main(String[] args) {

        System.out.println(isDisarium(75));
        System.out.println(isDisarium(135));

    }

    public static boolean isDisarium(int n) {
        String strN = Integer.toString(n);
        int newNum = 0;

        for(int i = 0; i < strN.length(); i++) {

            int temp = Integer.parseInt(String.valueOf(strN.charAt(i)));
            newNum += Math.pow(temp, (i + 1));
        }

        if(newNum == n) {
            return true;
        }
        return false;
    }
}
