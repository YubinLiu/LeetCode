# 172. Factorial Trailing Zeroes
### Description
Given an integer n, return the number of trailing zeroes in n!.

*Note: Your solution should be in logarithmic time complexity.*

### First Try
首先求出 n!，然后计算末尾 0 的个数。（重复 ÷ 10，直到余数非0）。在阶乘数较大的时候会导致溢出，且时间复杂度过大，不符合题目要求的对数的时间复杂度。（一开始用 int 存储计算出来的阶乘结果，后来使用 long 存储，但当阶乘数太大时，均会导致溢出）。
>Note: 减小代码的时间复杂度，是否不需要求出阶乘的结果？

> Source Code: FirstSolution.java

> Runtime: Time Limit Exceeded

### Second Try
求一个整数的阶乘末尾有多少个0，0 是 2 和 5 相乘得到的。在 1 到 n 这个范围内，2 的个数要远多于 5 的个数，所以这里只需计算从 1 到 n 这个范围内有多少个 5 即可。例如，7! 有一个 5，10! 有两个 5。
>Note: 特殊情况，如 25，125 等，它们会包含额外的 5，所以这时候首先进行 n / 5，移除单个 5，然后再进行 n / 5 / 5，移除额外的 5。以此类推。

> Source Code: SecondSolution.java

>Runtime: 1ms

### Third Try
使用递归，将代码压缩为 1 行。
>Note: 简化代码。

> Source Code: ThirdSolution.java

>Runtime: 1ms
