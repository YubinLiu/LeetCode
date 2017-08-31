# 100. Same Tree
### Description
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

### First Try
Using recursion. If p is null and q is null, return true. But if one of them is null, the other is not, return false. Judge if two tree is the same tree, judge their root's value at first, and then judge their left node's value or right node's value is the same.
>Note: Inputs might be null, judge them at first.

> Source Code: FirstSolution.java

> Runtime: 0ms.

### Second Try
Clean the code.
>Note: Don't use too many return statements.

> Source Code: SecondSolution.java

> Runtime: 0ms.
