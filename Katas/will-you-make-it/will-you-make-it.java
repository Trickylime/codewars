public class Kata {
  
    public static boolean zeroFuel(double distanceToPump, double mpg,
                                   double fuelLeft) {
        // Your code here!
        double enough = distanceToPump / mpg;

        if(fuelLeft >= enough){
            return true;
        }
        return false;
    }
}