public class SexagenaryCycleChineseZodiac {

     public static void main(String[] args) {
        System.out.println(1971 % 10);
        System.out.println(sexagenary(2020));
    }

    public static String sexagenary(int year) {
        String animal = "";
        String element = "";

        switch (year % 12) {
            case 1:
                animal = "Rooster";
                break;
            case 2:
                animal = "Dog";
                break;
            case 3:
                animal = "Pig";
                break;
            case 4:
                animal = "Rat";
                break;
            case 5:
                animal = "Ox";
                break;
            case 6:
                animal = "Tiger";
                break;
            case 7:
                animal = "Rabbit";
                break;
            case 8:
                animal = "Dragon";
                break;
            case 9:
                animal = "Snake";
                break;
            case 10:
                animal = "Horse";
                break;
            case 11:
                animal = "Sheep";
                break;
            default:
                animal = "Monkey";
                break;

        }
        switch (year % 10) {
            case 0: case 1:
                element = "Metal";
                break;
            case 2: case 3:
                element = "Water";
                break;
            case 4: case 5:
                element = "Wood";
                break;
            case 6: case 7:
                element = "Fire";
                break;
            default:
                element = "Earth";
                break;
        }

        return element + " " + animal;
    }
}
