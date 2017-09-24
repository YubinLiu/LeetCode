# 190. Reverse Bits
### Description
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

### Example:
```
Given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
```
*Follow up:
If this function is called many times, how would you optimize it?*

### First Try
比较暴力的一种方法。首先声明一个作为存储最终结果的变量，记作 sum。因为输入是一个 32 位无符号整数，所以用一个 for 循环，将输入的整数从其低位开始，用与运算得到当前的二进制位数是 0 还是 1，后乘以 2<sup>31 - i</sup>（i 从 0 到 31），将每一位的和加起来，即为结果。

>Note: 每一次都要进行一次幂运算，计算量较大。

> Source Code: FirstSolution.java

> Runtime: 4ms.

### Second Try
声明一个变量 result 作为返回结果。原数不断右移取出最低位，赋给新数的最低位后新数再不断左移。

>Note: 注意为 32 为的无符号整数，n 要进行无符号右移操作，即 >>>。

> Source Code: SecondSolution.java

> Runtime: 2ms.
