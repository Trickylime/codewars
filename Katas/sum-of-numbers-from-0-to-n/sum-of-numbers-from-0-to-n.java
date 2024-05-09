public class SequenceSum{

    public static String showSequence(int value) {

        if (value < 0) return value + "<0";
        if (value == 0) return "0=0";

        StringBuilder sb = new StringBuilder("0");
        int sum = 0;

        for (int i = 1; i <= value; i++) {
            sb.append("+").append(i);
            sum += i;
        }

        return sb.toString() + " = " + sum;
    }
}