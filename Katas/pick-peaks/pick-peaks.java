import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PickPeaks {
    
    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        List<Integer> posList = new ArrayList<>(); //create a list to store array position of peaks and plateaus
        List<Integer> peakList = new ArrayList<>(); //create a list to store array value of peaks and plateaus

        for(int i = 1; i < arr.length - 1; i++){
            int previous = arr[i - 1]; //Grab previous value in array
            int current = arr[i]; //Grab current value in array
            int next = arr[i + 1]; //Grab next value in array

            if(current > previous && current > next){ //If current value is greater than previous and greater than next
                peakList.add(arr[i]); //Add peak value to peak list
                posList.add(i); //Add peak position to position list
            }
            if(current > previous && current == next){ //If current value is greater than previous and equal to next found potential plateau
                for(int j = i+2; j < arr.length; j++){
                    if(current > arr[j]) { //if current is greater than next, plateau found
                        peakList.add(current); //Add plateau value to list
                        posList.add(i); //Add first position of plateau value to list
                        break;
                    }else if (current < arr[j]) break; //Not a plateau break from loop
                }
            }
        }

        Map<String, List<Integer>> result = new HashMap<>(); //create hash map to store results
        result.put("pos", posList); //add array positions of peaks and plateaus to map
        result.put("peaks", peakList); //add array values of peaks and plateaus to map

        return result;
    }
  }