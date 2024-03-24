public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        
        if (walk.length != 10) return false;
        
        int northSouth = 0;
        int eastWest = 0;
        
        for (char c : walk) {
            switch (c) {
                case 'n' -> northSouth++;
                case 's' -> northSouth--;
                case 'e' -> eastWest++;
                case 'w' -> eastWest--;
            }
        }
        
        return northSouth == 0 && eastWest == 0;
    }
}