public class Spoonerisms {

    public static void main(String[] args) {

        System.out.println(spoonerise("history lecture"));
        System.out.println(spoonerise("edabit rules!"));
        System.out.println(spoonerise("crushing failure"));
    }

    public static String spoonerise(String phrase) {
        String[] strSplit = phrase.split(" ");
        String temp1 = "";
        String temp2 = "";
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < strSplit[0].length(); i++) {

            if (strSplit[0].charAt(i) == 'a'
                    || strSplit[0].charAt(i) == 'e'
                    || strSplit[0].charAt(i) == 'u'
                    || strSplit[0].charAt(i) == 'i'
                    || strSplit[0].charAt(i) == 'o') {

                str1 = strSplit[0].substring(i);
                break;

            } else {
                temp1 += String.valueOf(strSplit[0].charAt(i));
            }

        }

        for (int i = 0; i < strSplit[1].length(); i++) {

            if (strSplit[1].charAt(i) == 'a'
                    || strSplit[1].charAt(i) == 'e'
                    || strSplit[1].charAt(i) == 'u'
                    || strSplit[1].charAt(i) == 'i'
                    || strSplit[1].charAt(i) == 'o') {

                str2 = strSplit[1].substring(i);
                break;

            } else {
                temp2 += String.valueOf(strSplit[1].charAt(i));
            }

        }

        return temp2 + str1 + " " + temp1 + str2;
    }
}
