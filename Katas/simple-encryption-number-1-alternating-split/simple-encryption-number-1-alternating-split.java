public class Kata {

    public static String encrypt(final String text, final int n) {

        if (text == null || text.length() == 0 || n < 1) {
            return text;
        }

        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                sbOdd.append(text.charAt(i));
            } else {
                sbEven.append(text.charAt(i));
            }
        }

        return encrypt(sbOdd.append(sbEven).toString(), n - 1);
    }

    public static String decrypt(final String encryptedText, final int n) {

        if (encryptedText == null || n <= 0) {
            return encryptedText;
        }

        int halfLength = encryptedText.length() / 2;
        String oddChars = encryptedText.substring(0, halfLength);
        String evenChars = encryptedText.substring(halfLength);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < halfLength; i++) {
            result.append(evenChars.charAt(i)).append(oddChars.charAt(i));
        }

        if (encryptedText.length() % 2 != 0) {
            result.append(encryptedText.charAt(encryptedText.length() - 1));
        }

        return decrypt(result.toString(), n - 1);
    }
  
}