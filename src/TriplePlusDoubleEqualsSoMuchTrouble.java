public class TriplePlusDoubleEqualsSoMuchTrouble {

    public static void main(String[] args) {

        System.out.println(trouble(451999277L, 41177722899L));
        System.out.println(trouble(1222345, 12345));
        System.out.println(trouble(666789, 12345667));
        System.out.println(trouble(33789, 12345337));

    }

    public static boolean trouble(long num1, long num2) {
        boolean isCorrect = false;
        String strNum1 = "" + num1;
        String strNum2 = "" + num2;

        for(int i = 0; i < strNum1.length() - 2; i++) {

            if(strNum1.charAt(i) == strNum1.charAt(i + 1) && strNum1.charAt(i) == strNum1.charAt(i + 2)) {

                for(int j = 0; j < strNum2.length() - 1; j++) {
                    if(strNum1.charAt(i) == strNum2.charAt(j) && strNum1.charAt(i) == strNum2.charAt(j + 1)) {
                        isCorrect = true;
                        break;
                    }
                }
            }

            if(isCorrect) {
                break;
            }
        }

        return isCorrect;
    }
}
