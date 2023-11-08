class Persist {
    public static int persistence(long n) {

        if(n < 10) return 0; //if n is single digit return 0

        boolean resultSingleDigit = false; //bool for while loop
        int multiplicationCount = 0; //count multiplications
        String[] nString = String.valueOf(n).split(""); //Split n in to separate digits

        while(!resultSingleDigit){
            int result = 1; //result set to 1 to times against first digit
            for(int i = 0; i < nString.length; i++){
                result *= Integer.parseInt(nString[i]); //Times digits together
            }
            multiplicationCount++; //increase count for multiplication
            if(result < 10) resultSingleDigit = true; //if result is a single digit break out of the loop
            else nString = String.valueOf(result).split(""); //else set nString to new value to loop again

        }

        return multiplicationCount;
    }
}