import java.util.Arrays;

public class Kata
{
  public static int sum(int[] numbers)
  {
    if (numbers == null) {
    return 0;
   }
     Arrays.sort(numbers);
   int result = 0;
   for(int i = 1;i < numbers.length -1; i++) {
    result += numbers[i];
   }
   return result;
  }
}