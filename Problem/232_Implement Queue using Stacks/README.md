# 232. Implement Queue using Stacks
### Description
Implement the following operations of a queue using stacks.

* push(x) -- Push element x to the back of queue.
* pop() -- Removes the element from in front of queue.
* peek() -- Get the front element.
* empty() -- Return whether the queue is empty.

*Notes:* <br>
* You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
* Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
* You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

### First Try
本题意在用栈来实现队列，与第 225 题的 Implement Stack using Queues 是正好相反的，但是思路都是类似。首先队列是一个先进先出的数据结构，而栈是一个后进先出的数据结构。我们用两个栈 s1，s2 来实现队列。对于 push 操作，若 s1 不为空，则将 s1 中的所有元素 pop 到 s2 中，再将当前需要 push 的元素放入 s2 中，最后将 s2 中的元素 pop 回 s1 中。那么此时，s1 中的栈顶元素就是最先放入的元素。其余的 pop，peek 操作，只需要取出这个元素即可。而 empty 操作则是判断 s1 是否 isEmpty 即可。

>Note: 在 push 操作的时候将元素的顺序按照加入的先后顺序排列在栈 s1 中（最先加入的元素位于栈顶）。

> Source Code: FirstSolution.java

> Runtime: 102 ms.

### Second Try
在 First Try 中我们是在 push 上做了手脚，让栈按照加入的先后顺序保存了元素（最先加入的元素在栈顶）。那么现在可以对 pop 做手脚，还是用两个栈 s1 和 s2，对于 push 操作，直接将元素 push 到 s1 中即可，而对于 pop 和 peek 操作，需要将 s1 中的元素 pop 到 s2 中，后返回 s2 的栈顶元素即可；当然还需要再将 s2 中的元素 pop 回 s1，以接收下一次 push 进来的值，保持相对顺序。empty 操作只需要保证 s1 是 isEmpty 即可。

>Note: 在 pop 和 peek 操作时，用一个额外的栈将栈顶元素保存为当前最先加入栈的元素，将该元素返回即可。

> Source Code: SecondSolution.java

>Runtime: 98 ms
