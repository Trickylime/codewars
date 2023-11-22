public class Accumul {
    
    public static String accum(String s) {

        String[] sSplit = s.split("");
        StringBuilder result = new StringBuilder(sSplit[0]);

        for (int i = 1; i < sSplit.length; i++)
            result.append("-")
                    .append(sSplit[i].toUpperCase())
                    .append(sSplit[i].repeat(i).toLowerCase());

        return result.toString();
    }
}