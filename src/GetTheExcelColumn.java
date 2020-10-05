public class GetTheExcelColumn {

    public static void main(String[] args) {
        System.out.println(row("STVW"));
        System.out.println(((int) 's' - (int) 'a' + 1));
        System.out.println(((int) 't' - (int) 'a' + 1));
        System.out.println(((int) 'v' - (int) 'a' + 1));
        System.out.println(((int) 'w' - (int) 'a' + 1));
    }

    public static int row(String str) {
        int totalLetters = 26;
        int result = 0;

        for(int i = 0; i < str.length(); i++) {

            if((str.length() - 1) - i == 0) {
                result += ((int) Character.toLowerCase(str.charAt(i)) - (int) 'a' + 1);

            } else {
                result += ((int) Character.toLowerCase(str.charAt(i)) - (int) 'a' + 1) * Math.pow(totalLetters , (str.length() - 1) - i);
            }
        }

        return result;
    }
}
