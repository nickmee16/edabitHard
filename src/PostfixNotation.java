public class PostfixNotation {

    public static void main(String[] args) {

//        System.out.println(postfix("2 2 +"));
//        System.out.println(postfix("2 3 * 1 - 5 /"));
//        System.out.println(postfix("8 4 / 9 * 3 1 * /"));
        System.out.println(postfix("10 10 * 10 /"));


    }

    public static int postfix(String expr) {
        String[] exprSplit = expr.split(" ");

        int num = Integer.parseInt(String.valueOf(exprSplit[0]));

        for (int i = 1; i < exprSplit.length; i++) {

            if (Character.isDigit(exprSplit[i].charAt(0))) {

                if (Character.isDigit(exprSplit[i + 1].charAt(0))) {

                    if (exprSplit[i + 2].equals("+")) {

                        if (exprSplit[i + 3].equals("+")) {
                            num = num + (Integer.parseInt(exprSplit[i]) + Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("-")) {
                            num = num - (Integer.parseInt(exprSplit[i]) + Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("*")) {
                            num = num * (Integer.parseInt(exprSplit[i]) + Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else {
                            num = num / (Integer.parseInt(exprSplit[i]) + Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        }

                    } else if (exprSplit[i + 2].equals("-")) {

                        if (exprSplit[i + 3].equals("+")) {
                            num = num + (Integer.parseInt(exprSplit[i]) - Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("-")) {
                            num = num - (Integer.parseInt(exprSplit[i]) - Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("*")) {
                            num = num * (Integer.parseInt(exprSplit[i]) - Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else {
                            num = num / (Integer.parseInt(exprSplit[i]) - Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        }

                    } else if (exprSplit[i + 2].equals("*")) {

                        if (exprSplit[i + 3].equals("+")) {
                            num = num + (Integer.parseInt(exprSplit[i]) * Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("-")) {
                            num = num - (Integer.parseInt(exprSplit[i]) * Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("*")) {
                            num = num * (Integer.parseInt(exprSplit[i]) * Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else {
                            num = num / (Integer.parseInt(exprSplit[i]) * Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        }

                    } else {

                        if (exprSplit[i + 3].equals("+")) {
                            num = num + (Integer.parseInt(exprSplit[i]) / Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("-")) {
                            num = num - (Integer.parseInt(exprSplit[i]) / Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else if (exprSplit[i + 3].equals("*")) {
                            num = num * (Integer.parseInt(exprSplit[i]) / Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        } else {
                            num = num / (Integer.parseInt(exprSplit[i]) / Integer.parseInt(exprSplit[i + 1]));
                            i = i + 3;
                        }
                    }

                } else {

                    if(exprSplit[i + 1].equals("+")) {
                        num = num + Integer.parseInt(exprSplit[i]);
                    } else if(exprSplit[i + 1].equals("-")) {
                        num = num - Integer.parseInt(exprSplit[i]);
                    } else if(exprSplit[i + 1].equals("*")) {
                        num = num * Integer.parseInt(exprSplit[i]);
                    } else {
                        num = num / Integer.parseInt(exprSplit[i]);
                    }
                }
            }
        }

        return num;
    }
}
