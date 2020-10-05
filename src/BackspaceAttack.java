import java.util.ArrayList;

public class BackspaceAttack {

    public static void main(String[] args) {
        System.out.println(erase("he##l#hel#llo"));
        System.out.println(erase("si###t boy"));
    }

    public static String erase(String str) {
        ArrayList<String> strAL = new ArrayList<>();
        StringBuilder returnString = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            strAL.add(String.valueOf(str.charAt(i)));
        }

        for(int i = 0; i < strAL.size(); i++) {
            if(i == 0 && strAL.get(i).equals("#")) {
                strAL.remove(i);
                i = i - 1;
            } else if(strAL.get(i).equals("#")) {
                strAL.remove(i);
                strAL.remove(i - 1);
                i = i - 2;
            }
        }

        for (String s : strAL) {
            returnString.append(s);
        }

        return returnString.toString();
    }
}
