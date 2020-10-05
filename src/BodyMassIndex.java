public class BodyMassIndex {

    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("53.3 kilos","1.7 meters"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
    }

    public static String BMI(String weight, String height) {
        double kg = 0;
        double m = 0;
        double BMI = 0;

        String[] weightSplited = weight.split(" ");
        String[] heightSplited = height.split(" ");

        if(weightSplited[1].equals("pounds")) {
            kg = Double.parseDouble(weightSplited[0]) * 0.453592;
        } else {
            kg = Double.parseDouble(weightSplited[0]);
        }

        if(heightSplited[1].equals("inches")) {
            m = Double.parseDouble(heightSplited[0]) * 0.0254;
        } else {
            m = Double.parseDouble(heightSplited[0]);
        }

        BMI = kg / Math.pow(m, 2);
        BMI =  Math.round(BMI * 10.0) / 10.0;

        if(BMI < 18.5) {
            return Double.toString(BMI) + " Underweight";
        } else if(BMI >= 18.5 && BMI <= 24.9) {
            return Double.toString(BMI) + " Normal weight";
        } else if(BMI >= 25 && BMI <= 29.9) {
            return Double.toString(BMI) + " Overweight";
        } else if(BMI >= 30) {
            return Double.toString(BMI) + " Obesity";
        }
        return "";
    }
}
