public class FourthSolution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (true) {
            slow = calculate(slow);
            fast = calculate(fast);
            fast = calculate(fast);

            if (slow == fast) break;
        }

        return slow == 1;
    }

    public int calculate(int num) {
        int result = 0;
        while (num > 0) {
            result += (num % 10) * (num % 10);
            num /= 10;
        }
        return result;
    }
}
