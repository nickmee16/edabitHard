public class TruncateStringAtAGivenLength {

    public static void main(String[] args) {

        System.out.println(truncate("Lorem ipsum dolor sit amet.", 20));

    }

    public static String truncate(String str, int length) {

        if(length >= str.length()) {
            return str;
        }

        String[] strSplited = str.split(" ");
        StringBuilder truncate = new StringBuilder();
        int count = 0;
        boolean isPossible = true;

        while(isPossible) {

            if((length - strSplited[count].length() == 0 || length - strSplited[count].length() == 1) && count == 0) {

                truncate.append(strSplited[0]).append(" ");
                isPossible = false;
            }

            if(length - strSplited[count].length() < 0) {
                isPossible = false;

            } else if(length - strSplited[count].length() >= 0) {

                truncate.append(strSplited[count]).append(" ");
                length -= (strSplited[count].length() + 1);
                count++;
            }
        }

        return truncate.toString().trim();
    }
}
