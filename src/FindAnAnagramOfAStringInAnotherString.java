import java.util.ArrayList;

public class FindAnAnagramOfAStringInAnotherString {

    public static void main(String[] args) {

        System.out.println(anaStrStr("car", "race"));
        System.out.println(anaStrStr("nod", "done"));
        System.out.println(anaStrStr("bag", "grab"));
        System.out.println(anaStrStr("sat", "spatula"));
        System.out.println(anaStrStr("vein", "universal"));

    }

    public static boolean anaStrStr(String needle, String haystack) {
        ArrayList<String> strALNeedle = new ArrayList<>();

        for(int i = 0; i < needle.length(); i++) {
            strALNeedle.add(String.valueOf(needle.charAt(i)));

        }

        boolean isCorrect = false;

        for(int i = 0; i < haystack.length() - strALNeedle.size(); i++) {
            ArrayList<String> copy = new ArrayList<>();
            copy = (ArrayList<String>)strALNeedle.clone();
            int count = 0;



            for(int j = i; j < strALNeedle.size() + i; j++) {

                if(copy.contains(String.valueOf(haystack.charAt(j)))) {

                    copy.remove(String.valueOf(haystack.charAt(j)));
                    count++;
                }
            }

            if(count == strALNeedle.size()) {
                isCorrect = true;
                break;
            }
        }

        return isCorrect;
    }
}
