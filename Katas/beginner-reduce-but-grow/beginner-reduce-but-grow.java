public class Kata{

  public static int grow(int[] x){
    int sum = x[0];
    for(int i = 1; i < x.length; i++)
      sum *= x[i];
    return sum;
  }

}