public class Switch {
    public static String switcheroo(String x) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            char check = x.charAt(i);

            switch(check) {
                case 'a' -> sb.append("b");
                case 'b' -> sb.append("a");
                default -> sb.append("c");
            }
        }
        return sb.toString();
    }
}