public class WordRankScoringSystem {

    public static void main(String[] args) {
        System.out.println(word_rank("The quick brown fox."));
        System.out.println(word_rank("Wednesday is hump day."));
    }

    public static String word_rank(String str) {
        String[] strSplited = str.split(" ");
        String strongestWord = "";
        int count = 0;
        int temp;

        for(int i = 0; i < strSplited.length; i++) {
            temp = 0;
            for(int j = 0; j < strSplited[i].length(); j++) {

                if(Character.isLetter(strSplited[i].charAt(j))) {

                    temp += (int) Character.toLowerCase(strSplited[i].charAt(j)) - (int) 'a' + 1;
                }
            }

            if(temp > count) {
                count = temp;
                strongestWord = strSplited[i];
            }
        }

        return strongestWord.replaceAll("\\W", "");
    }
}
