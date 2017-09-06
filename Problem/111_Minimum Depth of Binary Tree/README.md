# 111. Minimum Depth of Binary Tree
### Description
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

### First Try
Refer to the Exercise 104_Maximum Depth of Binary Tree, this one is to get the minimum depth. Use recursion, but notice that, if the left subtree is null or the right subtree is null, like:
```
    1
   /
  2
 /
3
```
you need return 3 as the minimum depth. It means that you need judge the smaller one of minimum depth of left subtree and minimum depth of right subtree, if it's equal to 0, return the bigger one plus one as the result.
>Note: "left" as the minimum depth of left subtree, "right" as the minimum depth of right subtree, if one of them is 0(may both are), return (left + right + 1) as result.

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
Clean the code. Only return the smaller one between the minimum depth of left and the minimum depth of right when they both not null. But return the bigger one if one of them is null(or both of them are null).
>Note: Don't forget plus one.

> Source Code: SecondSolution.java

>Runtime: 1ms

### Third Try
Use iterative method. Use BFS. Use a queue to record each level's nodes. Return the depth if the node has no child.
>Note: Queue in java: <br>
poll(): Retrieves and removes the head of this queue, or returns null if this queue is empty.
peek(): Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

> Source Code: ThirdSolution.java

>Runtime: 1ms
