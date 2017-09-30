public class ThirdSolution {
    public int countPrimes(int n) {
        boolean[] isNotPrime = new boolean[n];
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                result++;
                for (int j = 2; i * j < n; j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }

        return result;
    }
}
