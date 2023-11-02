public class SquareDigit {

      public static int squareDigits(int n) {

        StringBuilder result = new StringBuilder();
        String nString = String.valueOf(n);

        for(int i = 0; i < nString.length(); i++){
            char digitChar = nString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            result.append(digit * digit);
        }

        return Integer.parseInt(result.toString());
    }
}