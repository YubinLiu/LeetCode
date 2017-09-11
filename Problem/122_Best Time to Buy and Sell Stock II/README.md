# 122. Best Time to Buy and Sell Stock II
### Description
Say you have an array for which the i<sup>th</sup> element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

### First Try
Use a loop, get array, if the i<sup>th</sup>(1 <= i < array.length) price is bigger than the (i-1)<sup>th</sup>, add it. Return the sum as result.
>Note: Easy if you understand the question.

> Source Code: FirstSolution.java

> Runtime: 1ms.
