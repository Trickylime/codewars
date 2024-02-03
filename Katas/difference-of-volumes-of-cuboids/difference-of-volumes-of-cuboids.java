public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        int first = 1;
        int second = 1;
        
        for (int i = 0; i < 3; i++) {
            first *= firstCuboid[i];
            second *= secondCuboid[i];
        }
        
        return Math.max(first, second) - Math.min(first, second);
    }
}