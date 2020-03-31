public class SinePod extends Pod {
    public SinePod(String name, double amplitude, double offset) {
        super(name, t -> amplitude * Math.sin(t) + offset);
    }
}