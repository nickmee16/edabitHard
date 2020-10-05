import java.util.ArrayList;

public class APeriodicSeries {

    public static void main(String[] args) {
        System.out.println(periodic("3061"));
    }

    public static int periodic(String str) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add(str);

        String strTemp = "" + str;
        int intTemp = 0;
        boolean isPeriodic = false;


        while (!isPeriodic) {

            intTemp = 0;
            for(int i = 0; i < strTemp.length(); i++) {
                intTemp += Integer.parseInt(String.valueOf(strTemp.charAt(i)));
            }

            strTemp = strTemp.substring(Integer.toString(intTemp).length()) + Integer.toString(intTemp);

            if(strArrList.contains(strTemp)) {
                isPeriodic = true;

            } else {
                strArrList.add(strTemp);
            }
        }

        return strArrList.size();
    }
}
