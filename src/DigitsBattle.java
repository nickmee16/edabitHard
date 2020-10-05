public class DigitsBattle {

    public static void main(String[] args) {
        System.out.println(battleOutcome(12345));
    }

    public static int battleOutcome(int num) {
        String newNum = "";
        String[] strNumArr =Integer.toString(num).split("(?<=\\G.{2})");

        for(int i = 0; i < strNumArr.length; i++) {
            if(strNumArr[i].length() == 1) {
                newNum += strNumArr[i];
            } else if(strNumArr[i].charAt(0) > strNumArr[i].charAt(1)) {
                newNum += String.valueOf(strNumArr[i].charAt(0));
            } else if(strNumArr[i].charAt(0) < strNumArr[i].charAt(1)) {
                newNum += String.valueOf(strNumArr[i].charAt(1));
            }
        }

        return Integer.parseInt(newNum);
    }
}
