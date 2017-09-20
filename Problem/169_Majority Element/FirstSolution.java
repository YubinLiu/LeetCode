import java.util.Map;
import java.util.HashMap;

public class FirstSolution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int major = nums[0];
        for (int i : nums) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);

            if (map.get(i) > nums.length / 2) major = i;
        }
        return major;
    }
}
