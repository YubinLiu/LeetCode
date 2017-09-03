# 108. Convert Sorted Array to Binary Search Tree
### Description
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

### First Try
Binary Search Tree is an empty tree, or it will have the features below:
1. If the left subtree is not null, all of the nodes on the left subtree, their values is not bigger than the root's value.
2. If the right subtree is not null, all of the nodes on the right subtree, their values is not smaller than the root's value.
3. The left subtree and the right subtree is also binary search tree.

Use bisection method(二分法) and recursion. The root's value is the middle element's value of the input(named nums). Then elements' values of 0...middle-1 of nums will be the left subtrees' values, and elements' values of middle+1...nums.length-1 of nums will be the right subtrees' values.  
>Note: Clear the defination of binary search tree at first.

> Source Code: FirstSolution.java

> Runtime: 2ms.
