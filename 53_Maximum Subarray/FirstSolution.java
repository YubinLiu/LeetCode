public class FirstSolution {
    public int maxSubArray(int[] nums) {
        int[] maxSum = new int[nums.length];
        maxSum[0] = nums[0];

        int max = maxSum[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxSum[i - 1] > 0) maxSum[i] = nums[i] + maxSum[i - 1];
            else maxSum[i] = nums[i];
            max = Math.max(max, maxSum[i]);
        }
        return max;
    }
}
