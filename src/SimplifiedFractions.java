public class SimplifiedFractions {

    public static void main(String[] args) {

        System.out.println(simplify("4/6"));
        System.out.println(simplify("10/11"));
        System.out.println(simplify("8/4"));
        System.out.println(simplify("100/400"));

    }

    public static String simplify(String str) {
        String[] strSplit = str.split("/");
        int num1 = Integer.parseInt(strSplit[0]);
        int num2 = Integer.parseInt(strSplit[1]);
        int length = (num1 <= num2) ? num1 : num2;

        for(int i = length; i >= 1; i--) {
            if(num1 % i == 0 && num2 % i == 0) {
                num1 = num1 / i;
                num2 = num2 / i;
                i = i - 1;
            }
        }

        if(num2 == 1) {
            return Integer.toString(num1);
        }

        return "" + num1 + "/" + num2;
    }
}
