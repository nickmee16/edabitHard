public class BracketLogic {

    public static void main(String[] args) {
        System.out.println(bracketLogic("[<>()]"));
        System.out.println(bracketLogic("[<(>)]"));
    }

    public static boolean bracketLogic(String xp) {
        boolean isCorrect = true;
        String bracketsTotal = "";
        String brackets = "()<>[]{}";

        for(int i = 0; i < xp.length(); i++) {
            if(brackets.contains(String.valueOf(xp.charAt(i)))) {
                bracketsTotal += String.valueOf(xp.charAt(i));
            }
        }

        boolean isPossible = true;

        while (isPossible) {
            if(bracketsTotal.length() == 0) {
                isPossible = false;

            } else if(bracketsTotal.contains("()")) {
                bracketsTotal = bracketsTotal.replace("()", "");

            } else if(bracketsTotal.contains("<>")) {
                bracketsTotal = bracketsTotal.replace("<>", "");

            } else if(bracketsTotal.contains("[]")) {
                bracketsTotal = bracketsTotal.replace("[]", "");

            } else if(bracketsTotal.contains("{}")) {
                bracketsTotal = bracketsTotal.replace("{}", "");

            } else {

                isCorrect = false;
                isPossible = false;
            }
        }

        return isCorrect;
    }
}
