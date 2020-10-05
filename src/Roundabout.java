public class Roundabout {

    public static void main(String[] args) {
//        System.out.println(roundabout(4, 50));
//        System.out.println(roundabout(4, 320));
//        System.out.println(roundabout(6, 60));
//        System.out.println(roundabout(3, 100));
        System.out.println(roundabout(6, 360));
        System.out.println(360 % 360);
    }

    public static String roundabout(int siz, int dgr) {
        int dgrPart = 360 / siz;
        int temp;
        int exit = 0;
        int dgrExit = (dgr >= 360) ? (dgr % 360) + 30 : dgr + 30;

        for(int i = 1; i <= siz; i++) {
            temp = dgrPart * (i);

            if(dgrExit > temp && dgrExit < temp + dgrPart && temp + dgrPart == 360) {
                exit = 0;
                break;

            } else if(dgrExit > temp && dgrExit < temp + dgrPart){
                exit = i + 1;
                break;

            } else if(dgrExit <= temp) {
                exit = i;
                break;
            }
        }

        return "Exit " + exit;
    }
}
