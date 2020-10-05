import java.util.ArrayList;
import java.util.Arrays;

public class UniqueCharacterMapping {

    public static void main(String[] args) {

        characterMapping("abcd");
        System.out.println(Arrays.toString(characterMapping("hmmmmm")));

    }

    public static int[] characterMapping(String str) {
        ArrayList<String> strArrList = new ArrayList<>();
        ArrayList<Integer> intArrList = new ArrayList<>();
        int temp;
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if(!strArrList.contains(String.valueOf(str.charAt(i)))) {

                strArrList.add(String.valueOf(str.charAt(i)));
                intArrList.add(count);
                count++;

            } else {
                temp = strArrList.indexOf(String.valueOf(str.charAt(i)));
                intArrList.add(temp);
            }
        }

        int[] intArr = new int[intArrList.size()];

        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = intArrList.get(i);
        }

        return intArr;
    }
}
