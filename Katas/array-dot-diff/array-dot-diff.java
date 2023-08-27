import java.util.ArrayList;
import java.util.List;
public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {

        //Create a list of the 'a' array
        List<Integer> bList = new ArrayList<>();
        for (int i : b) {
            bList.add(i);
        }

        //Create a list to hold the values from 'a' that are not in 'b'
        List<Integer> result = new ArrayList<>();
        for (int i : a){
            if (!bList.contains(i)){
                result.add(i);
            }
        }

        //create a new int array with the results from the aList
        int[] resultArray = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}