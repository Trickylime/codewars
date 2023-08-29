import java.util.Arrays;
public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] result = new int[2];

        if (input == null || input.length == 0) {
            return new int[0]; // Return an empty array
        }

        for (int i : input) {
            if (i > 0) {
                result[0]++;
            } else {
                result[1] += i;
            }
        }
        return result; //return an array with count of positives and sum of negatives
    }
}