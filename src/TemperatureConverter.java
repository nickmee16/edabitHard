import java.util.regex.Pattern;

public class TemperatureConverter {

    public static void main(String[] args) {

        System.out.println(convert("35*C"));
        System.out.println(convert("19*F"));
        System.out.println(convert("16*C"));
    }

    public static String convert(String deg) {

        String[] strSplited = deg.split(Pattern.quote("*"));

        if (strSplited.length == 1) {
            return "Error";
        }

        if (strSplited[1].equals("F")) {
            double f = Double.parseDouble(strSplited[0]);
            double result = (f - 32) / 1.8;

            return "" + Math.round(result) +"*C";
        } else {

            double c = Double.parseDouble(strSplited[0]);
            double result = (c * 1.8) + 32 ;

            return "" + Math.round(result) +"*F";
        }
    }
}
