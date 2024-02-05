public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        return isEven(flower1) != isEven(flower2);
    }
    
    private static boolean isEven(int a){
        return a % 2 == 0;
    }
}