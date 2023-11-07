import java.util.ArrayList;
import java.util.List;

public class BalancedParens {
    public static List<String> balancedParens(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,"", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int openCount, int closeCount, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (openCount < n) {
            backtrack(result, current + "(", openCount + 1, closeCount, n);
        }

        if (closeCount < openCount) {
            backtrack(result, current + ")", openCount, closeCount + 1, n);
        }
    }
}