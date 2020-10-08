public class TwentyFourHourTime {

    public static void main(String[] args) {

        System.out.println(convertTime("07:05:45PM"));
        System.out.println(convertTime("12:40:22AM"));
        System.out.println(convertTime("12:45:54PM"));

    }

    public static String convertTime(String s) {

        if(s.substring(s.length() - 2).equals("PM")) {

            if(Integer.parseInt(s.substring(0,2)) < 12) {
                return (12 + Integer.parseInt(s.substring(0,2))) + s.substring(2, s.length() - 2);

            } else {
                return s.substring(0, s.length() - 2);
            }

        } else if(s.substring(s.length() - 2).equals("AM")) {

            if(Integer.parseInt(s.substring(0, 2)) == 12) {
                return "00" + s.substring(2, s.length() - 2);

            } else {
                return s.substring(0, s.length() - 2);
            }
        }

        return "";
    }
}
