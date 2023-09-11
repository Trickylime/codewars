public class PangramChecker {
    public static boolean check(String sentence){

        if(sentence.length() < 26) return false;

        sentence = sentence.toLowerCase();
        String[] sentenceSplit = sentence.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (String s : sentenceSplit) {
            if (alphabet.contains(s)) {
                alphabet = alphabet.replace(s, "");
            }
        }

        return alphabet.length() == 0;
    }
}