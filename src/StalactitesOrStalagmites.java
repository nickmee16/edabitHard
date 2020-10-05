public class StalactitesOrStalagmites {

    public static void main(String[] args) {

    }

    public static String mineralFormation(int[][] form) {
        boolean hasStalactites = false;
        boolean hasStalagmites = false;

        for(int i = 0; i < form[0].length; i++) {
            if(form[0][i] == 1) {
                hasStalactites = true;
                break;
            }
        }

        for(int i = 0; i < form[form.length - 1].length; i++) {
            if(form[form.length - 1][i] == 1) {
                hasStalagmites = true;
                break;
            }
        }

        if(hasStalactites && hasStalagmites) {
            return "both";

        } else if(hasStalactites) {
            return "stalactites";

        } else {
            return "stalagmites";
        }
    }
}
