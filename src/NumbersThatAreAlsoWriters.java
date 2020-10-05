public class NumbersThatAreAlsoWriters {

    public static void main(String[] args) {
        System.out.println(isAutobiographical(12345));
        System.out.println(isAutobiographical(1210));
    }

    public static boolean isAutobiographical(int n) {
        boolean isCorrect = true;
        int count = 0;
        String numStr = "" + n;

        for(int i = 0; i < numStr.length(); i++) {
            for(int j = 0; j < numStr.length(); j++) {
                if(i == Integer.parseInt(String.valueOf(numStr.charAt(j)))) {
                    count++;
                }
            }
            if(count != Integer.parseInt(String.valueOf(numStr.charAt(i)))) {
                isCorrect = false;
                break;
            }
            count = 0;
        }
        return isCorrect;
    }
}
