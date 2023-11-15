public class Kata {
  public static int rentalCarCost(int d) {
        int result = d * 40;
        if (d >= 7)
            result -= 50;
        if (d >= 3 && d < 7)
            result -= 20;
        return result;
    }
}