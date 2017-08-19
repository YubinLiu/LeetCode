# 20. Valid Parentheses
### Description
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

### First Try
If the characters are left parentheses, push it to stack, if not, pop a character from stack and compare if they are match, like '(' matches ')', '[' matches ']', '{' matches '}'.
>Note: Add some judgement at first.
1. if the string's length is an odd number, return false;
2. if the number of left parentheses not equals to right parentheses, return false;
3. if the character is left parentheses, push it to the stack, if not, pop one character from stack and compare. But notice if the stack is empty, when input like ")(".

> Source Code: FirstSolution.java

> Runtime: 9ms.
