import java.util.Map;
import java.util.HashMap;
public class SecondSolution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i];
            int subVal = target - numbers[i];
            if (map.containsKey(subVal)) {
                result[0] = map.get(subVal) + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
