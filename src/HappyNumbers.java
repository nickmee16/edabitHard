public class HappyNumbers {

    public static void main(String[] args) {

        System.out.println(happy(203));
        System.out.println(happy(11));
        System.out.println(happy(107));

    }

    public static boolean happy(int num) {
        int temp = num;
        boolean isHappy = true;
        boolean isPossible = true;

        while(isPossible) {
            String strNum = "" + temp;
            temp = 0;

            for(int i = 0; i < strNum.length(); i++) {
                if(Integer.parseInt(String.valueOf(strNum.charAt(i))) != 0) {
                    temp += Math.pow(Integer.parseInt(String.valueOf(strNum.charAt(i))), 2);
                }
            }

            if(temp == 1) {
                isPossible = false;
            } else if(temp > num) {
                isHappy = false;
                isPossible = false;
            }
        }

        return isHappy;
    }
}
