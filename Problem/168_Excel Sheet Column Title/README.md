# 168. Excel Sheet Column Title
### Description
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

### Example:
```
1 -> A
2 -> B
3 -> C
...
26 -> Z
27 -> AA
28 -> AB
```

### First Try
Use StringBuilder to append the character created. While n is bigger than 0, get a character. (--n % 26) is to calculate the character's relative position to 'A', and convert ('A' + (--n % 26)) to char, you can get the character from the lower bit. Remember to reverse the string.

>Note: This is simple conversion from base 10 to base 26. However, the new base (base 26) is one based, so our alphabet [1,26] which maps to A~Z. Using the mod operator gives numbers in range [0, 25]. That's why he used (n-1) so he's converting n from 1 based to 0 based.

> Source Code: FirstSolution.java

> Runtime: 0ms.

### Second Try
Use recursion. Logic is the same, but compress the code to one line.

>Note: One line code use recursion.

> Source Code: SecondSolution.java

>Runtime: 0ms
