public class Solution {
    public static String solve(final String str) {
       
       int upperCount = 0;
       
       for (int i = 0; i < str.length(); i++) {
           if (Character.isUpperCase(str.charAt(i)) ) {
              upperCount++;
           }        
       }        
                
        return upperCount > ( str.length() / 2 ) 
            ? str.toUpperCase() : str.toLowerCase(); 
    }
}