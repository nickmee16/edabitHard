public class BuildingUpAWord {

    public static void main(String[] args) {
        System.out.println(canBuild(new String[]{"a", "at", "ate", "late", "plate", "plates"}));
        System.out.println(canBuild(new String[]{"i", "it", "bit", "bite", "biters"}));
    }

    public static boolean canBuild(String[] arr) {
        boolean canBeBuild = true;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i].length() + 1 != arr[i + 1].length()) {
                canBeBuild = false;
                break;
            }

            if(!arr[i + 1].substring(1).equals(arr[i])
                    && !arr[i + 1].substring(0, arr[i + 1].length() - 1).equals(arr[i])) {
                canBeBuild = false;
                break;
            }

        }
        return canBeBuild;
    }
}
