# 13. Roman to Integer
### Description
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

### First Try
Not easy to me, because I don't know the account form of Roman at first.

Here's some tips may help:
```
a. Correspondence: I -> 1, X -> 10, C -> 100, M -> 1000, V -> 5, L -> 50, D -> 500;
b. If a number in right of bigger one, represent the sum of them, such as: VIIII = 8; XII = 12;
c. If a number in left of bigger one, represent the bigger one minus the smaller one, such as: IV = 4, IX = 9.
```
Using a map to save the correspondence of single roman to integer. Get each characters of String to find each integer and calculate the final result.

>Note: Pay attention to the situation, when a number left of bigger one. I minus two times of the smaller one, and add all of number, so I can get the right result.

> Source Code: FirstSolution.java

> Runtime: 106ms.

### Second Try
Using switch-case, turn each characters in String to integer, save them in an array, compare the one and the latter, to choose the calculate ways.
>Note: To avoid ArrayIndexOfBoundsException, the maximum of i is s.length - 2; but we should add the final one at last. 

> Source Code: SecondSolution.java

>Runtime: 135ms
