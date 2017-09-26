# 198. House Robber
### Description
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

### First Try
本题大致意思就是，小偷盗窃每一个不相邻的家庭，能偷到最多的钱是多少。即要找出数组中所有不相邻元素的和最大是多少。给定了一个规则（不相邻），求解任意状态下的解，可以采用动态规划来完成。<br>
小偷不能同时盗窃相邻的房子，所以在累加时，有两种选择：
1. 对于当前房子来说，如果小偷盗窃了上一个房子，那么最大的收益就是上一个房子的最大收益。
2. 如果小偷没有盗窃上一个房子，而选择盗窃当前的房子，那么最大收益应该是当前房子有的钱，加 上一个房子的上一个房子 的最大收益。

判断 1 和 2 中哪个值比较大即可，作为递推式。需要两个变量来保存之前的结果，即需保存 上上个房子的最大收益 和 上一个房子的最大收益。

>Note: 首先要判断输入的数组长度不大于 2 的情况。

> Source Code: FirstSolution.java

> Runtime: 0ms.

### Second Try
思路大致与 First Try 相同。用一个数组来存放盗窃当前房子所能获得的最大收益，那么数组最后两个元素（即最后两个房子）中较大收益的那个，即为小偷能盗窃的最大收益。

>Note: 用了更多的空间来存放中间结果。

> Source Code: SecondSolution.java

> Runtime: 0ms.
