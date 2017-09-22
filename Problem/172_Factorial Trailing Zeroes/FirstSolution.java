// Can't be accepted
public class FirstSolution {
    public int trailingZeroes(int n) {
        long nFactorial = 1;
        int result = 0;
        while (n >= 1) {
            nFactorial *= n;
            n--;
        }
        while (nFactorial != 0) {
            if (nFactorial % 10 == 0) {
                result++;
                nFactorial /= 10;
            } else {
                break;
            }
        }
        return result;
    }
}
