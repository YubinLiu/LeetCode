public class SecondSolution {
    public boolean isUgly(int num) {
        if (num == 1) return true;
        for (int i = 2; num > 0 && i < 6; i++) {
            while (num % i == 0) num /= i;
        }
        return num == 1;
    }
}
