public class SecondSolution {
    public int mySqrt(int x) {
        double err = 1e-10;
        double t = x;
        while (Math.abs(t - x / t) > err * t)
            t = (x / t + t) / 2;
        return (int)t;
    }
}
