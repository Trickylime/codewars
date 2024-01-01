public class Kata {
  
    public static Object[] removeEveryOther(Object[] arr) {

        Object[] result = new Object[(arr.length + 1) / 2];
        int pos = 0;

        for (int i = 0; i < arr.length; i += 2) {
            result[pos++] = arr[i];
        }

        return result;
    }
}