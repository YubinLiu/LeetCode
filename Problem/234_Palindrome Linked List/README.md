# 234. Palindrome Linked List
### Description
Given a singly linked list, determine if it is a palindrome.

**Follow up:** <br>
Could you do it in O(n) time and O(1) space?

### First Try
判断一个链表是否是一个回文链表。之前也有类似的回文的题目，如判断一个数是否是回文数以及判断字符串是否回文。但是对于链表来说，我们不能够直接通过下标来访问每个元素，只能一个个遍历。那么如何判断回文呢？<br>
第一次尝试，是利用快慢指针，获得链表的中间结点，将中间结点之前的所有结点依次放入栈中，从中间结点开始向后遍历，并将栈中的元素依次弹出进行比较，若有一个不等，则非回文；如果都相同，则为回文链表。

>Note: 用到了较大的额外空间来保存链表中一半的元素。需要注意的是，如果链表长度是偶数的话，即当快指针的 next 结点不为 null 时，需将慢指针再后移一个结点。

> Source Code: FirstSolution.java

> Runtime: 3 ms.

### Second Try
先通过遍历获得链表的总长度，后获得链表一半的长度，用循环遍历到一半长度位置的结点。后将后半段的链表反转，反转后，依次比较前半部分和后半部分的对应结点是否一致即可，若都一致，则为回文链表。

>Note: 这里用了 O(1) 的空间复杂度和 O(n) 的时间复杂度。反转一半的链表，来依次比较对应的结点。

> Source Code: SecondSolution.java

>Runtime: 1 ms
