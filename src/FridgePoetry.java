import java.util.ArrayList;

public class FridgePoetry {

    public static void main(String[] args) {
        System.out.println(canBuild("got 2 go", "gogogo 2 today"));
        System.out.println(canBuild("long high add or", "highway road go long"));
    }

    public static boolean canBuild(String s1, String s2) {
        boolean isCorrect = true;
        ArrayList<String> strArrList = new ArrayList<>();

        for(int i = 0; i < s2.length(); i++) {

            if(Character.isLetter(s2.charAt(i)) || Character.isDigit(s2.charAt(i))) {
                strArrList.add(String.valueOf(s2.charAt(i)));
            }
        }

        for(int i = 0; i < s1.length(); i++) {

            if(Character.isLetter(s1.charAt(i))) {
                if(strArrList.contains(String.valueOf(s1.charAt(i)))) {
                    strArrList.remove(String.valueOf(s1.charAt(i)));

                } else {
                    isCorrect = false;
                    break;
                }
            }
        }

        return isCorrect;
    }
}
