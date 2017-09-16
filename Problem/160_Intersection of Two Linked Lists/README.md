# 160. Intersection of Two Linked Lists
### Description
Write a program to find the node at which the intersection of two singly linked lists begins.

### Example:
The following two linked lists:
```
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
```
begin to intersect at node c1.

*Notes:*
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.

### First Try
用两个循环，首先遍历 A 链表，将 A 链表中的所有元素加入到 Set 中。后遍历 B 链表，判断 B 链表中的元素是否在 Set 中，如果是，返回该元素；若遍历完后仍未找到，返回 null。
>Note: 当然暴力破解也是一种方法，但是效率低，就不贴代码了。这题有些类似于第 141 题，Linked List Cycle。

> Source Code: FirstSolution.java

> Runtime: 14ms.

### Second Try
链表 A，B 从相同位置的点出发，到达它们的交点。即如 Example 中的例子，链表 B 较长，用循环的话，B应该从 b2 开始向后遍历，链表 A 则从 a1 开始向后遍历，移动相同步数，即可找到交点。<br>
那么，首先要求出的是链表 A，B 的长度，将长度较长的链表先移动到两长度之差的位置，较短的链表则从头移动，比较链表 A，B 的元素，若相等，返回该元素；若到表尾仍未找到，返回 null。
>Note: 需要额外的两个指针指向链表 A，B 来求得链表长度。思考：能不能不用求出两个链表的长度呢？

> Source Code: SecondSolution.java

>Runtime: 2ms

### Third Try
根据 Second Try，思考是否需要求得两个链表的长度的差值呢？其实，最终我们关心的只是两个指针同时到达交点。用两个指针 a，b 分别指向链表 A，B 的头结点，向后遍历，那么长度较短的链表的指针先遇到 null，此时让它指向长度较长链表的头结点，继续向后遍历；同理当长度较长的链表到表尾时，让它指向长度较短的链表的头结点，继续向后遍历。此时，两个指针的起点位置是相同的，向后遍历，判断是否有交点。
>Note: 不需要额外地去把两个链表的长度分别求出来后计算它们的差值。

> Source Code: ThirdSolution.java

>Runtime: 2ms
