public class FirstSolution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) sum += i;
        return (int)(0.5 * n * (n + 1)) - sum;
    }
}
