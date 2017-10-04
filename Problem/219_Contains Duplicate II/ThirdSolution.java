public class ThirdSolution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length < 2) return false;
        if (k > 3000) return false;
        for(int i = 0; i < nums.length - 1; i++){
            int m = i + k < nums.length ? i + k : nums.length - 1;
            for(int j = i + 1; j <= m; j++) {
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}
