# 167. Two Sum II - Input array is sorted
### Description
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

### Example:
```
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
```

### First Try
Use one loop to get each elements of input, and another loop to judge if one of the elements below current element equals to the difference between target and the current element(if one of the elements is bigger than the difference, break this loop).
>Note: The input is sorted, so you can break the loop if the element is bigger than the taget or the element is bigger than difference. This try sometimes will cause time limit exceeded, but sometimes not. Like input is [0, 0, 0...] and target is 5.

> Source Code: FirstSolution.java

> Runtime: 44ms.

### Second Try
Use HashMap. Get each elements of input, judge if their difference of target in the map, if map contains the difference, return their indexes, else, continue the loop.
>Note: Returned answers (both index1 and index2) are not zero-based, so your index should plus one.

> Source Code: SecondSolution.java

>Runtime: 6ms

### Third Try
Use two pointers. One points to the first element, and the other points to the last element. If their sum is less than the target, the former pointer move to the next element. If their sum is bigger than the target, the latter pointer move to the previous element.
>Note: The title says "You may assume that each input would have exactly one solution and you may not use the same element twice.", so the while loop will go on, if the sum not equals to the target.

> Source Code: ThirdSolution.java

>Runtime: 1ms
