import java.util.Arrays;

public class ContactList {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortContacts(new String[]{"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"},"DESC")));
        System.out.println(Arrays.toString(sortContacts(null, "DESC")));

    }

    public static String[] sortContacts(String[] arr, String sortBy) {

        if(arr == null) {
            return new String[0];
        }

        if(arr.length <= 1) {
            return arr;
        }

        if(sortBy.equals("DESC")) {
            for(int i = 0; i < arr.length; i++) {

                for(int j = i + 1; j < arr.length; j++ ) {

                    String[] nameSplitJ = arr[i].split(" ");
                    String[] nameSplitI = arr[j].split(" ");

                    if((int) nameSplitI[1].charAt(0) > (int) nameSplitJ[1].charAt(0)) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }

        } else {
            for(int i = 0; i < arr.length; i++) {

                for(int j = i + 1; j < arr.length; j++ ) {

                    String[] nameSplitJ = arr[i].split(" ");
                    String[] nameSplitI = arr[j].split(" ");

                    if((int) nameSplitI[1].charAt(0) < (int) nameSplitJ[1].charAt(0)) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
        }

        return arr;
    }
}
