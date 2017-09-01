# 101. Symmetric Tree
### Description
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

### Example:
```
this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3

But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
```
*Note:
Bonus points if you could solve it both recursively and iteratively.*

### First Try
Use recursion. Check whether if the tree is a mirror of itself, firstly, if the tree is null, return true. And then compare it's left child(named l) and right child(named r). The left child's value of l must equal to right child's value of r, and the right child's value of l must equals to left child's value of r.
>Note: Refer to the Exercise 100, Same Tree, need to judge if one of the input is null(one of them is null, or all of them is null).

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
Use iterative method. Using a stack to save the treenode in order of left.left, right.right, left.right, right.left, then pop them to compare the value, until the stack's number of elements is less than one.
>Note: The order of elements push into stack is important.
> Source Code: SecondSolution.java

>Runtime: 3ms
