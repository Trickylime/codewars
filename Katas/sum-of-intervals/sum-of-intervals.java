package cw;

import java.util.Arrays;
import java.util.Comparator;

public class Interval {

    public static int sumIntervals(int[][] intervals) {
      
        if(intervals.length == 0) return 0; //Check if interval is empty

        int result = 0; //Store the result

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); //Sort the intervals from lowest to highest

        int currentMin = intervals[0][0]; //Grab the 1st position minimum
        int currentMax = intervals[0][1]; //Grab the 2nd position Maximum

        for(int i = 1; i < intervals.length; i++){ //loop through the intervals
            int nextMin = intervals[i][0]; //Grab the next position minimum
            int nextMax = intervals[i][1]; //Grab the next position Maximum

            //if the next min if less than current max it must overlap. 
            //Current min must be = or lower and current max, current max could be less than or more than next max
            if (nextMin <= currentMax) currentMax = Math.max(currentMax, nextMax); 
            else { //if they don't overlap we add the difference to the result and set next min/max to current min/max
                result += currentMax - currentMin;
                currentMin = nextMin;
                currentMax = nextMax;
            }
        }

        result += currentMax - currentMin; //add the final min/max difference to result

        return result;
    }
}