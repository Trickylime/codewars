public class FindDivisor {

    public static long numberOfDivisors(int n) {

        long result = 0;

        for (int i = 1; i < n - 1; i++) {
            if (n % i == 0)
                result++;
        }

        return result + 1;
    }

}