import java.util.*;

public class ConnectFour {
    public static String whoIsWinner(List<String> piecesPositionList) {

        int[][] connect4Board = new int[6][7];
        int A = 5, B = 5, C = 5, D = 5, E = 5, F = 5, G = 5;

        int currentMove = 0;
        int connectFour = 0;

        while (currentMove <= piecesPositionList.size() - 1) {

            String s = piecesPositionList.get(currentMove++);
            int assignValue = s.charAt(2) == 'R' ? 1 : 2;
            int column = s.charAt(0) - 65;
            int currentRow = -1;
            switch (s.charAt(0)) {
                case 'A' -> {
                    currentRow = A;
                    connect4Board[A--][column] = assignValue;
                }
                case 'B' -> {
                    currentRow = B;
                    connect4Board[B--][column] = assignValue;
                }
                case 'C' -> {
                    currentRow = C;
                    connect4Board[C--][column] = assignValue;
                }
                case 'D' -> {
                    currentRow = D;
                    connect4Board[D--][column] = assignValue;
                }
                case 'E' -> {
                    currentRow = E;
                    connect4Board[E--][column] = assignValue;
                }
                case 'F' -> {
                    currentRow = F;
                    connect4Board[F--][column] = assignValue;
                }
                case 'G' -> {
                    currentRow = G;
                    connect4Board[G--][column] = assignValue;
                }
                default -> {}
            }

            if (currentMove > 3) {

                //Check Horizontal
                for (int i = 0; i < 7; i++){
                    if (assignValue == connect4Board[currentRow][i]) {
                        connectFour++;
                    } else
                        connectFour = 0;

                    if (connectFour == 4)
                        return assignValue == 1 ? "Red" : "Yellow";
                }


                //Check Vertical
                connectFour = 0;
                for (int i = 0; i < 6; i++){
                    if (assignValue == connect4Board[i][column]) {
                        connectFour++;
                    } else
                        connectFour = 0;

                    if (connectFour == 4){
                        return assignValue == 1 ? "Red" : "Yellow";
                    }
                }

                //Check Diagonal
                connectFour = 0;
                // Check diagonal (from bottom-left to top-right)
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (assignValue == connect4Board[i][j] &&
                                assignValue == connect4Board[i + 1][j + 1] &&
                                assignValue == connect4Board[i + 2][j + 2] &&
                                assignValue == connect4Board[i + 3][j + 3]) {
                            return assignValue == 1 ? "Red" : "Yellow";
                        }
                    }
                }

                // Check diagonal (from top-left to bottom-right)
                for (int i = 3; i < 6; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (assignValue == connect4Board[i][j] &&
                                assignValue == connect4Board[i - 1][j + 1] &&
                                assignValue == connect4Board[i - 2][j + 2] &&
                                assignValue == connect4Board[i - 3][j + 3]) {
                            return assignValue == 1 ? "Red" : "Yellow";
                        }
                    }
                }
            }
        }
        return "Draw";
    }
}