public class Kata {
    public static String highAndLow(String numbers) {

        String[] numbersSplit = numbers.split(" ");
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (String n : numbersSplit){
            int check = Integer.parseInt(n);
            if (check < lowest) lowest = check;
            if (check > highest) highest = check;
        }

        return highest + " " + lowest;
    }
}