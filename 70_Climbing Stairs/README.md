# 70. Climbing Stairs
### Description
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

*Note: Given n will be a positive integer.*

### First Try
Dynamic programming. First of all, define the sub problem. For each stairs, called i (i > 2 && i <= n), you can reach i by two ways: one step from i - 1; two steps from i - 2. Calculate the distinct ways in i - 1 and i - 2, and their sum is the distinct ways in i.

>Note: Using recursion will cause time limited, you need to keep the data you've calculated.

> Source Code: FirstSolution.java

> Runtime: 0ms.

### Second Try
Reduce the using of extra space.

>Note: No need to use array to save the data, using three integer, and change their value during the calculation.

> Source Code: SecondSolution.java

>Runtime: 0ms
