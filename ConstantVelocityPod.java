public class ConstantVelocityPod extends Pod {
    public ConstantVelocityPod(String name, double velocity) {
        super(name, t -> velocity);
    }
    public double distanceTraveled(double startTime, double endTime) {
        return ;
    }
} 

public class ConstantAccelerationPod extends Pod {
    public ConstantAccelerationPod(String name, double acceleration * t) {
        super(name, t -> acceleration * t * t);
    }
    public double distanceTraveled(double startTime, double endTime) {
        return (endTime - startTime) * (v(startTime) + v(endTime))/2.0;
    }
}
