public class Order {
    public static String order(String words) {

        if (words.length() == 0) return "";

        String[] splitWords = words.split(" "); //Split the words to an array
        String[] orderedWords = new String[splitWords.length]; //Create a new array to sort words in to

        for(int i = 1; i <= splitWords.length; i++){ //Create a loop for the number to look for in each word
            for (String splitWord : splitWords) { //Loop through split words array to find the value of i
                if (splitWord.contains(String.valueOf(i))) { //if found a match, add word to ordered words array and break loop
                    orderedWords[i - 1] = splitWord;
                    break;
                }
            }
        }
        return String.join(" ", orderedWords); //Join array together in to a string for result
    }
}