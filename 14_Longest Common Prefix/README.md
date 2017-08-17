# 14. Longest Common Prefix
### Description
Write a function to find the longest common prefix string amongst an array of strings.

### First Try
Judge if the String array is null or empty at first. Use double nested loop, the outside loop is to get each characters of the first string in array; the inside loop is to get the rest of strings, get their each characters and compare to the first string's characters.
>Note: Should pay attention to the situation when some strings's length shorter than the first string.

> Source Code: FirstSolution.java

> Runtime: 13ms.
