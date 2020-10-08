public class PiggyBank {

    public static void main(String[] args) {

        System.out.println(NumberOfDays(2050, 1200, 10));
        System.out.println(NumberOfDays(10000, 2500, 50));

    }

    public static int NumberOfDays(int cost, int savings, int start) {
        int moneyNeeded = cost - savings;
        int days = 1;
        int count = 0;
        int weeks = 0;

        for(int i = start; i < moneyNeeded; i += start + count + weeks) {

            days++;
            count++;

            if(count == 7) {
                count = 0;
                weeks++;
            }
        }

        return days;
    }
}
