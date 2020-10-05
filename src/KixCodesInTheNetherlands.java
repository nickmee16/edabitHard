import java.util.regex.Pattern;

public class KixCodesInTheNetherlands {

    public static void main(String[] args) {

        System.out.println(kixCode("PostNL, Postbus 30250, 2500 GG 's Gravenhage"));
        System.out.println(kixCode("Liesanne B Wilkens, Kogge 11-1, 1657 KA Abbekerk"));

    }

    public static String kixCode(String addr) {
        String[] addrSplited = addr.split(Pattern.quote(","));
        String firstPart = "";
        String secondPart = "";

        String[] firstArr = addrSplited[2].split(" ");
        firstPart = firstArr[1] + firstArr[2];

        for(int i = 0; i < addrSplited[1].length(); i++) {
            if(Character.isDigit(addrSplited[1].charAt(i))) {

                for(int j = i; j < addrSplited[1].length(); j++) {

                    if(Character.isDigit(addrSplited[1].charAt(j))) {
                        secondPart += String.valueOf(addrSplited[1].charAt(j));

                    } else if(Character.isLetter(addrSplited[1].charAt(j))) {
                        secondPart += String.valueOf(Character.toUpperCase(addrSplited[1].charAt(j)));

                    } else {
                        secondPart += "X";
                    }
                }

                break;
            }
        }

        return firstPart + secondPart;
    }
}
