public class OnesAndZeroes {

    public static void main(String[] args) {

        System.out.println(sameLength("110011100010"));
        System.out.println(sameLength("101010110"));
        System.out.println(sameLength("111100001100"));
        System.out.println(sameLength("111"));

    }

    public static boolean sameLength(String str) {
        int count0 = 0;
        int count1 = 0;
        boolean isCorrect = true;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                count1++;

            } else {
                int j;
                for(j = i; j < str.length(); j++) {

                    if(str.charAt(j) == '0') {
                        count0++;
                    } else {
                         break;
                    }
                }

                if(count0 != count1 || count0 == str.length()) {
                    isCorrect = false;
                    break;

                } else {
                    count0 = 0;
                    count1 = 0;
                    i = j - 1;
                }
            }

            if(i == str.length() - 1 && count1 != count0) {
                isCorrect = false;
            }
        }

        return isCorrect;
    }
}
