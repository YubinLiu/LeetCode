public class SecondSolution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        long o = x;
	long result = 0;

	while (x != 0) {
	    result = result * 10 + x % 10;
            x /= 10;
	}

	return o == result;
    }
}
