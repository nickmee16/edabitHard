public class MostCommonLastVowel {

    public static void main(String[] args) {
        System.out.println(commonLastVowel("Hello World!"));
        System.out.println(commonLastVowel("Watch the characters dance!"));
        System.out.println(commonLastVowel("OOI UUI EEI AAI"));
    }

    public static String commonLastVowel(String str) {
        String[] strSplit = str.split(" ");
        int countA = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        int countE = 0;

        for(int i = 0; i < strSplit.length; i++) {

            for(int j = strSplit[i].length() - 1; j >= 0; j--) {
                if(strSplit[i].charAt(j) == 'a' || strSplit[i].charAt(j) == 'A') {
                    countA++;
                    break;

                } else if(strSplit[i].charAt(j) == 'i' || strSplit[i].charAt(j) == 'I') {
                    countI++;
                    break;

                } else if(strSplit[i].charAt(j) == 'o' || strSplit[i].charAt(j) == 'O') {
                    countO++;
                    break;

                } else if(strSplit[i].charAt(j) == 'u' || strSplit[i].charAt(j) == 'U') {
                    countU++;
                    break;

                } else if(strSplit[i].charAt(j) == 'e' || strSplit[i].charAt(j) == 'E') {
                    countE++;
                    break;
                }
            }
        }

        if(countA > countE && countA > countI && countA > countO && countA > countU) {
            return "a";

        } else if(countE > countA && countE > countI && countE > countO && countE > countU) {
            return "e";

        } else if(countI > countE && countI > countA && countI > countO && countI > countU) {
            return "i";

        } else if(countO > countE && countO > countI && countO > countA && countO > countU) {
            return "o";

        } else if(countU > countE && countU > countI && countU > countO && countU > countA) {
            return "u";
        }
        return "";
    }
}
