public class NumberFun {
   public static long findNextSquare(long sq) {

        if (Math.sqrt(sq) != ((int) Math.sqrt(sq))) {
            return -1;
        }

        long result = (long) Math.sqrt(sq) + 1;
        return result * result;
    }
}