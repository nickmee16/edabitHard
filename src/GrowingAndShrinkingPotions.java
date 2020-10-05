public class GrowingAndShrinkingPotions {

    public static void main(String[] args) {

        System.out.println(afterPotion("3A78B51"));

    }

    public static String afterPotion(String str) {
        StringBuilder strNum = new StringBuilder();
        int countLetters = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                countLetters++;
            }
        }

        String[] strNumArr = new String[str.length() - countLetters];
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))) {
                count++;
                if(str.charAt(i) == 'A') {
                    strNumArr[i - count] = "" + (Integer.parseInt(String.valueOf(str.charAt(i - 1))) + 1);

                } else if(str.charAt(i) == 'B') {
                    strNumArr[i - count] = "" + (Integer.parseInt(String.valueOf(str.charAt(i - 1))) - 1);
                }

            } else {
                strNumArr[i - count] = String.valueOf(str.charAt(i));
            }
        }

        for(int i = 0; i < strNumArr.length; i++) {
            strNum.append(strNumArr[i]);
        }

        return strNum.toString();
    }
}
