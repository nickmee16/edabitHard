public class BasicPigLatinTranslation {

    public static void main(String[] args) {

        System.out.println(pigLatin("Cats are great pets."));
        System.out.println(pigLatin("A diamond is not enough."));

    }

    public static String pigLatin(String str) {
        String[] strArr = str.split(" ");
        StringBuilder strSB = new StringBuilder();
        String word;
        String temp ;

        for(int i = 0; i < strArr.length; i++) {
            word = "";
            temp = "";

            for (int j = 0; j < strArr[i].length(); j++) {

                if (Character.isLetter(strArr[i].charAt(j))) {

                    if (Character.isUpperCase(strArr[i].charAt(j))) {

                        if ((strArr[i].charAt(j) == 'A' || strArr[i].charAt(j) == 'E'
                                || strArr[i].charAt(j) == 'U' || strArr[i].charAt(j) == 'I'
                                || strArr[i].charAt(j) == 'O') && j == 0) {
                            word += strArr[i].charAt(j);
                            temp += "way";

                        } else if(j == 0) {
                            temp = Character.toLowerCase(strArr[i].charAt(0)) + "ay";
                            word += Character.toUpperCase(strArr[i].charAt(j + 1));
                            j++;

                        } else {
                            word += String.valueOf(strArr[i].charAt(j));
                        }

                    } else {
                        if ((strArr[i].charAt(j) == 'a' || strArr[i].charAt(j) == 'e'
                                || strArr[i].charAt(j) == 'u' || strArr[i].charAt(j) == 'i'
                                || strArr[i].charAt(j) == 'o') && j == 0) {
                            word += strArr[i].charAt(j);
                            temp += "way";

                        } else if(j == 0) {
                            temp = strArr[i].charAt(0) + "ay";

                        } else {
                            word += String.valueOf(strArr[i].charAt(j));
                        }

                    }

                } else {
                    temp += strArr[i].charAt(j);
                }
            }

            strSB.append(word).append(temp).append(" ");
        }

        return strSB.toString().trim();
    }
}
