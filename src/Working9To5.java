import java.text.DecimalFormat;

public class Working9To5 {

    public static void main(String[] args) {

        System.out.println(overTime(new double[]{13, 21, 38.6, 1.8}));
        System.out.println(overTime(new double[]{18, 20, 32.5, 2}));
        System.out.println(overTime(new double[]{10.5, 17, 32.25, 1.5}));

    }

    public static String overTime(double[] arr) {
        double overtimeHours = 0;

        if(arr[0] < 9 && arr[1] < 9) {
            overtimeHours = arr[1] - arr[0];

        } else if(arr[0] > 17 && arr[1] > 17) {
            overtimeHours = arr[1] - arr[0];

        } else {

            if(arr[0] < 9) {
                overtimeHours += 9 - arr[0];
            }
            if(arr[1] > 17) {
                overtimeHours += arr[1] - 17;
            }
        }


        double normalHours = (arr[1] - arr[0]) - overtimeHours;
        double normalHoursSalary = normalHours * arr[2];
        double overtimeSalary = overtimeHours * (arr[2] * arr[3]);


        DecimalFormat df = new DecimalFormat("0.00");

        return "$" + df.format(Math.round((normalHoursSalary + overtimeSalary) * 100.0) / 100.0);
    }
}
