import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Minimum{

    public static int minValue(int[] values){

        Arrays.sort(values); //Sort array from lowest to highest

        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for(int value : values){
            uniqueElements.add(value);
        } //Add sorted array elements to LinkedHashSet to remove duplicates and maintain order

        StringBuilder result = new StringBuilder();
        for (int value : uniqueElements) {
            result.append(value);
        } //Convert set to a stringbuilder

        return Integer.parseInt(result.toString()); //convert stringbuilder to string to integer
    }
}