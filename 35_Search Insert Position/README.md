# 35. Search Insert Position
### Description
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

### Example:
```
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
```

### First Try
Compare the last elements of array to target, return array's length if target is bigger. Using loop to get each elements of array, compare with target, return index when element is bigger than target or equals to target.

>Note: No need to think about target in or not in array, when get an element is bigger than or equals to target, return the index is fine.

> Source Code: FirstSolution.java

> Runtime: 5ms.

### Second Try
Using binary search to find the index of target, if the target not found, return the low index.

>Note: A sorted array and find target, try to use binary search.

> Source Code: SecondSolution.java

> Runtime: 6ms.
