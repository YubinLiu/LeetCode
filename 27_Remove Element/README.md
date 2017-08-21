# 27. Remove Element
### Description
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

### Example:
```
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
```

### First Try
Almost like Exercise 26. Using a loop to compare each elements in array with val, if they are not equal, keep it's value, if not, use another elements that not equals to value to replace it.
>Note: No use the extra space, and if you return length, the 0 ... length - 1 should be the elements not equals to val.

> Source Code: FirstSolution.java

> Runtime: 9ms.
