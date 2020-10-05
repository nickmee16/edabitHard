public class TheRedYellowSequence {

    public static void main(String[] args) {
        System.out.println(rySeq(2, "all"));
        System.out.println(rySeq(3, "yellow"));
        System.out.println(rySeq(28, "red"));
        System.out.println(rySeq(1, "blue"));
    }

    public static int rySeq(int n, String s) {

        if(!s.equals("yellow") && !s.equals("all") && !s.equals("red")) {
            return -1;
        }

        if(n == 0) {
            return n;
        }

        if(n == 1) {
            if(s.equals("red") || s.equals("all")) {
                return n;

            } else {
                return  0;
            }
        }

        int totalSqrs = (int) Math.pow(n, 2) + (int) Math.pow(n - 1, 2);
        int count = 1;

        for(int i = 2; i < n; i++) {
            count++;
        }

        int redSqrts = n + count;
        int yellowSqrts = totalSqrs - redSqrts;

        if(s.equals("red")) {
            return redSqrts;

        } else if(s.equals("yellow")) {
            return yellowSqrts;

        } else {
            return totalSqrs;
        }
    }
}
