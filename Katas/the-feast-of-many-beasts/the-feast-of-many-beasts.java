import java.util.Arrays;
public class Kata {

    public static boolean feast(String beast, String dish) {
        
        char[] beastFirstAndLast = {beast.charAt(0), beast.charAt(beast.length() - 1)};
        char[] dishFirstAndLast = {dish.charAt(0), dish.charAt(dish.length() - 1)};

        return Arrays.equals(beastFirstAndLast, dishFirstAndLast);
    }
}