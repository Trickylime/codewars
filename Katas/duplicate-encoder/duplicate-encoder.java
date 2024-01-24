import java.util.ArrayList;
import java.util.List;

public class DuplicateEncoder {
    static String encode(String word) {

        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        List<Character> checkedCharacters = new ArrayList<>();

        System.out.println(word);
        for (int i = 0; i < word.length(); i++) {

            char current = word.charAt(i);

            if (word.substring(i + 1).contains(String.valueOf(current))
                    || checkedCharacters.contains(current)) {
                result.append(")");
                checkedCharacters.add(current);
            } else {
                result.append("(");
            }
        }
        
        return result.toString();
    }
}