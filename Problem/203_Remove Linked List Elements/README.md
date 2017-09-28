# 203. Remove Linked List Elements
### Description
Remove all elements from a linked list of integers that have value val.

### Example:
```
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
```

### First Try
要删除链表中值为 val 的元素，即逐个检查链表中的每个元素的值是否等于 val 即可，如果等于 val，让该元素前一个元素的 next 指针指向该元素的 next 指针指向的元素即可。
>Note: 要对头结点进行单独的判断，判断其值是否等于 val。

> Source Code: FirstSolution.java

> Runtime: 1 ms.

### Second Try
基本逻辑同上，用递归的写法，简化代码。

>Note: 这道题来说我个人认为用普通的方法的了逻辑已经比较清楚了，递归主要是缩短了代码行数。

> Source Code: SecondSolution.java

>Runtime: 3 ms

### Third Try
不单独考虑头结点。新生成一个辅助的头结点，记作 helperHead，令 helperHead.next = head，这样一来就不用再单独对头结点进行判断了，最后只需要返回 helperHead.next 即可。

>Note: 增加一个辅助的头结点，使其 next 指针指向输入的 head，这样一来，指针后移的时候，是从 head 开始判断，就不需要再单独对 head 结点进行判断了。

> Source Code: ThirdSolution.java

>Runtime: 2 ms
