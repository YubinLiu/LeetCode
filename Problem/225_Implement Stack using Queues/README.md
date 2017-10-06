# 225. Implement Stack using Queues
### Description
Implement the following operations of a stack using queues.

* push(x) -- Push element x onto stack.
* pop() -- Removes the element on top of the stack.
* top() -- Get the top element.
* empty() -- Return whether the stack is empty.

*Notes:* <br>
* You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
* Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
* You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

### First Try
使用两个队列 q1，q2，实现一个栈。栈是一个后进先出的数据结构，而队列是一个先进先出的数据结构，所以 push 时，将新元素添加到 q1 的末尾。pop 时，把 q1 中除最后一个元素外的元素逐个添加到 q2 中，然后 pop 掉 q1 中的最后一个元素（记录这个值，因为要返回这个值），接着就交换 q1 和 q2。添加元素始终向 q1 中添加。top() 类似于 pop()，不过其只返回值不删除值。

>Note: 两个队列实现一个栈，其中一个栈用来保存所 push 的所有值，另一个栈在 pop 和 top 操作的时候，保存除需返回元素以外的值。

> Source Code: FirstMyStack.java

> Runtime: 104 ms.

### Second Try
使用两个队列 q1，q2，实现一个栈。这次是将所有的元素倒序的保存在 q1 中。每次 push 时，将新的元素放在 q2，后将 q1 的元素逐个添加到 q2 队尾，交换 q1 和 q2 即可。如此一来，q1 队首的元素就是最后添加的元素，pop 和 top 操作直接返回 q1 队首元素即可。

>Note: 在 push 时做手脚，让队列中保存的是一个倒序的输入数字。

> Source Code: SecondMyStack.java

>Runtime: 108 ms

### Third Try
使用一个队列 q 实现一个栈。push 时直接将元素添加到队尾即可。pop 和 top 时，把队列中除最后一个元素外的元素，逐个循环添加到队列的尾部。

>Note: 一个队列实现一个栈，在 pop 和 top 操作时需先将其余元素循环取出后添加到队尾。

> Source Code: ThirdMyStack.java

>Runtime: 88 ms
