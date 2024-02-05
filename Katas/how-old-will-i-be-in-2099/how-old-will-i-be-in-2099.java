public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {

        int diff = yearTo - birth;

        if (diff < -1) {
            return "You will be born in %d years.".formatted(Math.abs(diff));
        } else if (diff > 1) {
            return "You are %d years old.".formatted(diff);
        } else if (diff == 1) {
            return "You are 1 year old.";
        } else if (diff == -1) {
            return "You will be born in 1 year.";
        }

        return "You were born this very year!";
    }
}