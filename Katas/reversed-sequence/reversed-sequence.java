import java.util.Arrays;
public class Sequence{

  public static int[] reverse(int n){
        int[] result = new int[n];

        for (int i = 0; i < result.length; i++){
            result[i] = (n - i);
        }

        return result;
    }

}