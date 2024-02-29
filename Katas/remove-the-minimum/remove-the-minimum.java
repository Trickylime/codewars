public class Remover {
    public static int[] removeSmallest(int[] numbers) {

        if (numbers.length == 0) {
            return new int[0];
        }

        int lowestValue = Integer.MAX_VALUE;
        int lowestValuePosition = -1;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < lowestValue) {
                lowestValue = numbers[i];
                lowestValuePosition = i;
            }
        }

        int[] result = new int[numbers.length - 1];
        int resultElement = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i != lowestValuePosition) {
                result[resultElement++] = numbers[i];
            }
        }

        return result;
    }
}