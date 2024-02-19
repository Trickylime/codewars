import java.util.ArrayList;
import java.util.List;

public class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
        
        List<Integer> result = new ArrayList<>();
        
        if (array[0] == 0) {
            result.add(array[0]);
        }
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                result.add(array[i]);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}