# 121. Best Time to Buy and Sell Stock
### Description
Say you have an array for which the i<sup>th</sup> element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

### Example:
Example 1:
```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
```
Example 2:
```
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
```

### First Try
At first, I use brute force method, but "Time Limit Exceeded". So, change it. One loop, find the minimum number(called "min") of array[0]...array[i], i is smaller than the array length, so, (array[i] - min) is the maximum profit you can get in i. Find the biggest one of them, it's the result.  
>Note: Judge if the input is empty at first.

> Source Code: FirstSolution.java

> Runtime: 2ms.
