public class MangleТheString {

    public static void main(String[] args) {
        System.out.println(mangle("Fun times!"));
    }

    public static String mangle(String str) {
        char[] chArr = str.toCharArray();
        String mangle = "";

        for(int i = 0; i < chArr.length; i++) {
            if(Character.isLetter(chArr[i])) {
                if(chArr[i] == 'z' || chArr[i] == 'Z') {
                    mangle += "A";
                } else {
                    int charNum = (int) chArr[i] + 1;
                    char ch = (char) charNum;
                    if(ch == 'a' || ch == 'i' || ch == 'o'
                    || ch == 'e' || ch == 'u') {
                        ch = Character.toUpperCase(ch);
                        mangle += String.valueOf(ch);
                    } else {
                        mangle += String.valueOf(ch);
                    }
                }
            } else {
                mangle += String.valueOf(chArr[i]);
            }
        }
        return mangle;
    }
}
