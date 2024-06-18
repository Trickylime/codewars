import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int onBus = 0;
    for (int[] stop : stops) {
      onBus += stop[0] - stop[1];
    }
    return onBus;
  }
}