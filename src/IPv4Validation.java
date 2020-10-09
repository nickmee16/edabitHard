public class IPv4Validation {

    public static void main(String[] args) {

//        System.out.println(isValidIP("1.2.3.4"));
//        System.out.println(isValidIP("1.2.3"));
//        System.out.println(isValidIP("1.2.3.4.5"));
//        System.out.println(isValidIP("123.45.67.89"));
//        System.out.println(isValidIP("123.456.78.90"));
//        System.out.println(isValidIP("123.045.067.089"));
        System.out.println(isValidIP("12.34.56 .1"));

    }

    public static boolean isValidIP(String str) {
        String[] strSplit = str.split("\\.");

        if (strSplit.length != 4) {
            return false;
        }

        boolean isCorrect = true;

        for (int i = 0; i < strSplit.length; i++) {

            for (int j = 0; j < strSplit[i].length(); j++) {

                if (strSplit[i].length() > 1 && j == 0 && strSplit[i].charAt(j) == '0') {
                    isCorrect = false;
                    break;
                }

                if(!Character.isDigit(strSplit[i].charAt(j))) {
                    isCorrect = false;
                    break;
                }
            }

            if (!isCorrect) {
                break;
            }

            if(Integer.parseInt(strSplit[i]) < 0 || Integer.parseInt(strSplit[i]) > 255) {
                isCorrect = false;
                break;
            }
        }

        return isCorrect;
    }
}
