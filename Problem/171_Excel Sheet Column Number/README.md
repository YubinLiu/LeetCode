# 171. Excel Sheet Column Number
### Description
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

### Example:
```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
```

### First Try
Related to question 168_Excel Sheet Column Title. Use a variable named "result" to record the result of calculating. A loop to get each charaters named "c", of string. (c - 'A' + 1) calculates the current charater's numerical value, and the result need multiple 26 each times.
>Note: Need plus one, for it's begin from 1.

> Source Code: FirstSolution.java

> Runtime: 2ms.
