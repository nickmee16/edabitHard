public class HoleNumberSequence {

    public static void main(String[] args) {
        System.out.println(sumOfHoles(4));
        System.out.println(sumOfHoles(6));
        System.out.println(sumOfHoles(8));
        System.out.println(sumOfHoles(6259));
    }

    public static int sumOfHoles(int N) {
        int count = 0;
        String strN;

        for(int i = 4; i <= N; i++) {
            strN = Integer.toString(i);

            for(int j = 0; j < strN.length(); j++) {
                if(strN.charAt(j) == '4'
                        || strN.charAt(j) == '6'
                        || strN.charAt(j) == '9'
                        || strN.charAt(j) == '0') {
                    count++;
                } else if(strN.charAt(j) == '8') {
                    count += 2;
                }
            }
        }
        return count;
    }
}
