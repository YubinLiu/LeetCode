public class SecondSolution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int max = maxSum;

        for (int i = 1; i < nums.length; i++) {
            if (maxSum > 0) maxSum = nums[i] + maxSum;
            else maxSum = nums[i];
            max = Math.max(max, maxSum);
        }
        return max;
    }
}
