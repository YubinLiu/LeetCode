# 21. Merge Two Sorted Lists   
### Description
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

### First Try
No use recursion. While l1 and l2 is not null, compare they value, the smaller one would be added into the list, and then it point to it's next. After the loop, if l1 or l2 is not null, just add them to the list.  
>Note: Create a new ListNode at first named head, and another temperory object refer to head, use the temp to do the operation, but return the (head.next) as result.

> Source Code: FirstSolution.java

> Runtime: 16ms.

### Second Try
Use recursion, the basic idea is like the first try.
>Note: Remember to judge if l1 or l2 is null at first.

> Source Code: SecondSolution.java

>Runtime: 17ms
