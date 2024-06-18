public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {

        return switch (rating.toUpperCase()) {
            case "TERRIBLE" -> 0;
            case "POOR" -> (int) Math.ceil(amount *= 0.05);
            case "GOOD" -> (int) Math.ceil(amount *= 0.1);
            case "GREAT" -> (int) Math.ceil(amount *= 0.15);
            case "EXCELLENT" -> (int) Math.ceil(amount *= 0.2);
            default -> null;
        };
    }
}