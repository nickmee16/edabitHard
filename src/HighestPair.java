public class HighestPair {

    public static void main(String[] args) {

        System.out.println(highestPair(new String[]{"A", "A", "K", "K", "3"}));
        System.out.println(highestPair(new String[]{"A", "K", "Q", "J", "10"}));
        System.out.println(highestPair(new String[]{"A", "K", "K", "K", "Q"}));

    }

    public static String highestPair(String[] arr) {
        String card = "";
        char temp = '0';
        boolean hasMore;


        for (int i = 0; i < arr.length - 1; i++) {
            hasMore = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    hasMore = true;
                }
            }

            if (hasMore) {
                if (Character.isLetter(arr[i].charAt(0))) {
                    if (Character.isDigit(temp) && temp < arr[i].charAt(0)) {
                        temp = arr[i].charAt(0);

                    } else {
                        if ((temp == 'J' && arr[i].charAt(0) == 'Q')
                                || (temp == 'J' && arr[i].charAt(0) == 'K')
                                || (temp == 'J' && arr[i].charAt(0) == 'A')) {
                            temp = arr[i].charAt(0);

                        } else if ((temp == 'Q' && arr[i].charAt(0) == 'K')
                                || (temp == 'Q' && arr[i].charAt(0) == 'A')) {
                            temp = arr[i].charAt(0);

                        } else if((temp == 'K' && arr[i].charAt(0) == 'A')) {
                            temp = arr[i].charAt(0);
                        }
                    }
                }
            }
        }

        if(temp != '0') {
            card = "" + temp;
        }

        return card;
    }
}
