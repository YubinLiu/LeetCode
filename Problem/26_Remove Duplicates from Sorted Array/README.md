# 26. Remove Duplicates from Sorted Array
### Description
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

### Example:
```
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
```

### First Try
Judge the input array's length at first, return zero if the length is zero. Use a variable to record the index of array, change each elements to the no duplicate one.
>Note: Not only return the the numbers of no duplicate elements(record as length), but also these elements should be at 0...length - 1 of array. And should not use extra space.

> Source Code: FirstSolution.java

> Runtime: 13ms.
