import java.util.Set;
import java.util.HashSet;
public class FirstSolution_1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        return false;
    }
}
