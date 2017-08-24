# 38. Count and Say
### Description
The count-and-say sequence is the sequence of integers with the first five terms as following:
```
1.     1
2.     11
3.     21
4.     1211
5.     111221
```
1 is read off as "one 1" or 11.<br>
11 is read off as "two 1s" or 21.<br>
21 is read off as "one 2, then one 1" or 1211.<br>
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

### Example:

##### Example 1:
```
Input: 1
Output: "1"
```
##### Example 2:
```
Input: 4
Output: "1211"
```

### First Try
这题的题目有点儿绕，所以打算用中文来解释。
* 题目说明。有一个序列：<br>
第 1 个元素是 1；<br>
第 2 个元素表示读第 1 个元素的值，即 1 个 1，表示为 11； <br>
第 3 个元素表示读第 2 个元素的值，即 2 个 1，表示为 21； <br>
第 4 个元素表示读第 3 个元素的值，即 1 个 2，1 个 1，表示为 1211； <br>
第 5 个元素表示读第 4 个元素的值，即 1 个 1，1 个 2，2 个 1，表示为 111221，以此类推。<br>

* 输入输出。输入一个整数 n，输出序列中第 n 个的值。

* 解题思路。暴力求解。首先初始化字符串 result 为 “1”。用 while 循环，从序列中第 1 个元素开始，一直求到第 n 个元素（因每一个元素的值都依赖于它前面的那个元素的值）。循环中调用 countOnce() 方法，获得字符串每个元素的值，以及计算相连的相同值的个数，将结果其通过 StringBuilder 对象连接字符串，最终返回，重新赋值给result。

>Note: 使用 StringBuilder 的 append() 时，需要将 int 类型转换为 String，这样后面的 “+” 才会解释为字符串的连接。或者可以用两个append()。

> Source Code: FirstSolution.java

> Runtime: 6ms.
