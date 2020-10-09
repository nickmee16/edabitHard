import java.util.ArrayList;
import java.util.Arrays;

public class ReturnTheMostFrequentCharacter {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(mostFrequentChar(new String[]{"apple", "bandage", "yodel", "make"})));
        System.out.println(Arrays.toString(mostFrequentChar(new String[]{"the", "hills", "are", "alive", "with", "the", "sound", "of", "music"})));

    }

    public static String[] mostFrequentChar(String[] arr) {
        String str = "";
        ArrayList<String> letters = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            str += arr[i];

            for(int j = 0; j < arr[i].length(); j++) {

                if(!letters.contains(String.valueOf(arr[i].charAt(j)))) {

                    letters.add(String.valueOf(arr[i].charAt(j)));
                }
            }
        }

        StringBuilder freqLetter = new StringBuilder();
        int count;
        int temp = 0;

        for(int i = 0; i < letters.size(); i++) {
            count = 0;

            for(int j = 0; j < str.length(); j++) {
                if(letters.get(i).equals(String.valueOf(str.charAt(j)))) {
                    count++;
                }
            }

            if(count > temp) {
                temp = count;
                freqLetter = new StringBuilder(letters.get(i));

            } else if(count == temp) {
                freqLetter.append(letters.get(i));
            }
        }

        String[] lettersSplit = freqLetter.toString().split("");
        Arrays.sort(lettersSplit);

        return lettersSplit;
    }
}
