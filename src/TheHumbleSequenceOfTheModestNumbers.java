public class TheHumbleSequenceOfTheModestNumbers {

    public static void main(String[] args) {
        System.out.println(isModest(2036));
        System.out.println(isModest(3412));
        System.out.println(isModest(21333));
        System.out.println(isModest(20010));
    }

    public static boolean isModest(int num) {

        if(num < 10) {
            return false;
        }

        String strNum = "" + num;
        int temp;
        int resultNeeded;
        boolean isModest = false;

        for(int i = 1; i < strNum.length(); i++) {

            temp = Integer.parseInt(strNum.substring(i));
            resultNeeded = Integer.parseInt(strNum.substring(0, i));

            if(temp == 0) {
                break;
            }

            if(num % temp == resultNeeded) {
                isModest = true;
                break;
            }
        }

        return isModest;
    }
}
