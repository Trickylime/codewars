public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    if(start>end)
      return 0;
    int sum=0;
    int current=start;
    while(current<=end) {
      sum+=current;
      current+=step;
        }
    return sum;
  }
}