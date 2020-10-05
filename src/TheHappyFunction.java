import java.util.ArrayList;

public class TheHappyFunction {

    public static void main(String[] args) {
        System.out.println(happyAlgorithm(89));
    }

    public static String happyAlgorithm(int num) {
        String strNum = "" + num;
        String happy = "";
        boolean isOne = false;
        int temp;
        int count = 0;
        ArrayList<Integer> intArrList = new ArrayList<>();
        intArrList.add(num);


        while(!isOne) {
            temp = 0;

            for(int i = 0; i < strNum.length(); i++) {
                temp += Math.pow(Integer.parseInt(String.valueOf(strNum.charAt(i))), 2);
            }

            if(temp == 1) {
                count++;
                happy = "HAPPY " + count;
                isOne = true;

            } else if(intArrList.contains(temp)) {
                count++;
                happy = "SAD " + count;
                isOne = true;

            }else {
                intArrList.add(temp);
                count++;
                strNum = "" + temp;
            }
        }

        return happy;
    }
}
