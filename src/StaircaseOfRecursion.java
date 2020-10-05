public class StaircaseOfRecursion {

    public static void main(String[] args) {
        System.out.println(waysToClimb(6));
    }

    public static int waysToClimb(int num) {
        int n = num + 1;
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];
        return f[n];
    }
}
