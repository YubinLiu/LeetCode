# 136. Single Number
### Description
Given an array of integers, every element appears twice except for one. Find that single one.

*Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*

### First Try
首先第一时间肯定能想到的是暴力破解，双重循环，判断元素是否只出现了一次，这样一来时间复杂度为 O(n²)，不符合要求（Note 中要求是线性复杂度）。所以另想方法。第一次尝试是，将数组排序，排序后，两两比较，如果两两不相等，则较小的那个为只出现一次的那个。例如：<br>
int a[] = {1, 1, 2, 2, 3, 4, 4}：两两比较，a[0] 和 a[1]，a[2] 和 a[3]，依次类推。即：1 和 1，相等；2 和 2 相等；3 和 4 不等，证明 3 是那个只出现一次的元素。如果循环未找出单一数字，那么最后一个元素即为单一数字。
>Note: 注意相邻元素两两比较，循环每次加2。

> Source Code: FirstSolution.java

> Runtime: 8ms.

### Second Try
实在是想不出来使用 O(n) 时间复杂度且不需要额外空间的算法，所以参考了一下 Discuss 中的内容，发现了新大陆。使用 XOR 运算，因
```
N XOR N = 0
N XOR 0 = N，
```
且异或运算可交换，所以如果输入为[2, 3, 4, 1, 3, 2, 4]，进行异或运算后，变为：
```
(2^2) ^ (3^3) ^ (4^4) ^ 1 = 0 ^ 0 ^ 0 ^ 1 = 1
```
则找出了 single number，且时间复杂度为 O(n) 且不需要额外空间。
>Note: 真的想不到还有这种操作，还是得多加练习才行。

> Source Code: SecondSolution.java

>Runtime: 1ms
