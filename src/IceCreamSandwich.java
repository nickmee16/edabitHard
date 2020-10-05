public class IceCreamSandwich {

    public static void main(String[] args) {

//        System.out.println(isIcecreamSandwich("CDC"));
//        System.out.println(isIcecreamSandwich("AAABB"));
//        System.out.println(isIcecreamSandwich("AA"));
        System.out.println(isIcecreamSandwich("AACDCAA"));
//        System.out.println(isIcecreamSandwich("AAACCCAA"));

    }

    public static boolean isIcecreamSandwich(String str) {

        if(str.length() < 3) {
            return false;
        }

        int countDiffLetters = 0;
        String temp = "";
        boolean isCorrect = true;
        int length =(str.length() % 2 == 0) ? str.length() / 2 : (str.length() / 2) + 1;

        for(int i = 0; i < length; i++) {

            if(str.length() % 2 != 0 && i == length - 1) {

                if(!temp.equals(String.valueOf(str.charAt(i)))) {
                    countDiffLetters++;
                }

            } else if(str.charAt(i) == str.charAt((str.length() - 1) - i)) {

                if(!temp.equals(String.valueOf(str.charAt(i)))) {
                    temp = String.valueOf(str.charAt(i));
                    countDiffLetters++;
                }

            } else {
                isCorrect = false;
                break;
            }

            if(countDiffLetters > 2) {
                isCorrect = false;
                break;
            }
        }

        if(countDiffLetters == 1) {
            isCorrect = false;
        }

        return isCorrect;
    }
}
