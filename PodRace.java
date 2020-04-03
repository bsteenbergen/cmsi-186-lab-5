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

        var distances = new HashMap<Pod, Double>();
            
        var winners = new HashSet<Pod>();
        for (var t = 0; t < timeLimit; t += timeSlice) { 
            for (var p : racers) {
                var distanceForThisTimeSlice = 0.0; //Pod.distanceTraveled(); // fix later
                distances.put(distances.getOrDefault(p, 0.0) + distanceForThisTimeSlice); 
                if (distances.get(p) >= distance) {
                    winners.add(p);
                }
            }
            break;
        }
        return winners;
    }
}
