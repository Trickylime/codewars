public class Kata {
  
    public static String[] towerBuilder(int nFloors) {

        String[] result = new String[nFloors];

        int repeat = -1;
        for (int i = 0; i < nFloors; i++){
                result[i] = "*".repeat(repeat += 2);
        }

        int spaces = 0;
        for (int i = nFloors - 2; i >= 0; i--) {
            result[i] = " ".repeat(spaces += 1)
                    + result[i]
                    + " ".repeat(spaces);
        }

        return result;
    }
}