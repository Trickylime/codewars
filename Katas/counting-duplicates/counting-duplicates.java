import java.util.ArrayList;
import java.util.Objects;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        
        String[] textSplit = text.toLowerCase().split(""); //split text in to each character
        ArrayList<String> checkedCharacters = new ArrayList<>(); //create a list to store characters that have been checked
        int duplicationCount = 0; //Count duplications for result
        
        for (int i = 0; i < textSplit.length; i++) {
            if (!checkedCharacters.contains(textSplit[i])) { //has current character been checked?
                checkedCharacters.add(textSplit[i]); //add character to checked list
                for (int j = i + 1; j < textSplit.length; j++) {
                    if (Objects.equals(textSplit[i], textSplit[j])){ //does current character = next characters?
                        duplicationCount++; //increase duplicates found count
                        break; //break out of loop
                    }
                }
            }
        }

        return duplicationCount;
    }
}