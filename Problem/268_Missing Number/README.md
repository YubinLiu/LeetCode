# 268. Missing Number
### Description
Given an array containing n distinct numbers taken from ```0, 1, 2, ..., n```, find the one that is missing from the array.

### Example:
```
Given nums = [0, 1, 3] return 2.
```
*Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?*

### First Try
首先是理解题目的意思：给了 n 个数字，但是从 0 到 n 之间有一个数字去掉了，要找出这个被去掉的数字。第一次尝试，就是计算出 0 至 n 的数字的总和（等差数列求和），然后减去输入数组的所有元素的和，差即为被去掉的数字。

>Note: 较为复杂的一种算法，获取输入数组的所有元素的和，以及利用等差数列求和公式，相减计算差值，注意等差数列求和时需要将得出的和转换为 int 型。

> Source Code: FirstSolution.java

> Runtime: 1 ms.

### Second Try
类似于第 136 题 —— Single Number 的做法，用异或运算来做。0 到 n 之间少了一个数，将这个少了一个数的组合与 0 到 n 之间完整的数组异或一下，那么相同的数字都变为0了，剩下的就是少了的那个数字了。

>Note: 位操作（异或操作），与完整数的组合异或，找到缺少的那个数。

> Source Code: SecondSolution.java

>Runtime: 1 ms

### Third Try
二分查找。对数组排序后，用二分查找法算出中间元素的下标，然后用元素值和下标值之间做对比，如果元素值大于下标值，则说明缺失的数字在左边，此时将 right 赋为 mid，反之则将 left 赋为 mid + 1。

>Note: 注意要先将输入的数组进行排序，比较中间元素后，再进行二分查找。

> Source Code: ThirdSolution.java

>Runtime: 1 ms
