public class DRoot {
  public static int digital_root(int n) {
    // ...
    
    int totalSum = 0;
    
    for(int i = 1; n > 0 || totalSum > 9; i++){
      if(totalSum > 9 && n <= 0){
        n = totalSum;
        totalSum = 0;
        totalSum += n % 10;
        n /= 10;
      } else {
        totalSum += n % 10;
        n /= 10;
      }
    }
    return totalSum;
  }
}