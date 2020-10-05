public class RemoveTheLastVowel {

    public static void main(String[] args) {

        System.out.println(removeLastVowel("Those who dare to fail miserably can achieve greatly."));

    }

    public static String removeLastVowel(String str) {
        String temp;
        String newStr = "";
        String[] strSplit = str.split(" ");
        boolean remove;

        for(int i = 0; i < strSplit.length; i++) {
            remove = true;
            temp = "";

            for(int j = strSplit[i].length() - 1; j >= 0; j--) {
                char ch = Character.toLowerCase(strSplit[i].charAt(j));

                if((ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o') && remove) {
                    remove = false;

                } else {
                    temp = String.valueOf(strSplit[i].charAt(j)) + temp;
                }
            }

            newStr += temp + " ";
        }

        return newStr.trim();
    }
}
