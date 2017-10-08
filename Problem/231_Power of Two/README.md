# 231. Power of Two
### Description
Given an integer, write a function to determine if it is a power of two.

### First Try
题目清楚明白，就是输入一个整型数，判断它是不是 2 的多少次方。首先第一个想法就是用一个循环，计算 2 的 0 次方一直到 2 的 32 次方的数，与输入的 n 进行比较，如果相同，返回 true。如果都不等，则返回 false。
>Note: 一个比较暴力低效的方法，在计算上花费大量时间不可取。

> Source Code: FirstSolution.java

> Runtime: 6 ms.

### Second Try
判断 n % 2 是否为 0，若为 0，则另 n /= 2，重复该操作，直到 n % 2 不为 0，此时判断 n 的值是否为 1，若为 1，则返回 true，否则返回 false。
>Note: 减少计算量，但是否可以不用循环？

> Source Code: SecondSolution.java

>Runtime: 2 ms

### Third Try
利用 Java 的 Integer 类的 bitCount() 方法，因为 2 的 n 次方，它的二进制表示形式一定只有一个 1，所以只要判断输入大于 0，且其二进制表示形式中只有一个 1 即可。
>Note: 利用 Java API，以及 2 的 n 次方的二进制表示的性质。

> Source Code: ThirdSolution.java

>Runtime: 2 ms

### Fourth Try
利用 &（与）运算。即判断输入 n & n - 1 的值是否为 0 即可。n 如果是 2 的多少次方，那么其二进制表示一定是最高位为 1，其余为 0；而 n - 1 的二进制表示一定是最高位为 0，其余为 1，与运算后，结果必定为 0。
>Note: 利用 2 的次方数的二进制表示形式的性质做位运算求解。

> Source Code: FourthSolution.java

>Runtime: 2 ms
