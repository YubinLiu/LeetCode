# 169. Majority Element
### Description
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

### First Try
Use HashMap to record each element and it's amount. If the element's amount more than the (nums.length / 2), return this element.
>Note: Use extra space for map, optimize it. Brute force is also a method, but no need to paste the code.

> Source Code: FirstSolution.java

> Runtime: 39ms.

### Second Try
Sort the array, and return the middle element of the array.
>Note: The question says "...the majority element always exist in the array.", if the majority element always exist, after sorting the array, the middle element must be the majority element.

> Source Code: SecondSolution.java

>Runtime: 2ms

### Third Try
Moore’s Voting Algorithm. <br>
The original thought is to find a pair of different elements each time, and remove them from the array, util the array is empty, or it's elements are the same. If the array has majority element, the rest of array must be the majority element. <br>
We don't need to remove elements from array, but use a counter. Get each elements of array, if the current one equals to the major, counter++; else counter--. When counter equals zero, assign the current element to major. Finally, return the major.

>Note: If the element is the majority element, the counter will always more than zero.

> Source Code: ThirdSolution.java

>Runtime: 2ms
