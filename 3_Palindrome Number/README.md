# 3. Palindrome Number
### Description
Determine whether an integer is a palindrome. Do this without extra space.

### First Try
A negative number must not be a palindrome. Firstly, convert x to a String, use two pointer, one start from 0, another start from the last index, to judge if they are equal, if not, return false.

>Note: The restriction of using extra space, and the worst situation that i could be s.length() / 2.

> Source Code: FirstSolution.java

> Runtime: 195ms.

### Second Try
Like Exercise 2, we could get the x's reverse integer to judge if it is equals to x.

>Note: To avoid stackoverflow, use long type to save the reverse integer.

> Source Code: SecondSolution.java

> Runtime: 245ms.
