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
1.  新建一个大小为 n 的 boolean 型数组 isPrime，标记每个数是否为素数。
2. 从 2 开始，所有 2 的倍数都不是素数，所以让 isPrime 数组中的 4，6，8 ... 这些 2 的倍数的位置标记为 false，表示非素数。
3. 同样的，我们看 3，3未被标记为非素数，所以将 isPrime 数组的 3，6，9 中 3 的倍数的位置标记为 false。
4. 其余同理，以此类推。

>Note: 需要注意的是，如 10，15等，已经在 2，3 的倍数中被标记为非素数了，那么，当 5 的倍数标记时，应该跳过这些数。也就是说，我们可以直接从 5 * 5 = 25 开始进行标记。即如果当前的数字是 p，那么我们从 p² 开始标记即可（p²，p² + p，p² + 2p ...）。

> Source Code: SecondSolution.java

>Runtime: 36 ms

### Third Try
改进 Second Try，声明 boolean 数组 isNotPrime，表示非素数，用默认值（数组每个元素的值都为 false）。从 2 开始，若是素数，个数加 1，同理用埃氏筛。

>Note: 利用 boolean 数组的每个元素初始值为 false 构造一个非素数的数组。

> Source Code: ThirdSolution.java

>Runtime: 29 ms

### Fourth Try
最小素数为 2，所以首先判断当 n 小于 3 时，小于 n 的素数个数为 0。接着，我们假设素数的个数初始值 count 为 n / 2（因为小于 n 的数中，有一半是偶数，偶数除了 2 都不是素数，当然 1 是奇数但非素数，这两个抵消）。当发现一个素数不是奇数时，count--。用一个 boolean 数组来标记非素数。如果 i 是合数，那么 i * i + i 也是合数，奇数 + 奇数是偶数，所以也必定是合数。

>Note: 在 Discuss 中看到的一个比较复杂但是效率高的一个算法。

> Source Code: FourthSolution.java

>Runtime: 12 ms
