public class Geometry2LengthOfLineSegmentIn3D {

    public static void main(String[] args) {

    }

    public static double lineLength(int[][] point) {
        double x1 = point[0][0];
        double x2 = point[1][0];
        double y1 = point[0][1];
        double y2 = point[1][1];
        double z1 = point[0][2];
        double z2 = point[1][2];

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }
}
