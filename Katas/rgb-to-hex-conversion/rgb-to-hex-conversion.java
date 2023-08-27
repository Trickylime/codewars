public class RgbToHex {

    public static String rgb(int r, int g, int b) {


        r = Math.max(0, Math.min(255, r));
        g = Math.max(0, Math.min(255, g));
        b = Math.max(0, Math.min(255, b));

        String red = String.format("%02X", r);
        String green = String.format("%02X", g);
        String blue = String.format("%02X", b);
        return red + green + blue;
    }
}