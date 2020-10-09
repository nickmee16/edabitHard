public class ABACABAPattern {

    public static void main(String[] args) {
        System.out.println(abacabaPattern(3));
    }

    public static String abacabaPattern(int n) {

        if(n == 0) {
            return "";
        }

        String str = "A";

        for(int i = 1; i < n; i++) {
            str = str + String.valueOf((char) ((int) 'A' + i)) + str;
        }

        return str;
    }
}
