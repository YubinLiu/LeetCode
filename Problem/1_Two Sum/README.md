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
Write a function containsNum(), to judge if (target - nums[i]) exists in array, it will return the index of value of (target - nums[i]) if founded, else return -1.
>Note: We can just found (target - nums[i]) from nums[i+1].

> Source Code: FirstSolution.java

> Runtime: 26ms.

### Second Try
Using map to search. We don't need to fill the map with all elements at first, we judge 0 to i - 1 elements in map if it contains (target - nums[i]), we put nums[i] in map if we not found (target - nums[i]).
>Note: In this case, only the worst situation we need put all elements in nums to map. Space cost replace time cost.

> Source Code: SecondSolution.java

>Runtime: 9ms
