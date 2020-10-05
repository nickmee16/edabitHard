public class CarryingТheDigits {

    public static void main(String[] args) {
        System.out.println(carryDigits(36, 135));
        System.out.println(carryDigits(671, 329));

    }

    public static int carryDigits(int n1, int n2) {
        int count = 0;
        int carry = 0;
        int lengthOnNum;

        String reversedNum1 = new StringBuffer("" + n1).reverse().toString();
        String reversedNum2 = new StringBuffer("" + n2).reverse().toString();
        lengthOnNum = (reversedNum1.length() >= reversedNum2.length())
                                                    ? reversedNum2.length()
                                                    : reversedNum1.length();


        for(int i = 0; i < lengthOnNum; i++) {
            if(Integer.parseInt(String.valueOf(reversedNum1.charAt(i))) + Integer.parseInt(String.valueOf(reversedNum2.charAt(i))) + carry >= 10 ) {
                count++;
                carry = 1;
            } else {
                carry = 0;
            }
        }
        return count;
    }
}
