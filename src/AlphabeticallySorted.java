public class AlphabeticallySorted {

    public static void main(String[] args) {
        System.out.println(isAlphabeticallySorted("Paula has a French accent."));
        System.out.println(isAlphabeticallySorted("The biopsy returned negative results."));
        System.out.println(
                isAlphabeticallySorted("She sells sea shells by the sea shore."));

    }

    public static boolean isAlphabeticallySorted(String sentence) {
        String[] strSplit = sentence.split(" ");
        boolean isCorrect = false;
        int count = 1;


        for(int i = 0; i < strSplit.length; i++) {
            if(strSplit[i].length() >= 3) {
                count = 1;
                strSplit[i] = strSplit[i].replace(".", "");

                for(int j = 0; j < strSplit[i].length() - 1; j++) {
                    if((int) Character.toLowerCase(strSplit[i].charAt(j)) <= (int) Character.toLowerCase(strSplit[i].charAt(j + 1))) {
                        count++;
                    }
                }
            }

            if(count == strSplit[i].length()) {
                isCorrect = true;
                break;
            }
        }
        return isCorrect;
    }
}
