class MinMax {
    public static int[] minMax(int[] arr) {
        
        int[] minMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};

        for (int i : arr) {
            minMax[0] = Math.min(minMax[0], i);
            minMax[1] = Math.max(minMax[1], i);
        }
        return minMax;
    }
}