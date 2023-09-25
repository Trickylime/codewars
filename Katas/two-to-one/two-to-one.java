import java.util.*;
public class TwoToOne {
    
        public static String longest (String s1, String s2) {

        String[] combineSplit = (s1 + s2).split(""); //add the strings together and split them to individual letters
        Set<String> removeDup = new HashSet<>(List.of(combineSplit)); //Convert array to a Set to remove duplicate letters

        List<String> sortedList = new ArrayList<>(removeDup); //Convert Set to a List to be sorted
        Collections.sort(sortedList); //Sort List alphabetically

        StringBuilder result = new StringBuilder(); //Convert List in to a String
        for (String s : sortedList) {
            result.append(s);
        }

        return result.toString();
    }
}