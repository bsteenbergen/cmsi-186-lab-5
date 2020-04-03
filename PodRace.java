import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class PodRace {
    public static Set<Pod> race(double distance, Set<Pod> racers, double timeSlice, double timeLimit) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than zero");
        }
        if (timeLimit < 0) {
            throw new IllegalArgumentException("Time cannot be negative");
        }

        var sine = new HashMap<Pod, Double>(); //do this for every pod?
            sine.get(SinePod);
            sine.put(SinePod, distance * timeSlice) 

        var winners = new HashSet<Pod>();

        for (var p : racers) {
            
        }
        return winners;
    }
}
