public class ElasticWords {

    public static void main(String[] args) {
        System.out.println(elasticize("abcba"));
    }

    public static String elasticize(String word) {
        if(word.length() == 1) {
            return word;
        }

        String right = "";
        String left = "";
        int length = (word.length() % 2 == 0) ? word.length() / 2 : (word.length() / 2) + 1;

        for(int i = 0; i < length; i++) {

            if(word.length() % 2 != 0 && (length - 1) - i == 0) {

                for(int j = 0; j <= i; j++) {
                    right += String.valueOf(word.charAt(i));
                }

            } else {
                for(int j = 0; j <= i; j++) {
                    right += String.valueOf(word.charAt(i));
                    left = String.valueOf(word.charAt((word.length() - 1) - i)) + left;
                }
            }
        }

        return right + left;
    }
}
