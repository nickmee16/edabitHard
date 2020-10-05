import java.util.ArrayList;

public class RhymeTime {

    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM."));
        System.out.println(doesRhyme("You are off to the races", "a splendid day."));
    }

    public static boolean doesRhyme(String str1, String str2) {
        String[] str1Split = str1.toLowerCase().split(" ");
        String[] str2Split = str2.toLowerCase().split(" ");
        ArrayList<String> strArrList = new ArrayList<>();

        boolean isCorrect = true;

        for(int i = 0; i < str1Split[str1Split.length - 1].length(); i++) {

            if(str1Split[str1Split.length - 1].charAt(i) == 'a'
            || str1Split[str1Split.length - 1].charAt(i) == 'e'
            || str1Split[str1Split.length - 1].charAt(i) == 'u'
            || str1Split[str1Split.length - 1].charAt(i) == 'i'
            || str1Split[str1Split.length - 1].charAt(i) == 'o') {

                strArrList.add(String.valueOf(str1Split[str1Split.length - 1].charAt(i)));
            }
        }

        for(int i = 0; i < str2Split[str2Split.length - 1].length(); i++) {

            if(str2Split[str2Split.length - 1].charAt(i) == 'a'
                    || str2Split[str2Split.length - 1].charAt(i) == 'e'
                    || str2Split[str2Split.length - 1].charAt(i) == 'u'
                    || str2Split[str2Split.length - 1].charAt(i) == 'i'
                    || str2Split[str2Split.length - 1].charAt(i) == 'o') {

                if(strArrList.contains(String.valueOf(str2Split[str2Split.length - 1].charAt(i)))) {
                    strArrList.remove(String.valueOf(str2Split[str2Split.length - 1].charAt(i)));

                } else {
                    isCorrect = false;
                    break;
                }
            }
        }

        if(strArrList.size() > 0 || !isCorrect) {
            return false;
        }
        return true;
    }
}
