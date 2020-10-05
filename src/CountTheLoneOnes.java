public class CountTheLoneOnes {

    public static void main(String[] args) {
        System.out.println(countLoneOnes(101));
        System.out.println(countLoneOnes(1191));
        System.out.println(countLoneOnes(1111));
        System.out.println(countLoneOnes(462));
    }

    public static int countLoneOnes(long n) {
        String numStr = "" + n;
        int count = 0;

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '1') {
                if(numStr.length() == 1) {
                    count++;
                    break;
                }
                if (i == 0 ) {
                    if(numStr.charAt(i + 1) != '1') {
                        count++;
                    }
                } else if (i == numStr.length() - 1) {
                    if (numStr.charAt(i - 1) != '1') {
                        count++;
                    }
                } else if (numStr.charAt(i - 1) != '1' && numStr.charAt(i + 1) != '1') {
                    count++;
                }
            }
        }
        return count;
    }
}
