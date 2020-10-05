public class SecretFunction {

    public static void main(String[] args) {

    }

    public static int secret(int i) {
        String strI = "" + i;
        int num1 = Integer.parseInt(String.valueOf(strI.charAt(0)));
        int num2 = Integer.parseInt(String.valueOf(strI.charAt(1)));

        return (int) Math.pow(num1, num2) - (num1 * num2);
    }
}
