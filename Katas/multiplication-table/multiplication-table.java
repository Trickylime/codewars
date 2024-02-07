import java.util.Arrays;
public class Multiplication{
    public static int [][] multiplicationTable(int n){

        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    result[i][j] = j + 1;
                } else {
                    result[i][j] = result[0][j] * (i + 1);
                }
            }
        }
        return result;
    }
}