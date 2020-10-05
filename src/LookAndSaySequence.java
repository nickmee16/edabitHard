public class LookAndSaySequence {

    public static void main(String[] args) {
        System.out.println(lookAndSay("1211")); //111221
        System.out.println(lookAndSay("111221")); //312211
    }

    public static String lookAndSay(String term) {
        int count = 0;
        StringBuilder newNum = new StringBuilder();

        for (int i = 0; i < term.length(); ) {

            int j;

            for (j = i; j < term.length(); j++) {

                if (j == term.length() - 1) {

                    if (term.charAt(j) == term.charAt(j - 1)) {
                        count++;
                        newNum.append(count).append(term.charAt(j));
                        break;

                    } else {
                        newNum.append(1).append(term.charAt(j));
                        break;
                    }
                }

                if (term.charAt(j) == term.charAt(j + 1)) {
                    count++;

                } else {
                    count++;
                    newNum.append(count).append(term.charAt(j));
                    count = 0;
                    break;
                }
            }

            i = j + 1;

        }
        return newNum.toString();
    }
}
