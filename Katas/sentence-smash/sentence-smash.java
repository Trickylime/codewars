import java.util.Arrays;

public class SmashWords {

     public static String smash(String... words) {
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < words.length; i++){
            if(i == 0){
                result.append(words[i]);
            } else {
                result.append(" ").append(words[i]);
            }
        }
        
        return result.toString();
    }
}