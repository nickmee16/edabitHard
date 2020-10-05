

public class PersistentLittleBugger {

    public static void main(String[] args) {
        System.out.println(bugger(39));
        System.out.println(bugger(999));
    }

    public static int bugger(int num) {
        String numStr = "" + num;
        char[] chArr = numStr.toCharArray();
        if(chArr.length < 2) {
            return 0;
        }

        int count = 0;
        int result = 1;
        int temp = 0;

        for (int i = chArr.length - 1; i >= 0;) {
            if (i == 0) {
                temp = Integer.parseInt(String.valueOf(chArr[i]));
                result *= temp;
                String tempString = "" + result;
                chArr = tempString.toCharArray();
                count++;
                if(chArr.length == 1) {
                    break;
                }
                result = 1;
                i = chArr.length - 1;
            } else {
                temp = Integer.parseInt(String.valueOf(chArr[i]));
                result *= temp;
                i--;
            }
        }
        return count;
    }
}
