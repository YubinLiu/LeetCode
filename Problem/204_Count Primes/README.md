# 204. Count Primes
### Description
Count the number of prime numbers less than a non-negative number, n.

### First Try
题目的意思比较清楚，输入一个整数 n，求小于 n 的素数的个数。首先，想到的是编写一个判断某个数字是否是素数的函数 isPrime()，在其中，通过 n 对 2 ... √n 的每个数字取余是否为 0 来判断是否该数是一个素数。对 2 ... n 的数字执行 isPrime()，判断其是否是素数，如果是素数，则小于 n 的素数个数 +1。
>Note: 将循环从 2 ... n 改进到 2 ... √n，但是算法复杂度依旧过大，运行超时，缩小算法的时间复杂度，空间换时间可好？

> Source Code: FirstSolution.java

> Runtime: Time Limit Exceeded.

### Second Try
空间换时间，Sieve of Eratosthenes。埃拉托斯特尼筛法（埃氏筛）。<br>
原理：从2开始，将每个素数的各个倍数，标记成合数。一个素数的各个倍数，是一个差为此素数本身的等差数列。<br>
算法步骤：
1.  


>Note: In this case, only the worst situation we need put all elements in nums to map. Space cost replace time cost.

> Source Code: SecondSolution.java

>Runtime: 9ms
