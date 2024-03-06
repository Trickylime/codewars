public class Kata {
    public static String encryptThis(String text) {

        if (text.isEmpty()) {
            return "";
        }

        String[] textSplit = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String currentWord : textSplit) {

            if (currentWord.length() > 1) {
                sb.append((int) currentWord.charAt(0));
                sb.append(currentWord.charAt(currentWord.length() - 1));

                for (int j = 2; j < currentWord.length(); j++) {
                    if (j == currentWord.length() - 1) {
                        sb.append(currentWord.charAt(1));
                    } else {
                        sb.append(currentWord.charAt(j));
                    }
                }
            } else {
                sb.append((int) currentWord.charAt(0));
            }
            sb.append(" ");


        }
        return sb.toString().trim();
    }
}