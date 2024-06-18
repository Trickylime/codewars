public class DecTools {
    public static int Digits(long n) {

        if(n < 10) return 1;

        int noOfDigits = 0;
        while (n >= 1) {
            noOfDigits++;
            n /= 10;
        }
        
        return noOfDigits;
    }
}