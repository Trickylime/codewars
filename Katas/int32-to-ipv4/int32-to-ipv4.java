public class Kata {
    public static String longToIP(long ip) {

        String binaryString = Long.toBinaryString(ip);
        binaryString = String.format("%32s", binaryString).replace(' ', '0');
        String IpString = binaryString.substring(0, 8) + "." + binaryString.substring(8,16) + "." + binaryString.substring(16,24) + "." + binaryString.substring(24,32);
        String[] octet = IpString.split("\\.");
        StringBuilder result = new StringBuilder();

        for (String s : octet) {
            result.append(Integer.parseInt(s, 2)).append(".");
        }

        result = new StringBuilder(result.substring(0, result.length() - 1));
        return result.toString();
    }
}