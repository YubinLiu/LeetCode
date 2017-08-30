# 83. Remove Duplicates from Sorted List
### Description
Given a sorted linked list, delete all duplicates such that each element appear only once.

### Example:
```
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
```

### First Try
First of all, assign the input to a new ListNode object named temp, use temp to do the operation. If the element's value is equal to the next element's value(called it m), skip m and points to m's next. If they are not equal, temp will points to the element. Until the temp is null.

>Note: Judge if temp.next is null at first in loop.

> Source Code: FirstSolution.java

> Runtime: 1ms.
