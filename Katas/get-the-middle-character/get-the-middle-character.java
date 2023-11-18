class Kata {
    public static String getMiddle(String word) {

        String result = "";

        if (word.length() % 2 == 0) {
            result = String.valueOf(word.charAt(word.length() / 2 - 1));
            result += String.valueOf(word.charAt(word.length() / 2));
        } else {
            result += String.valueOf(word.charAt(word.length() / 2));
        }
        
        return result;
    }
}