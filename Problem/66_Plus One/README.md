# 66. Plus One
### Description
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.

### First Try
Get each elements of input, if one of them plus one is less than zero, let it plus one and return the array. But when the first element need to plus one, and it's value plus one is bigger than 9, you need a new array with first element values one, and the rest of them are zero.

>Note: When an element plus one less than 9, you can return the result. The new array no need to assign each elements, just assign 1 to the first element, the others default value is zero.

> Source Code: FirstSolution.java

>Runtime: 0ms
