public class Kata
{
    public static String reverseWords(final String original) {
      
        if(original.isBlank()){
            return original;
        }
      
        String[] splitStrings = original.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < splitStrings.length; i++){
            String reverse = new StringBuilder(splitStrings[i]).reverse().toString();
            if(i == 0){
                result.append(reverse);
            } else {
                result.append(" ").append(reverse);
            }
        }
        return result.toString();
    }
}