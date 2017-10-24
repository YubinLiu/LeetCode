# 278. First Bad Version
### Description
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have ```n``` versions ```[1, 2, ..., n]``` and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API ```bool isBadVersion(version)``` which will return whether ```version``` is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

### First Try
首先是清楚题目的意思。一个产品有 n 个版本（记为 1 ... n），其中有一个版本是坏的，它之后的所有版本也都是坏的，找到第一个坏版本。给定了一个 bool isBadVersion(version) 的函数，利用这个函数来判断某一版本是否是坏版本。首先第一个想法，就是遍历这 1 ... n 个版本，对每个版本进行一次判断（即调用 isBadVersion()），第一次该函数返回 true 的时候，该版本即为第一个坏版本。

>Note: 道理虽简单，但题目要求尽可能少的调用这个 isBadVersion() 函数，所以此方法被判定为超时。

> Source Code: FirstSolution.java

> Runtime: Time Limit Exceeded

### Second Try
二分查找法。从 1 ... n 版本中，找到第一个坏版本。首先我们找出中间那个版本（记作 mid），判断其是否是坏版本，如果是坏版本，那么第一个坏版本一定在 1 ... mid 中；如果 mid 版本是好版本，那么第一个坏版本一定在 (mid + 1) ... n 中。

>Note: 关于 mid 的计算，一开始用的是 (left + right) / 2，而当版本数太多时，会出现溢出，所以利用 left + (right - left) / 2 来计算中间版本。

> Source Code: SecondSolution.java

>Runtime: 17 ms
