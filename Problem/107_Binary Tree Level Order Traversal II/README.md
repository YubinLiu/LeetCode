# 107. Binary Tree Level Order Traversal II
### Description
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

### Example:
Given binary tree [3,9,20,null,null,15,7],

```
    3
   / \
  9  20
    /  \
   15   7
```
return its bottom-up level order traversal as:
```
[
  [15,7],
  [9,20],
  [3]
]
```

### First Try
Use a variable named "result" as return. Use a variable named "nodes" to keep the nodes of each level. Get the number of current level's nodes at first, use a loop to get each node's value of current level, and add them into a list named "values". Add the "values" to the "result", every time you should add to it's head location.   
>Note:
1. Use LinkedList but not ArrayList, because the former is better at adding data;
2. Get each level's nodes number at first;
3. Always add the list to the head location of "result".

> Source Code: FirstSolution.java

> Runtime: 2ms.

### Second Try
Use recursion. If the size of "result" is less than the level, means it's not the last level, and you need add a new list at the head location of the "result". Then add the node's value into the correct location of the "result". Do the same operation to the left child and right child.
>Note: Record the level, and add the value to the correct location.

> Source Code: SecondSolution.java

> Runtime: 2ms.
