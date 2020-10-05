public class CorrectInequalitySigns {

    public static void main(String[] args) {
        System.out.println(correctSigns("3 < 7 < 11"));
        System.out.println(correctSigns("13 > 44 > 33 > 1"));
    }

    public static boolean correctSigns(String str) {
        boolean isCorrect = true;
        int num1 = 0;
        int num2 = 0;
        String[] strArr = str.split(" ");

        for(int i = 1; i < strArr.length; i++) {

            if(strArr[i].equals("<")) {
                num1 = Integer.parseInt(strArr[i - 1]);
                num2 = Integer.parseInt(strArr[i + 1]);

                if(num1 > num2 || num1 == num2) {
                    isCorrect = false;
                    break;
                }

            } else if(strArr[i].equals(">")) {
                num1 = Integer.parseInt(strArr[i - 1]);
                num2 = Integer.parseInt(strArr[i + 1]);

                if(num1 < num2 || num1 == num2) {
                    isCorrect = false;
                    break;
                }
            }
        }
        return isCorrect;
    }
}
