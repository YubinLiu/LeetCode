# 202. Happy Number
### Description
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

### Example:
19 is a happy number

1<sup>2</sup> + 9<sup>2</sup> = 82 <br>
8<sup>2</sup> + 2<sup>2</sup> = 68 <br>
6<sup>2</sup> + 8<sup>2</sup> = 100 <br>
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1


### First Try
首先根据题目意思，明白“ 快乐数 ”的定义：一个数的各个位的数字的平方和相加，将得出的数的各个位的数字的平方和继续相加，循环往复，如果得出的最终结果如果是 1，那么这个数就是快乐数。否则，若陷入无限循环，则这个数不是快乐数。 <br>
首先，如果一个数是非快乐数，那么它会陷入一个无限循环中，如：<br>
```
输入：11

计算过程：
1^2 + 1^2 = 2
2^2 = 4
4^2 = 16
1^2 + 6^2 = 37
3^2 + 7^2 = 58
5^2 + 8^2 = 89
8^2 + 9^2 = 145
1^2 + 4^2 + 5^2 = 42
4^2 + 2^2 = 20
2^2 + 0^2 = 4
...
```
会进入 4 16 37 ... 20 ... 这样一个无限循环。<br>
所以，考虑用一个 HashSet 保存每一次计算出来的结果，如果本次计算出的结果已经在 HashSet 中，证明有循环，那么就 return false 即可。如果最后算得结果为 1，那么 return true。

>Note: 用了大量空间保存中间结果，且每次要将中间结果放入 HashSet 中，效率较低。

> Source Code: FirstSolution.java

> Runtime: 5ms.

### Second Try
如何不用额外的空间呢？查找了资料，发现每一个非快乐数，都会进入 4 16 37 ... 20 这样的循环中，所以只要判断是否计算的中间结果中包含 4 即可，若包含，则 return false。否则，当计算结果为 1 时，return true。
>Note: 找规律，减少额外空间的使用。

> Source Code: SecondSolution.java

>Runtime: 2ms

### Third Try
思路跟 Second Try 一样，改进代码，用递归，更清爽。
>Note: 准确找出递归终止条件。

> Source Code: ThirdSolution.java

>Runtime: 1ms

### Fourth Try
类比 Problem 141 Linked List Cycle，当初用快慢指针来判断是否一个链表中存在环，这里也是一样的道理。因为如果是快乐数，那么最后的计算结果一定是 1，快指针和慢指针会相遇。而非快乐数中有无限循环，那么快指针和慢指针最终一定会相遇，但最终结果非 1。
>Note: 有环，快慢指针就派上用场了。

> Source Code: FourthSolution.java

>Runtime: 1ms
