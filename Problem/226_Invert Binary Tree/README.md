# 226. Invert Binary Tree
### Description
Invert a binary tree.
```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```
to
```
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

### First Try
本题的要求就是将一个二叉树反转，即交换每一层的左右结点。首先是用递归的方法实现。交换根结点左右子树，对左右子树分别进行递归反转。
>Note: 递归的方法写，逻辑清楚，代码量少。

> Source Code: FirstSolution.java

> Runtime: 0 ms.

### Second Try
用迭代的方法。一层一层遍历，用一个队列 queue 保存相应的结点。先将根结点放入队列中，后交换其左右结点，若其左右结点存在，将它们放入队列，以此类推，直到队列 queue 中没有结点为止。即交换根结点的左右结点，交换第二层每个结点的左右结点，以此类推。
>Note: 迭代的方法，用队列辅助保存相应结点。

> Source Code: SecondSolution.java

>Runtime: 0 ms
