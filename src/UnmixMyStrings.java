public class UnmixMyStrings {

    public static void main(String[] args) {
        System.out.println(unmix("hTsii  s aimex dpus rtni.g"));
        System.out.println(unmix(""));
        System.out.println(unmix("12345"));

    }

    public static String unmix(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++) {
            if(i == str.length() - 1 && i % 2 == 0) {
                newStr +=String.valueOf(str.charAt(i));
            } else {
                newStr +=String.valueOf(str.charAt(i + 1)) + String.valueOf(str.charAt(i));
                i++;
            }
        }
        return newStr;
    }
}
