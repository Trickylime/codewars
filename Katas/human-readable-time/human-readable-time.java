public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        int hours = 0;
        int minutes = 0;

        if (seconds / 3600 > 0) {
            hours += seconds / 3600;
            seconds %= 3600;
        }
        if (seconds / 60 > 0){
            minutes += seconds / 60;
            seconds %= 60;
        }
        
        return "%02d:%02d:%02d".formatted(hours, minutes, seconds);
    }
  }