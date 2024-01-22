class Kata {
    public static String multiTable(int num) {

        StringBuilder result = new StringBuilder();

        for(int i = 1; i <= 10; i++) {
            int answer = i * num;
            String s = "%d * %d = %d".formatted(i, num, answer) + "\n";
            result.append(s);
        }

        return result.toString().trim();
    }
}