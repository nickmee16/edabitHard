public class DigitsSumRoot {

    public static void main(String[] args) {

        System.out.println(digitRoot(999888777L));
        System.out.println(digitRoot(1238763636555555555L));

    }

    public static int digitRoot(long n) {
        String strN = Long.toString(n);
        int temp = 0;


        boolean isPossible = true;

        while (isPossible) {

            for (int i = 0; i < strN.length(); i++) {
                if(Character.isDigit(strN.charAt(i))) {
                    temp += Integer.parseInt(String.valueOf(strN.charAt(i)));
                }
            }


            if (temp < 10) {
                isPossible = false;

            } else {
                strN = "" + temp;
                temp = 0;
            }

        }

        return temp;
    }
}
