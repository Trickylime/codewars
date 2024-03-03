public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
      if (v1 >= v2) return null;
      
      int totalSeconds = g*3600/(v2 - v1);      
      int hours = totalSeconds/3600;
      int minutes = totalSeconds % 3600 / 60;
      int seconds = totalSeconds % 60;
    
      return new int[] {hours, minutes, seconds} ;
    }
}