import java.util.Map;
import java.util.HashMap;

public class SecondSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int subValue = target - value;
            if (map.containsKey(subValue)) {
                result[0] = i;
                result[1] = map.get(subValue);
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
