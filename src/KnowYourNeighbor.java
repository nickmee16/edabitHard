public class KnowYourNeighbor {

    public static void main(String[] args) {

        System.out.println(plusSign("+f+d+c+#+f+"));
        System.out.println(plusSign("+d+=3=+s+"));
        System.out.println(plusSign("f++d+g+8+"));
        System.out.println(plusSign("+s+7+fg+r+8+"));

    }

    public static boolean plusSign(String str) {
        if(str.charAt(0) != '+' || str.charAt(str.length() - 1) != '+') {
            return false;
        }

        boolean isCorrect = true;

        for(int i = 1; i < str.length() - 1; i++) {

            if(Character.isLetter(str.charAt(i))) {

                if(str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    isCorrect = false;
                    break;
                }
            }
        }

        return isCorrect;
    }
}
