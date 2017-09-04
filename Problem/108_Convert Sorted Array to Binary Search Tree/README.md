# 108. Convert Sorted Array to Binary Search Tree
### Description
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

### First Try
Binary Search Tree is an empty tree, or it will have the features below:
1. If the left subtree is not null, all of the nodes on the left subtree, their values is not bigger than the root's value.
2. If the right subtree is not null, all of the nodes on the right subtree, their values is not smaller than the root's value.
3. The left subtree and the right subtree is also binary search tree.

Use bisection method(二分法) and recursion. Convert an array to a tree, the midpoint as the root, the left of midpoint as the left subtrees, the right of midpoint as the right subtrees, and so on(依次进行下去). If you want to construct the binary search tree, just turn the middle element of the array as root, and construct the left subtrees and right subtrees recursively.
>Note: Clear the defination of binary search tree at first.

> Source Code: FirstSolution.java

> Runtime: 2ms.

### Second Try
Use iterative method. Three stacks, one is to save the node, one is to save the left indexes, one is to save the right indexes. The main thought is same as the recursive method.
>Note: Not my thought, I refer to https://discuss.leetcode.com/topic/14412/java-iterative-solution.

> Source Code: SecondSolution.java

> Runtime: 9ms.
