# 219. Contains Duplicate II
### Description
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

### First Try
类似于第 217 题的 Contains Duplicate，但此题意在找出两个重复的数，但这两个数差的绝对值不能大于 k。<br>
所以，第一次尝试，用 HashMap 将每个数（数组中每个数的值作为 key）和其下标（作为 value）映射保存起来，后每次添加时，判断是否当前值存在于 HashMap 的 key 集合中，若存在，再判断当前下标和之前存储的下标差值是否不大于 k。

>Note: 根据题目的意思，最直观的一种做法。

> Source Code: FirstSolution.java

> Runtime: 20 ms.

### Second Try
使用 HashSet，即不用保存数组中的值和其下标的映射。判断如果当前的下标已经大于 k，那么就将下标为 i - k - 1 的值从 HashSet 中移开，相当于就是维持一个大小为 k 的一个移动窗口，每次向后移动一格，在其中的重复值其下标差必定不大于 k。

>Note: 先判断当前下标与 k 的大小，再判断是否 HashSet 中含当前值。


> Source Code: SecondSolution.java

>Runtime: 14 ms

### Third Try
一个 0ms 的解决方案，其中加了一些判断，可能是针对测试用例写的，如 k > 3000 直接 return false。之后的基本思路类似，用两个循环，判断是否有重复值。

>Note: 大神的做法，借鉴一下。

> Source Code: ThirdSolution.java

>Runtime: 0 ms
