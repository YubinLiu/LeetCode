# 155. Min Stack
### Description
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

* push(x) -- Push element x onto stack.
* pop() -- Removes the element on top of the stack.
* top() -- Get the top element.
* getMin() -- Retrieve the minimum element in the stack.

### Example:
```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
```

### First Try
Use one Stack and one TreeMap. Stack is used to call the method in api, like stack.push(), stack.pop(), stack.peek(), etc. TreeMap is to record each elements and sort them, when you call getMin(), return the map's first key.
>Note: Record the elements and the number of each elements with map, and remove the element if it's emergence times is not bigger than 0.

> Source Code: FirstSolution.java

> Runtime: 112ms.

### Second Try
Use one stack, and an integer(called min) to record the minimum number.
* push(): Push the min to stack if it's smaller than than the input element(called x), assign min as x, and push x to the stack. We use one stack to keep the elements, and the minimum number of current stack.
* pop(): pop twice if stack.pop() equals to min, else pop once.
* top(): call the stack.peek().
* getMin(): return min.  
>Note: pop twice if stack.pop() equals to min, and assign the value to the min, because the second pop() will return the minimum of the rest.

> Source Code: SecondMinStack.java

>Runtime: 102ms
