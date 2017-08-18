# 14. Longest Common Prefix
### Description
Write a function to find the longest common prefix string amongst an array of strings.

### First Try
Judge if the String array is null or empty at first. Use double nested loop, the outside loop is to get each characters of the first string in array; the inside loop is to get the rest of strings, get their each characters and compare to the first string's characters.
>Note: Should pay attention to the situation when some strings' length shorter than the first string.

> Source Code: FirstSolution.java

> Runtime: 13ms.

### Second Try
Also judge if the String array is null or empty at first. Then, use a variable to save strs[0]. Use loop to get each strings in array, and judge if them start with result, if not, result remove it's last character.
>Note: No need to get each characters of string, but to judge if they start with the same string.

> Source Code: SecondSolution.java

> Runtime: 11ms.

### Third Try
Find the longest common prefix of strs[0] and strs[1], judge if the rest of strings start with it, if not, remove the last character of it, until the prefix is empty or reach the last string in array.
>Note: Remember to judge the length of string array, to avoid the IndexOutOfBoundException. The code is longer, but also easy to understand.

> Source Code: ThirdSolution.java

> Runtime: 10ms.
