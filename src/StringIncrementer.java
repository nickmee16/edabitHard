public class StringIncrementer {

    public static void main(String[] args) {

        System.out.println(incrementString("foo"));
        System.out.println(incrementString("foobar0009"));
        System.out.println(incrementString("foo099"));

    }

    public static String incrementString(String str) {
        if(!Character.isDigit(str.charAt(str.length() - 1))) {
            return str + 1;
        }

        StringBuilder num = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))) {
                letters.append(String.valueOf(str.charAt(i)));

            } else {
                num.append(String.valueOf(str.charAt(i)));
                count++;
            }
        }

        int numI = Integer.parseInt(num.toString()) + 1;
        num = new StringBuilder(Integer.toString(numI));

        while (num.length() != count) {
            num.insert(0, "0");
        }

        return letters.toString() + num.toString();
    }
}
