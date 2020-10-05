public class JavelinParabolicThrow {

    public static void main(String[] args) {
        double radians = Math.toRadians(45);
//        System.out.println((Math.pow(36.7, 2) * Math.pow(Math.sin(radians) , 2)  / (2 * 9.82)));
//        System.out.println((Math.pow(36.7, 2) * 2 * Math.sin(radians) * Math.cos(radians)) / 9.82);

        System.out.println(javelinThrow(36.7, 45));
        System.out.println(javelinThrow(100.0,37));
    }

    public static String javelinThrow(double v, int a) {
        double radians = Math.toRadians(a);
        double g = 9.81;

        double maxY = (Math.pow(v, 2) * Math.pow(Math.sin(radians) , 2))  / (2 * g);
        maxY = Math.round(maxY) ;

        double maxX = (Math.pow(v, 2) * 2 * Math.sin(radians) * Math.cos(radians)) / g;
        maxX = Math.round(maxX);

        return "Ymax=" + (int) maxY + "m, Xmax=" + (int) maxX + "m";
    }
}
