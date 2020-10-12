public class MindTheGap {

    public static void main(String[] args) {

//        System.out.println(gapful(103));
        System.out.println(gapful(1442));
        System.out.println(gapful(3345));
        System.out.println(gapful(4780));


    }

    public static int gapful(int n) {

        if(n <= 100) {
            return 100;
        }

        int count = 0;
        String strNUp = Integer.toString(n);
        String strNDown = Integer.toString(n);
        String devUp = "";
        String devDown = "";
        int devIUp;
        int devIDown;
        int theNum = 0;

        boolean isPossible = true;

        while (isPossible) {

            devUp = String.valueOf(strNUp.charAt(0)) + String.valueOf(strNUp.charAt(strNUp.length() - 1));
            devIUp = Integer.parseInt(devUp);

            devDown = String.valueOf(strNDown.charAt(0)) + String.valueOf(strNDown.charAt(strNDown.length() - 1));
            devIDown = Integer.parseInt(devDown);
            count++;


            if(Integer.parseInt(strNDown) % devIDown == 0 && Integer.parseInt(strNDown) >= 100) {
                theNum = Integer.parseInt(strNDown);
                isPossible = false;

            } else if(Integer.parseInt(strNUp) % devIUp == 0) {
                theNum = Integer.parseInt(strNUp);
                isPossible = false;

            } else {
                strNDown = Integer.toString(n - count);
                strNUp = Integer.toString(n + count);
            }
        }

        return theNum;
    }
}
