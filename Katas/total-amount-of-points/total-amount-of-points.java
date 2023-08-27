public class TotalPoints {
  
    public static int points(String[] games) {

        int[] x = new int[games.length];
        int[] y = new int[games.length];
        int score = 0;

        for(int i = 0; i < games.length; i++){
            x[i] = Integer.parseInt(games[i].split(":")[0]);
            y[i] = Integer.parseInt(games[i].split(":")[1]);
        }

        for(int i = 0; i < games.length; i++){
            if (x[i] > y[i]){
                score += 3;
            }
            if (x[i] == y[i]){
                score += 1;
            }
        }
        
        return score;
    }
}