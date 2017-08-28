# 67. Add Binary
### Description
Given two binary strings, return their sum (also a binary string).

### Example:
```
a = "11"
b = "1"
Return "100".
```

### First Try
Add Binary, like every addtion, calculate from the last element. Using a variable to save the carry-bit(进位), and a stringbuilder to append each digit's result. If the digit's result bigger than 1, assign 1 to the carry-bit. If one of the inputs is longer, calculate the rest digits of it. Don't forget if the first bit's need carry, stringbuilder needs to append 1.

>Note: What we return should be the reverse of the string constructed by stringbuilder.

> Source Code: FirstSolution.java

> Runtime: 4ms.
