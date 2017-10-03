# 217. Contains Duplicate
### Description
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

### First Try
Use HashSet. Put each elements into the HashSet, if the element has been in it, return false. But you can optimize the code step by step.
1. Use a loop, each time you need judge if the set has contained the current element.
2. Add all elements to the HashSet, and at last(out of the loop), judge if the input array's length equals to the HashSet's size.
3. The add() method of HashSet will return a boolean variable, if return true, the current element is not in the HashSet, else return false.

>Note: All use HashSet to solve the problem, wirte them all in first try. And you don't need the index of each elements, so use foreach is fine.

> Source Code: FirstSolution_1.java, FirstSolution_2.java, FirstSolution_3.java.

> Runtime: 20 ms, 15 ms, 13 ms.

### Second Try
Sort the input array, and compare the element(start from index of 1) with it's previous one. If they has the same value, return true.

>Note: Use Arrays.sort() to sort the input array.

> Source Code: SecondSolution.java

>Runtime: 6 ms
