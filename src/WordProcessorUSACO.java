public class WordProcessorUSACO {

    public static void main(String[] args) {

        System.out.println(wordprocessor(10, 7,  "hello my name is Bessie and this is my essay"));
        System.out.println(wordprocessor(11,16,"college students in the USA are eligible for selection as finalists"));

    }

    public static String wordprocessor(int n, int k, String e) {
        StringBuilder str = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        String[] eSplit = e.split(" ");
        int count = 0;

        for(int i = 0; i < n; i++) {
            count += eSplit[i].length();

            if(i == n - 1 && count > k) {

                if(!temp.toString().equals("")) {
                    str.append(temp.toString().trim()).append("\n");
                }

                str.append(eSplit[i]);

            } else if(count > k) {

                str.append(temp.toString().trim()).append("\n");
                temp = new StringBuilder(eSplit[i]);
                count = eSplit[i].length();

            } else if(count == k) {

                temp.append(" ").append(eSplit[i]);
                str.append(temp.toString().trim()).append("\n");
                temp = new StringBuilder();
                count = 0;

            } else {

                temp.append(" ").append(eSplit[i]);
            }

        }

        return str.toString().trim();
    }
}
