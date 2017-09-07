# 112. Path Sum
### Description
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

### Example:
Given the below binary tree and sum = 22,
```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
```
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

### First Try
Use recursion. Of course if the root is null, return null. And when root.left and root.right are null, it means root is the leaf node, then judge if it's value equals to the sum. If not, then use recursion to compare the value of root.left and root.right, if one of them is equal to the difference between sum and root.val, then return true.
>Note: Clear the question, it must be the path from root to leaf.

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
Use iterative method. Two stack, one records the node, one records the path sum to the current node. If the current node's is a leaf node and it's path sum equals to the sum, return true.
>Note: Although recursive method is clearer, but always try to turn it to an iterative method for practcing.

> Source Code: SecondSolution.java

>Runtime: 6ms
