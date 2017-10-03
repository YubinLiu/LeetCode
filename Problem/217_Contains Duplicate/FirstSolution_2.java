import java.util.Set;
import jav.util.HashSet;

public class FirstSolution_2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        return nums.length != 0 && set.size() != nums.length;
    }
}
