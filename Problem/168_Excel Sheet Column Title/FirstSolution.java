public class FirstSolution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append((char)('A' + --n % 26));
            n /= 26;
        }

        return result.reverse().toString();
    }
}
