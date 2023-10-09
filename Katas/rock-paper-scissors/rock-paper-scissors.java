public class Kata {
    public static String rps(String p1, String p2) {

        String[] result = {"Player 1 won!", "Player 2 won!", "Draw!"};
        
        switch (p1) {
            case "rock" -> {
                return switch (p2) {
                    case "paper" -> result[1];
                    case "scissors" -> result[0];
                    default -> result[2];
                };
            }
            case "paper" -> {
                return switch (p2) {
                    case "scissors" -> result[1];
                    case "rock" -> result[0];
                    default -> result[2];
                };
            }
            default -> {
                return switch (p2) {
                    case "rock" -> result[1];
                    case "paper" -> result[0];
                    default -> result[2];
                };
            }
        }
    }
}