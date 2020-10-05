public class FindTheMissingLetter {

    public static void main(String[] args) {

        System.out.println(missingLetter(new String[]{"a", "b", "c", "e", "f", "g"}));
        System.out.println(missingLetter(new String[]{"O", "Q", "R", "S"}));

    }

    public static String missingLetter(String[] arr) {
        boolean isUpperLetter =(Character.isUpperCase(arr[0].charAt(0)));
        int letterNum = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if((int) arr[i].charAt(0) + 1 != (int) arr[i + 1].charAt(0)) {
                letterNum = arr[i].charAt(0) + 1;
                break;
            }
        }

        char letterCh = (char) letterNum;

        if(isUpperLetter) {
            letterCh = Character.toUpperCase(letterCh);
        }

        return String.valueOf(letterCh);
    }
}
