import java.util.ArrayList;

public class MagicSigilGenerator {

    public static void main(String[] args) {

        System.out.println(sigilize("i am healthy"));
        System.out.println(sigilize("I FOUND MY SOULMATE"));
        System.out.println(sigilize("I have a job I enjoy and it pays well"));

    }

    public static String sigilize(String desire) {
        ArrayList<String> chAList = new ArrayList<>();
        char[] chArr = desire.toCharArray();
        String str = "";

        for (int i = 0; i < chArr.length; i++) {
            if (Character.isLetter(chArr[i])) {
                char temp;
                if (Character.isLowerCase(chArr[i])) {
                    temp = Character.toUpperCase(chArr[i]);
                } else {
                    temp = chArr[i];
                }
                if (!String.valueOf(temp).equals("A")
                        && !String.valueOf(temp).equals("E")
                        && !String.valueOf(temp).equals("U")
                        && !String.valueOf(temp).equals("O")
                        && !String.valueOf(temp).equals("I")) {
                    System.out.println(temp);
                    if (chAList.contains(String.valueOf(temp))) {
                        chAList.remove(String.valueOf(temp));
                        chAList.add(String.valueOf(temp));
                    } else {
                        chAList.add(String.valueOf(temp));
                    }

                }
            }

        }

        for (int i = 0; i < chAList.size(); i++) {
            str += String.valueOf(chAList.get(i));
        }

        return str;
    }
}
