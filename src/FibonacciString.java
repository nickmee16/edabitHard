public class FibonacciString {

    public static void main(String[] args) {
        System.out.println(generateString(5, new String[] {"e", "a"}));
    }

    public static String generateString(int n, String[] s) {
        if(n < 2) {
            return "invalid";
        }

        if(n == 2) {
            return s[0] + ", " + s[1];
        }

        String[] strArr = new String[n];
        strArr[0] = s[0];
        strArr[1] = s[1];

        for(int i = 2; i < strArr.length; i++) {
            strArr[i] = strArr[i - 1] + strArr[i - 2];
        }

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < strArr.length; i++) {

            if(i == strArr.length - 1) {
                str.append(strArr[i]);

            } else {
                str.append(strArr[i]).append(", ");
            }
        }

        return str.toString();
    }
}
