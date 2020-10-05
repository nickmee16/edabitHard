public class BlockTheSquareInTicTacToe {

    public static void main(String[] args) {
        System.out.println(blockPlayer(0, 3));
        System.out.println(blockPlayer(1, 7));
    }


    public static int blockPlayer(int a, int b) {
        int[][] twoDArr = new int[4][4];
        int count = 0;

        for (int x = 1; x < twoDArr.length; x++) {

            for (int y = 1; y < twoDArr.length; y++) {
                twoDArr[x][y] = count;
                count++;
            }
        }
        int iA = 0;
        int iB = 0;
        int iC = 0;
        int jA = 0;
        int jB = 0;
        int jC = 0;

        for (int i = 1; i < twoDArr.length; i++) {

            for (int j = 1; j < twoDArr.length; j++) {
                if (twoDArr[i][j] == a) {
                    iA = i;
                    jA = j;
                }

                if (twoDArr[i][j] == b) {
                    iB = i;
                    jB = j;
                }
            }
        }

        if (iA == iB) {
            iC = iA;

            if (jA == 3 || jB == 3) {
                jC = Math.abs(jA - jB);
            } else {
                jC += jA + jB;
            }

        } else if (iA == 3 || iB == 3) {
            iC = Math.abs(iA - iB);

            if (jA == jB) {
                jC = jA;
            } else if (jA == 3 || jB == 3) {
                jC = Math.abs(jA - jB);
            } else {
                jC = jA + jB;
            }

        } else {
            iC = iA + iB;

            if (jA == jB) {
                jC = jA;
            } else if (jA == 3 || jB == 3) {
                jC = Math.abs(jA - jB);
            } else {
                jC = jA + jB;
            }
        }
        return twoDArr[iC][jC];
    }
}
