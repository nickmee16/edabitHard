public class Parseltongue {

    public static void main(String[] args) {

//        System.out.println(isParselTongue("Sshe ssselects to eat that apple."));
        System.out.println(isParselTongue("She ssselects to eat that apple."));

    }

    public static boolean isParselTongue(String sentence) {
        String[] sentenceSplited = sentence.split(" ");
        boolean hasMoreS = true;

        for (int i = 0; i < sentenceSplited.length; i++) {

            if(sentenceSplited[i].contains("s") || sentenceSplited[i].contains("S")) {
                hasMoreS = false;

                for (int j = 0; j < sentenceSplited[i].length(); j++) {
                    char ch = Character.toLowerCase(sentenceSplited[i].charAt(j));

                    if(ch == 's') {

                        if (j == 0) {

                            if (Character.toLowerCase(sentenceSplited[i].charAt(j + 1)) == 's') {
                                hasMoreS = true;
                                break;
                            }

                        } else if (j == sentenceSplited[i].length() - 1) {

                            if (Character.toLowerCase(sentence.charAt(i - 1)) == 's') {
                                hasMoreS = true;
                                break;
                            }

                        } else {

                            if (Character.toLowerCase(sentenceSplited[i].charAt(j - 1)) == 's' || Character.toLowerCase(sentenceSplited[i].charAt(j + 1)) == 's') {
                                hasMoreS = true;
                                break;
                            }
                        }
                    }
                }
            }

            if(!hasMoreS) {
                break;
            }
        }

        return hasMoreS;
    }
}
