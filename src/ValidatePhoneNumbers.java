public class ValidatePhoneNumbers {

    public static void main(String[] args) {
        System.out.println(validate("18925678901"));
        System.out.println(validate("+1-892-445-7663"));
        System.out.println(validate("1.892.567.8901"));
        System.out.println(validate("1 (892) 445-7663"));

    }

    public static boolean validate(String str) {
        if (str.substring(0, 2).equals("+1")) {
            str = str.substring(2).trim();

        } else if (str.charAt(0) == '1') {
            str = str.substring(1).trim();
        }

        String num = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += String.valueOf(str.charAt(i));
            }
        }

        if (num.length() != 10) {
            return false;
        }

        if (str.equals(num)) {
            return true;

        } else if (str.contains("(")) {
            str = str.replaceFirst("\\(", "").replaceFirst("\\)", "").replaceFirst(" ", "").replaceFirst("-", "");
            if (str.equals(num)) {
                return true;
            }

        } else if (str.replaceAll("-", "").equals(num)) {
            return true;

        } else if (str.replaceAll("\\.", "").equals(num)) {
            return true;

        } else if (str.replaceAll(" ", "").equals(num)) {
            int count = 0;
            boolean isCorrect = true;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' ') {
                    count++;
                }
                if(count > 2) {
                    isCorrect = false;
                    break;
                }
            }
            return isCorrect;

        } else if (str.replaceAll("/", "").equals(num)) {
            return true;
        }

        return false;
    }
}
