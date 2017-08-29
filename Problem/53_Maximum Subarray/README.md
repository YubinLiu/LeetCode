# 53. Maximum Subarray
### Description
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

### Example:
```
For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
```

### First Try
Find maximum subarray, obviously it is an optimization problem, so try to use dynamic programming. <br>
First of all, define the sub problem. Try to find maxSubArray(int[] nums, int i), means that find the maximum subarray end with nums[i]. Use an array(named maxSum) to save each sum of maximum subarray end with nums[i]. Return the max value in maxSum.

>Note: maxSum[i] add maxSum[i - 1] only when maxSum[i - 1] is a positive number.

> Source Code: FirstSolution.java

> Runtime: 15ms.


### Second Try
Use a integer replace array to save the maxSum, reduce the extra space.

>Note: No need to use an array to save all maxSum end of each elements, use a integer is fine.

> Source Code: SecondSolution.java

> Runtime: 16ms.
