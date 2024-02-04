public class FindOutlier {
    static int find(int[] integers) {

        int evenCount = 0;
        boolean oddOrEven = false; //false = odd, true = even
        
        for (int i = 0; i < 3; i++) { //check first 3 elements in array to determine if we're searching for odd or even
            if(integers[i] % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount <= 1) { //if count of even ints is 1 or lower, it means we must search for even numbers else odd
            oddOrEven = true;
        }

        for (int i : integers) {
            if (oddOrEven) { //if searching for even
                if(i % 2 == 0){ //search and return even number
                    return i;
                }
            } else { // else search for odd
                if(i % 2 != 0){ //search and return odd number
                    return i;
                }
            }
        }
        return -1;
    }
}