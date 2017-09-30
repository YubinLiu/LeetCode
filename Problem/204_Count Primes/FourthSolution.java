public class FourthSolution {
    public int countPrimes(int n) {
        if (n < 3) return 0;

        boolean[] isNotPrime = new boolean[n];
        int count = n / 2;

        for (int i = 3; i * i < n; i += 2) {
            if (isNotPrime[i]) continue;

            for (int j = i * i; j < n; j += 2 * i) {
                if (!isNotPrime[j]) {
                    --count;
                    isNotPrime[j] = true;
                }
            }
        }
        return count;
    }
}
