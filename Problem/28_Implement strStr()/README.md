# 28. Implement strStr()
### Description
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

### First Try
Use Java indexOf(String str) method of String object.
>Note: Though indexOf() will return -1 is not found, but if add a judgement at first, runtime will be shorter.

> Source Code: FirstSolution.java

> Runtime: 6ms.

### Second Try
No use Java's API. First of all, if needle's length longer than haystack, return -1. Or needle is empty, return 0. Then, get each characters of haystack and needle to compare, when not equal, break the inside loop. Only when index of inside loop reach the last one, return the index of outside loop as the result.

>Note: Compare needle and haystack's characters at first, and then judge if the index of needle points to the last one.

> Source Code: SecondSolution.java

>Runtime: 12ms
