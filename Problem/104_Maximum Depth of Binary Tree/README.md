# 104. Maximum Depth of Binary Tree
### Description
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

### First Try
Use recursion. The maximum depth of the tree is the bigger one of maximum depth of root's left child and maximum depth of root's right child plus one.
>Note: Remember to plus one, the root's depth.

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
Use iterative method. Two stack, one is to keep the node, the other is to keep each node's depth, get the maximum one and return.
>Note: Recursive method is clearer and shorter.

> Source Code: SecondSolution.java

>Runtime: 7ms
