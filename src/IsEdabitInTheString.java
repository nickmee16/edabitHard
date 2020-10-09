public class IsEdabitInTheString {

    public static void main(String[] args) {

        System.out.println(edabitInString("eddaaabt"));
        System.out.println(edabitInString("edwardisabletodoit"));
        System.out.println(edabitInString("abecdfghijklmnopqrstuvwxyz"));

    }

    public static String edabitInString(String s) {
        String edabit = "edabit";
        StringBuilder str = new StringBuilder();
        int position = 0;

        for(int i = 0; i < edabit.length(); i++) {

            for(int j = position; j < s.length(); j++) {
                if(edabit.charAt(i) == s.charAt(j)) {
                    str.append(s.charAt(j));
                    position = j;
                    break;
                }
            }

            if(str.toString().equals(edabit)) {
                break;
            }

            if(position == s.length() - 1) {
                break;
            }
        }

        if(str.toString().equals(edabit)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
