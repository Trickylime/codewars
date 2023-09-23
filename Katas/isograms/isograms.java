import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class isogram {
    public static boolean isIsogram(String str) {

        String[] stringSplit = str.toLowerCase().split(""); //Split string in to its individual letters
        Set<String> uniqueLetterSplit = new HashSet<>(List.of(stringSplit)); //Turn split string in to a set removing duplicates

        return stringSplit.length == uniqueLetterSplit.size();
    }
}