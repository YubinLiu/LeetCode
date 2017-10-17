# 263. Ugly Number
### Description
Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include ```2, 3, 5```. For example, ```6, 8``` are ugly while ```14``` is not ugly since it includes another prime factor ```7```.

Note that ```1``` is typically treated as an ugly number.

### First Try
首先根据题意，先清楚“丑数”的定义：一个数是“丑数”，当且仅当它只能被 2，3，5 整除（n 能被 m 整除，表示为 n % m == 0）。所以一个数，如果能被 2 整除，那么就将其连续除以 2；如果能被 3 整除，就将其连续除以 3,；如果能被 5 整除，就将其连续除以 5。这样，得到的最终结果如果是 1，那么该数为“丑数”。
>Note: 注意“丑数”一定要是正数，而且 1 规定算作丑数。

> Source Code: FirstSolution.java

> Runtime: 2 ms.

### Second Try
基本逻辑一样，不过利用 for 循环，减少代码量，写的更简单。

>Note: 利用 for 循环对 2，3，5 进行取余和出发操作。

> Source Code: SecondSolution.java

>Runtime: 2 ms
