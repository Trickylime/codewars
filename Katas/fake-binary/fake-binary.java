public class FakeBinary {
    public static String fakeBin(String numberString) {

        String[] splitNumString = numberString.split("");
        for(int i = 0; i < numberString.length(); i++){
            if (Integer.parseInt(splitNumString[i]) < 5)
                splitNumString[i] = "0";
            else
                splitNumString[i] = "1";
        }

        return String.join("", splitNumString);
    }
}