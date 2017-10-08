public class FirstSolution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 33; i++) {
            if (Math.pow(2, i) == n) return true;
        }
        return false;
    }
}
