public class Paper
{
  public static int paperWork(int n, int m) 
  {
    if(n < 1 || m < 1 ) {
      return 0;
    }
    return n*m;
  }
}