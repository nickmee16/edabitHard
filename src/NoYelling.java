public class NoYelling {

    public static void main(String[] args) {
        System.out.println(noYelling("What went wrong?????????"));
    }

    public static String noYelling(String phrase) {
        String[] phraseArr = phrase.split(" ");
        String word = "";
        String result = "";

        for(int i = 0; i < phraseArr.length; i++) {
            word = phraseArr[i];
            if(i == phraseArr.length - 1) {
                word = "";
                for(int j = 0; j < phraseArr[i].length(); j++) {
                    if(!Character.isLetter(phraseArr[i].charAt(j))) {
                        word +=phraseArr[i].charAt(j);
                        break;
                    }
                    word +=phraseArr[i].charAt(j);
                }
            }
            result += word + " ";
        }
        return result.trim();
    }
}
