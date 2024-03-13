public class Max {
    public static int sequence(int[] arr) {

        int largestSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int check = 0;
            for (int j = i; j < arr.length; j++) {
                check += arr[j];
                largestSum = Math.max(largestSum, check);
            }
        }

        return largestSum;
    }
}