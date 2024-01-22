public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int i = 0;
        int catYears = 0;

        while (i++ < humanYears) {
            switch(i) {
                case 1 -> catYears += 15;
                case 2 -> catYears += 9;
                default -> catYears += 4;
            }
        }

        if (humanYears < 2)
            return new int[]{humanYears,catYears,catYears};

        int dogYears = catYears + (humanYears - 2);
        return new int[]{humanYears,catYears, dogYears};
    }
}