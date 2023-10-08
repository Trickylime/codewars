public class User {

    int progress = 0;
    int rank = -8;


public int incProgress(int activityRank) {

        if(activityRank < -8 || activityRank > 8 || activityRank == 0)
            throw new RuntimeException("Activity is smaller than -8 or larger than 8.");

        boolean isHigherRank = rank <= activityRank; //is the activity higher rank and your rank?

        int activityDifference = Math.abs(rank - activityRank); //the difference between your rank and the activity
        if(activityRank > 0 && rank < 0 || activityRank < 0 && rank > 0) activityDifference -= 1; //Removes rank 0 from difference

        if(isHigherRank){ //is activity higher than rank?
            if (activityDifference == 0) progress(3); //activity and rank the same rank small increment
            else progress((10 * activityDifference) * activityDifference); //activity 1 or more higher than rank big increment
        } else { //is activity lower than rank?
            if (activityDifference == 1) progress(1); //activity 1 lower than rank tiny increment
            else { //activity 2 or lower than rank, no increment
                System.out.println("Activity too low to earn any rank progress");
                return progress;
            }
        }

        return progress;
    }

    public int progress(int progress){

        int previousRank = rank;
        this.progress += progress;

        while(this.progress >= 100 && rank < 8){
            this.progress -= 100; //remove 100 from rank progress and keep the remainder
            rank += 1; //increase rank by 1
            
            if(rank == 0) rank += 1; //increase rank by another 1 if it = 0 because 0 isn't an available rank
            System.out.printf("Congrats you've ranked up %d -> %d%n", previousRank, rank);
        }

        if(rank == 8) this.progress = 0;
        return this.progress;
    }
  
}