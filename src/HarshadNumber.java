public class HarshadNumber {

    public static void main(String[] args) {

        System.out.println(isHarshad(75));
        System.out.println(isHarshad(171));


    }

    public static boolean isHarshad(int n) {

        String strN = "" + n;
        int newNum = 0;

        for (int i = 0; i < strN.length(); i++) {
            newNum += Integer.parseInt(String.valueOf(strN.charAt(i)));
        }

        double dwhole =(double) n / (double) newNum;
        int iWhole = n /newNum;

        if(dwhole == iWhole) {
            return true;
        }

        return false;
    }
}
