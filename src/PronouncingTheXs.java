public class PronouncingTheXs {

    public static void main(String[] args) {
        System.out.println(xPronounce("Inside the box was x xylophone"));
    }

    public static String xPronounce(String sentence) {
        String[] sentenceSplit = sentence.split(" ");
        String withoutXs = "";

        for(int i = 0; i < sentenceSplit.length; i++) {
            String[] wordSplit = sentenceSplit[i].split("");
            for(int j = 0; j < wordSplit.length; j++) {
                if(wordSplit[j].equals("x")) {
                    if(wordSplit.length == 1) {
                        wordSplit[j] = "ecks";
                    } else if(j == 0) {
                        wordSplit[j] = "z";
                    } else {
                        wordSplit[j] = "cks";
                    }
                }
                withoutXs += wordSplit[j];
            }
            withoutXs += " ";
        }
        return withoutXs.trim();
    }
}
