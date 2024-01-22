public class Kata {
    public static int[] pipeFix(int[] numbers) {

        StringBuilder sb = new StringBuilder();

        for (int i = numbers[0]; i <= numbers[numbers.length - 1]; i++) {
            sb.append(i).append(",");
        }

        String[] splitSb = sb.toString().split(",");
        
        int[] result = new int[splitSb.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(splitSb[i]);
        }
        
        return result;
    }
}