public class SecondSolution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] temp =  new int[nums.length];

        System.arraycopy(nums, 0, temp, k, nums.length - k);
        System.arraycopy(nums, nums.length - k, temp, 0, k);
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}
