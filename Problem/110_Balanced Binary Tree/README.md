# 110. Balanced Binary Tree
### Description
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

### First Try
Balanced Binary Tree, it's an empty tree, or the difference(the absolute value) between it's left subtree's height and right subtree's height not bigger than one. And the left subtrees and right subtrees are also balanced binary tree.

Use recursion. Refer to the exercise 104-Maximum Depth of Binary Tree, get the maximum depth of left subtree and the maximum depth of right subtree, calculate their difference to judge if it is not bigger than one, do the same thing to the left subtree and right subtree.
>Note: Some exercises are related to the exercises before.

> Source Code: FirstSolution.java

> Runtime: 2ms.
