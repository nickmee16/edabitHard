public class RemoveRepeatedCharacters {

    public static void main(String[] args) {
        System.out.println(unrepeated("hello"));
    }

    public static String unrepeated(String str) {
        String[] strArr = str.split("");
        String unrepStr = "";

        for(int i = 0; i < strArr.length; i++) {
            int j;
            for(j = 0; j < i; j++) {
                if(strArr[i].equals(strArr[j])) {
                    break;
                }
            }
            if(j == i) {
                unrepStr += strArr[i];
            }
        }
        return unrepStr;
    }
}
