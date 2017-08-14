public class FirstSolution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int z = containsNum(i, target - nums[i], nums);
            if (z != -1) {
                return new int[] {i, z};
            }
        }
        return null;
    }

    public int containsNum(int i, int n, int[] nums) {
        for (int x = i + 1; x < nums.length; x++) {
            if (nums[x] == n) {
                return x;
            }
        }
        return -1;
    }
}
