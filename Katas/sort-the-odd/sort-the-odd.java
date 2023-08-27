import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static int[] sortArray(int[] array) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i : array) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }
      
        oddNumbers.sort(Comparator.naturalOrder());
      
        int oddNumberIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers.get(oddNumberIndex);
                oddNumberIndex++;
            }
        }
        return array;
    }
}