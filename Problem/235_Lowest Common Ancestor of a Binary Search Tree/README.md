# 235. Lowest Common Ancestor of a Binary Search Tree
### Description
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the [definition of LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
```
     _______6______
    /              \
 ___2__          ___8__
/      \        /      \
0      _4       7       9
      /  \
      3   5
```

### Example:
```
The lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
```

### First Try
本题是要找到二叉查找树中，两个结点的最近（低）公共祖先结点。<br>
首先，根据二叉查找树的特点，每个结点的左结点的值一定比它小，每个结点的右结点的值一定比它大。分情况来讨论：
1. 如果这两个结点的值均小于根结点的值，那么它们的最近（低）公共祖先结点一定在左子树上，所以用递归的方式，在左子树上找该最近（低）公共祖先结点；
2. 如果这两个结点的值均大于根结点的值，那么它们的最近（低）公共祖先结点一定在右子树上，同理用递归的方式，在右子树上找该最近（低）公共祖先结点；
3. 如果一个结点的值比根结点大，一个结点的值比根结点小，那么它们的最近（低）公共结点必定是根结点。

>Note: 利用二叉查找树的性质，递归地实现。

> Source Code: FirstSolution.java

> Runtime: 7 ms.

### Second Try
基本的逻辑类似于 First Try，采用分治法，在左、右子树上分别找最近（低）公共祖先结点，记作 left 和 right，如果 left 和 right 均为 null，则说明其最近（低）公共结点为根结点，否则返回非 null 的结点（left 或 right）。

>Note: 分治法，逻辑类似，在一开始要对 root、p、q 三个结点的值进行判断。

> Source Code: SecondSolution.java

>Runtime: 10 ms

### Third Try
如果不利用二叉查找树的性质，那么将这棵树当做一棵普通的树，如何处理？<br>
首先，遍历结点，分别找到从根结点（root）到两个结点（p、q）的路径，将两条路径上的所有结点保存在两个 list 中，然后一一取出 list 中的结点，比较是否相同，如果遇到不同，则返回最后一个相同的结点即可。

>Note: 没有用到二叉查找树的性质，依赖于找出到结点的路径，对路径上的结点一一比较。

> Source Code: ThirdSolution.java

>Runtime: 12 ms
