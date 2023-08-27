public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int sum = 0;
        // Your code here
        for(int i = 0; i < classPoints.length; i++){
            sum += classPoints[i];
        }
        sum += yourPoints;
        sum /= (classPoints.length + 1);
        
        if(yourPoints > sum){
            return true;
        }
        
        return false;
    }
}