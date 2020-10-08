public class Geometry3PerimeterOfATriangle {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];
        arr[0][0] = 0;
        arr[0][1] = 0;
        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[2][0] = 0;
        arr[2][1] = 1;

        System.out.println(perimeter(arr));

    }

    public static double perimeter(int[][] point) {
        int x1 = point[0][0];
        int x2 = point[1][0];
        int x3 = point[2][0];
        int y1 = point[0][1];
        int y2 = point[1][1];
        int y3 = point[2][1];

        double s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double s2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double s3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));



        return  Math.round((s1 + s2 + s3) * 100.00) / 100.00;
    }
}
