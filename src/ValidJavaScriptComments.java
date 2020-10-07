public class ValidJavaScriptComments {

    public static void main(String[] args) {

        System.out.println(commentsCorrect("//////"));
        System.out.println(commentsCorrect("/**//**////**/"));
        System.out.println(commentsCorrect("///*/**/"));
        System.out.println(commentsCorrect("/////"));

    }

    public static boolean commentsCorrect(String str) {
//        if(str.length() % 2 != 0) {
//            return false;
//        }

        int length = (str.length() % 2 == 0) ? str.length() - 1 : str.length();
        boolean isCorrect = true;

        for(int i = 0; i < length; i += 2) {
            if(i == length - 1 && str.length() % 2 != 0 && str.charAt(i) == '/') {
                isCorrect = false;
            } else if(str.charAt(i) != '/') {
                i = i - 1;
            } else if(str.charAt(i) == '/' && str.charAt(i + 1) == '*') {
                isCorrect = false;

                for(int j = i + 2; j < str.length() - 1; j += 2) {

                    if(str.charAt(j) == '*' && str.charAt(j + 1) == '/') {
                        isCorrect = true;
                        i = j;
                        break;
                    } else if(str.charAt(j) == '/' && str.charAt(j + 1) != '/') {
                        break;
                    }
                }

            } else if(str.charAt(i) == '/' && str.charAt(i + 1) != '/') {
                isCorrect = false;
            }

            if(!isCorrect) {
                break;
            }
        }

        return isCorrect;
    }
}
