public class MinimumSwapsToAlternateABinaryString {

    public static void main(String[] args) {
        System.out.println(minSwaps("010010111"));
        System.out.println(minSwaps("10010"));
    }

    public static int minSwaps(String str) {
        String strStarts0 = "";
        String strStarts1 = "";

        for(int i = 0; i < str.length(); i++) {

            if(i % 2 == 0) {
                strStarts0 += "0";
            } else {
                strStarts0 += "1";
            }
        }

        for(int i = 0; i < str.length(); i++) {

            if(i % 2 == 0) {
                strStarts1 += "1";
            } else {
                strStarts1 += "0";
            }
        }

        int swaps0 = 0;
        int swaps1 = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) != strStarts0.charAt(i)) {
                swaps0++;
            }

            if(str.charAt(i) != strStarts1.charAt(i)) {
                swaps1++;
            }

        }


        return Math.min(swaps0, swaps1);
    }
}
