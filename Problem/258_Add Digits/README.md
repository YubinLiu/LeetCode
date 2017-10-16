# 258. Add Digits
### Description
Given a non-negative integer ```num```, repeatedly add all its digits until the result has only one digit.

### Example:
```
Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
```
*Follow up:
Could you do it without any loop/recursion in O(1) runtime?*

### First Try
本题要求，是将一个数的各个位数求和，得到的数继续做各个位数的求和，直到该数为个位数。按照上述过程，每次对各个位数求和，判断是否已是个位数，若是，则返回这个个位数，否则继续对各个位数进行求和操作。
>Note: 与之前的第 202 题 —— Happy Number 类似，跟各个位数的数字有关，用取余以及除法运算完成。

> Source Code: FirstSolution.java

> Runtime: 2 ms.

### Second Try
找规律。观察 1 至 20 所有的数字的最终结果如下：<br>
```
1 1    |   10 1
2 2    |   11 2
3 3    |   12 3
4 4    |   13 4
5 5    |   14 5
6 6    |   15 6
7 7    |   16 7
8 8    |   17 8
9 9    |   18 9
```
9 个一循环，所有大于 9 的数都是对 9 取余，对于等于 9 的数对 9 取余为 0，为了得到其本身，而且也要对大于 9 的数适用，用 (n - 1) % 9 + 1 这个表达式来包括所有的情况。
>Note: 找规律。

> Source Code: SecondSolution.java

>Runtime: 2 ms
