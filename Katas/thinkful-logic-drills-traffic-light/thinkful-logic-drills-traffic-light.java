public class TrafficLights {
    public static String updateLight(String current) { 
        String[] result = {"green", "yellow", "red"};
        return switch (current) {
            case "green" -> result[1];
            case "yellow" -> result[2];
            case "red" -> result[0];
            default -> "Invalid state";
        };
    }

}