public class Geometry1LengthOfLineSegment {

    public static void main(String[] args) {

    }

    public static double lineLength(int[][] point) {

        double line = Math.pow(point[1][0] - point[0][0], 2) + Math.pow(point[1][1] - point[0][1], 2);
        return Math.sqrt(line);
    }
}
