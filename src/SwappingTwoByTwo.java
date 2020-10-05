public class SwappingTwoByTwo {

    public static void main(String[] args) {
        System.out.println(swapTwo("ABCDEFGH"));
        System.out.println(swapTwo("munchkins"));
    }

    public static String swapTwo(String str) {
        String swap = "";

        for(int i = 0; i < str.length();) {
            if(i + 4 <= str.length()) {
                swap += str.substring(i + 2, i + 4) + str.substring(i, i + 2);
                i += 4;
            } else {
                swap += str.substring(i, i + 1);
                i++;
            }

        }
        return swap;
    }
}
