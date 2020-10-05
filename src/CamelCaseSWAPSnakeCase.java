public class CamelCaseSWAPSnakeCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));

    }

    public static String toCamelCase(String str) {
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '_') {
                i++;
                newStr.append(String.valueOf(Character.toUpperCase(str.charAt(i))));

            } else {
                newStr.append(String.valueOf(str.charAt(i)));
            }
        }

        return newStr.toString();
    }

    public static String toSnakeCase(String str) {
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i))) {
                newStr.append("_").append(String.valueOf(Character.toLowerCase(str.charAt(i))));

            } else {
                newStr.append(String.valueOf(str.charAt(i)));
            }
        }

        return newStr.toString();
    }
}
