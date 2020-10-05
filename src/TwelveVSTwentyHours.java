public class TwelveVSTwentyHours {

    public static void main(String[] args) {
        System.out.println(convertTime("12:00 am"));
        System.out.println(convertTime("6:20 pm"));
        System.out.println(convertTime("21:00"));
        System.out.println(convertTime("5:05"));
    }

    public static String convertTime(String time) {
        String[] strArr = time.split(" ");
        String[] hourMinutesSplit = strArr[0].split(":");

        if(strArr.length == 1) {
            if (Integer.parseInt(hourMinutesSplit[0]) > 12) {
                hourMinutesSplit[0] = "" + (Integer.parseInt(hourMinutesSplit[0]) - 12);
                return hourMinutesSplit[0] + ":" + hourMinutesSplit[1] + " pm";
            } else {
                return time + " am";
            }
        }

        if(strArr[1].equals("am") && Integer.parseInt(hourMinutesSplit[0]) < 12) {
            return strArr[0];
        } else if(strArr[1].equals("pm")) {
            hourMinutesSplit[0] = "" + (Integer.parseInt(hourMinutesSplit[0]) + 12);
            return hourMinutesSplit[0] + ":" +hourMinutesSplit[1];
        } else {
            return "0:00";
        }
    }
}
