# 1. Two Sum
### Description
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

### Example:
```
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

### First Try
First of all, I write a function containsNum(), to judge if (target - nums[i]) exists in array, it will return the index of value of ((target - nums[i]) if founded, else return -1.

```
public class Solution {
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
```

### Second Try
```
public class Solution {
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
```
