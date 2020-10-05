public class NeedleInAHexString {

    public static void main(String[] args) {
        String s = "asdasd";
        System.out.println(firstIndex("68 65 6c 6c 6f 20 77 6f 72 6c 64", "world"));
    }

    public static int firstIndex(String hex, String needle) {
        String[] hexSplit = hex.split(" ");
        String newStr = "";
        int num = 0;

        for(int i = 0; i < hexSplit.length; i++) {
            newStr += (char) Integer.parseInt(hexSplit[i], 16);
        }
        System.out.println(newStr);
        for(int i = 0; i < newStr.length() - needle.length() + 1; i++) {
           if(newStr.startsWith(needle, i)) {
               num = i;
               break;
           }
        }
        return num;
    }
}
