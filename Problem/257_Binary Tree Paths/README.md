# 257. Binary Tree Paths
### Description
Given a binary tree, return all root-to-leaf paths.

### Example:
Given the following binary tree:
```
   1
 /   \
2     3
 \
  5
```
All root-to-leaf paths are:
```
["1->2->5", "1->3"]
```

### First Try
递归算法，遍历二叉树，遍历的过程中记录之前的路径，一旦遍历到叶子结点就将该路径添加到 list 中。

>Note: 用一个辅助方法作为递归的方法实现，注意链表每个字符串的格式。

> Source Code: FirstSolution.java

> Runtime: 15 ms.
