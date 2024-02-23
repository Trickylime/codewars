class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int maxDifference = Integer.MIN_VALUE;

        for (String x : a1) {
            for (String y : a2) {
                int difference = Math.abs(x.length() - y.length());
                maxDifference = Math.max(maxDifference, difference);
            }
        }

        return maxDifference;
    }
}