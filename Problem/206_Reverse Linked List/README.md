# 206. Reverse Linked List
### Description
Reverse a singly linked list.

**Hint:** <br>
A linked list can be reversed either iteratively or recursively. Could you implement both?

### First Try
迭代的方法。以单链表 1 -> 2 -> 3 -> 4 为例。我们要将其转变为 4 -> 3 -> 2 -> 1。对于当前结点来说，需要将其 next 指针指向其上一个结点，所以要将上一个结点保存起来。在改变引用时，还应保存其下一个引用，最后返回新的头结点。<br>
例：1 -> 2 -> 3 -> 4 <br>
转换步骤为
1. 2 -> 1 -> 3 -> 4
2. 3 -> 2 -> 1 -> 4
3. 4 -> 3 -> 2 -> 1

>Note: 要改变哪个结点的引用得先将其进行暂存。

> Source Code: FirstSolution.java

> Runtime: 0 ms.

### Second Try
递归的方法。思路大致相同，用例子来说明。<br>
单链表 n<sub>1</sub> -> n<sub>2</sub> -> ... -> n<sub>k-1</sub> -> n<sub>k</sub> -> n<sub>k+1</sub> -> ... n<sub>m</sub>，假设结点 n<sub>k+1> 到 n<sub>m</sub>已经被反转如下：<br>
n<sub>1</sub> → … → n<sub>k-1</sub> → n<sub>k</sub> → n<sub>k+1</sub> ← … ← n<sub>m</sub>，当前结点为 n<sub>k</sub>，我们需要结点 n<sub>k+1</sub> 的 next 结点指向 n<sub>k</sub>，即 n<sub>k</sub>.next.next = n<sub>k</sub>。

>Note:  n<sub>1</sub>的 next 结点需指向空。

> Source Code: SecondSolution.java

>Runtime: 1 ms
