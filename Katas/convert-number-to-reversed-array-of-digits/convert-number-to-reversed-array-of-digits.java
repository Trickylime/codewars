public class Kata {
    public static int[] digitize(long n) {

        int length = String.valueOf(n).length(); //Get the length of n
        int[] result = new int[length]; //create an array the same length as n

        for( int i = 0; i < length; i++){
            result[i] = (int) (n % 10); //Grab the last digit of n
            n /= 10; //Remove the last digit of n
        }

        return result;
    }
}