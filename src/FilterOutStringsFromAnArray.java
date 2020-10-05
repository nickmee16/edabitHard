import java.util.ArrayList;
import java.util.Arrays;

public class FilterOutStringsFromAnArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterArray(new String[]{"1", "2", "a", "b"})));
    }

    public static String[] filterArray(String[] str) {
        ArrayList<String> strAList = new ArrayList<>();
        boolean isNumber;

        for(int i = 0; i < str.length; i++) {
            isNumber = true;
            for(int j = 0; j < str[i].length(); j++) {
                if(!Character.isDigit(str[i].charAt(j))) {
                    isNumber = false;
                    break;
                }
            }
            if(isNumber) {
                if(!strAList.contains(str[i])) {
                    strAList.add(str[i]);
                }
            }
        }

        String[] strNums = new String[strAList.size()];

        for(int i = 0; i < strNums.length; i++) {
            strNums[i] = strAList.get(i);
        }
        return strNums;
    }
}
