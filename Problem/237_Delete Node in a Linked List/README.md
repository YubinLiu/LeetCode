# 237. Delete Node in a Linked List
### Description
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is ```1 -> 2 -> 3 -> 4``` and you are given the third node with value ```3```, the linked list should become ```1 -> 2 -> 4``` after calling your function.

### First Try
本题的要求是要从链表中删除指定的结点。只给出了需要删除的指定结点，并没有链表的起始结点。所以，我们只需要将下一个结点的值覆盖当前要删除的结点的值，并将当前要删除结点的 next 指针指向它的下下一个结点即可。

>Note: 与之前的题目略有不同，因这题未给出链表的头结点，不是用前一个结点的 next 指针指向要删除结点的下一个结点。

> Source Code: FirstSolution.java

> Runtime: 1 ms.
