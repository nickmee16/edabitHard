public class ExpressNumberInExpandedNotation {

    public static void main(String[] args) {
        System.out.println(expand(17000000));
    }


    public static String expand(long num) {
        String strNum = "" + num;
        String result = "";

        for (int i = 0; i < strNum.length(); i++) {
            if(strNum.charAt(i) != '0') {
                if ((strNum.length() - 1) - i == 0) {
                    result += String.valueOf(strNum.charAt(i));
                } else {
                    result += " " + Math.round(Integer.parseInt(String.valueOf(strNum.charAt(i))) * Math.pow(10, (strNum.length() - 1) - i)) + " +";
                }
            }
        }

        if(result.charAt(result.length() - 1) == '+') {
            result = result.substring(0, result.length() - 1);
        }

        return result.trim();
    }
}
