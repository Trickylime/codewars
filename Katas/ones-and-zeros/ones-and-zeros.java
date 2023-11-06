import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    String binaryString = "";
  for (Integer integer : binary) {
   binaryString += integer;
  }
  return Integer.parseInt(binaryString, 2);
    }
}