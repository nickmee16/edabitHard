import java.util.ArrayList;

public class CountTheNumberOfDuplicateCharacters {

    public static void main(String[] args) {

        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("Indivisibilities"));

    }

    public static int duplicateCount(String str) {
        ArrayList<String> strArrList = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(!strArrList.contains(String.valueOf(str.charAt(i)))) {
                strArrList.add(String.valueOf(str.charAt(i)));

                for(int j = i + 1; j < str.length(); j++) {
                    if(String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
                        count++;
                        break;
                    }
                }
            }
        }


        return count;
    }
}
