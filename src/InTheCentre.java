public class InTheCentre {

    public static void main(String[] args) {

    }

    public static boolean isCentered(String str) {
        if(str.length() % 2 == 0) {
            return false;
        }

        if(str.charAt((str.length() - 1) / 2) != ' ') {
            return true;
        }

        return false;
    }
}
