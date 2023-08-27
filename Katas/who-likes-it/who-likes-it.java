class Solution {
    public static String whoLikesIt(String... names) {

        String result = "";
        int nameCount = 0;

        for(String i : names){  //Count the number of names
            if (i != null){
                nameCount++;
            }
        }

        result = switch (nameCount) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s, %s and %d others like this", names[0], names[1], (nameCount - 2));
        };
        
        return result;
    }
}