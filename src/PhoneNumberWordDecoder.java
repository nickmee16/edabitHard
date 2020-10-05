public class PhoneNumberWordDecoder {

    public static void main(String[] args) {
        System.out.println(textToNum("123-647-EYES"));
    }

    public static String textToNum(String phone) {
        char[] chArr = phone.toCharArray();

        for(int i = 0; i < chArr.length; i++) {
            if(Character.isLetter(chArr[i])) {
                if(chArr[i] == 'A' || chArr[i] == 'B' || chArr[i] == 'C') {
                    chArr[i] = '2';
                } else if(chArr[i] == 'D' || chArr[i] == 'E' || chArr[i] == 'F') {
                    chArr[i] = '3';
                } else if(chArr[i] == 'G' || chArr[i] == 'H' || chArr[i] == 'I') {
                    chArr[i] = '4';
                } else if(chArr[i] == 'J' || chArr[i] == 'K' || chArr[i] == 'L') {
                    chArr[i] = '5';
                } else if(chArr[i] == 'M' || chArr[i] == 'N' || chArr[i] == 'O') {
                    chArr[i] = '6';
                } else if(chArr[i] == 'P' || chArr[i] == 'Q' || chArr[i] == 'R' || chArr[i] == 'S') {
                    chArr[i] = '7';
                } else if(chArr[i] == 'T' || chArr[i] == 'U' || chArr[i] == 'V') {
                    chArr[i] = '8';
                } else if(chArr[i] == 'W' || chArr[i] == 'X' || chArr[i] == 'Y' || chArr[i] == 'Z') {
                    chArr[i] = '9';
                }
            }
        }
        return String.valueOf(chArr);
    }
}
