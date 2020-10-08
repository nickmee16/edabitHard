public class StarShorthand {

    public static void main(String[] args) {

        System.out.println(toStarShorthand("abbccc"));
        System.out.println(toStarShorthand("77777geff"));
        System.out.println(toStarShorthand("abc"));
        System.out.println(toStarShorthand(""));

    }

    public static String toStarShorthand(String str) {
        String temp = "";
        int count;
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            count = 0;
            if(!String.valueOf(str.charAt(i)).equals(temp)) {
                temp = String.valueOf(str.charAt(i));

                for(int j = i; j <str.length(); j++) {
                    if(String.valueOf(str.charAt(j)).equals(temp)) {
                        count++;
                    } else {
                        i = j - 1;
                        break;
                    }
                }
            }

            if(count > 1) {
                newStr.append(temp).append("*").append(count);
            } else if(count == 1) {
                newStr.append(temp);
            }
        }

        return newStr.toString();
    }
}
