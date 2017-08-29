public class SecondSolution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int result = 0;
        int resultOne = 1;
        int resultTwo = 2;

        for (int i = 2; i < n; i++) {
            result = resultOne + resultTwo;
            resultOne = resultTwo;
            resultTwo = result;
        }

        return result;
    }
}
