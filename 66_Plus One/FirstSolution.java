public class FirstSolution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] + 1 <= 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] nums = new int[digits.length + 1];
        nums[0] = 1;

        return nums;
    }
}
