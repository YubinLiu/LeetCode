# 141. Linked List Cycle
### Description
Given a linked list, determine if it has a cycle in it. <br>
*Follow up:
Can you solve it without using extra space?*

### First Try
首先想到的是遍历这个 List，通过 Set 来保存结点，如果 Set 中已存在相同的结点，那么就证明有环，否则无环。
>Note: 用了额外的空间，仍可改进。当然还有一种效率更低的方法是采用两个循环，外循环每前进一个节点，内循环遍历之后的所有节点，就不说了。

> Source Code: FirstSolution.java

> Runtime: 9ms.

### Second Try
快慢指针。这个方法我是真的又没有想到，此方法不需要额外的空间，详细如下：<br>
* 算法描述：设有两个指针，记作 fastPointer 和 slowPointer，fastPointer 每次走两步，slowPointer 每次走一步，如果不存在环，fastPointer 肯定会先到 List 尾，循环结束。返回 false。如果存在环，那么 fastPointer 会先进入环，slowPointer 后进入环，相当于 fastPointer 去追 slowPointer，由于 fastPointer 每次移动多一步，所以一定能追上 slowPointer。 <br>
* 思考：类似于两个人在操场跑圈（速度不变），快的那个人总会追上慢的那个（套圈）。本例中，如果没有循环，那么快的那个会先到达末尾，返回 false；否则进入循环，快的先进入循环，慢的随后，那么快的一定会追上慢的，这时候，两者相等，就返回 true。

>Note: 这个方法还有一个用处，就是查找一个链表的中间节点：用一个快指针（每次移动两步），一个慢指针（每次移动一步），当快指针到达末尾时，慢指针也就到达了中间节点。

> Source Code: SecondSolution.java

>Runtime: 1ms
