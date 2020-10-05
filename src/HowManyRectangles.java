public class HowManyRectangles {

    public static void main(String[] args) {
        System.out.println(rectangles(5));
    }

    public static int rectangles(int step) {
        int rectangles = 0;

        for(int i = 1; i <= step; i++) {
            rectangles += Math.pow(i, 3);
        }

        return rectangles;
    }
}
