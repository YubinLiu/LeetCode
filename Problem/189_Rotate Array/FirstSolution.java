public class FirstSolution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;

        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }
    }
}
