public class RansomLetter {

    public static void main(String[] args) {
        System.out.println(canBuild("aPPleAL", "PAL"));
        System.out.println(canBuild("aPPleAL", "apple"));
        System.out.println(canBuild("a", "aA"));
    }

    public static boolean canBuild(String str1, String str2) {
        boolean isCorrect = false;

        if(str2.equals("")) {
            return true;
        }
        if(str1.length() < str2.length()) {
            return false;
        }


        for(int i = 0; i < str2.length(); i++) {
            isCorrect = false;
            for(int j = 0; j < str1.length(); j++) {
                if(str2.charAt(i) == str1.charAt(j)) {
                    isCorrect = true;
                    break;
                }
            }
            if(!isCorrect) {
                break;
            }
        }
        return isCorrect;
    }
}
