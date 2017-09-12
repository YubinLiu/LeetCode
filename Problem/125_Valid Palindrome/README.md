# 125. Valid Palindrome
### Description
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

### Example:
```
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
```
*Note: <br>
Have you consider that the string might be empty? This is a good question to ask during an interview. <br>
For the purpose of this problem, we define empty string as valid palindrome.*

### First Try
Very bad try. Judge if a string is a valid palindrome, two index, one points to 0, the other points to the last element(called it n). Judge if they are number or letter at first, and then, compare if they are equal(ignore the case). I used a regular expression to judge if the character is number or letter, and use String's equalsIgnoreCase() to compare.
>Note: Every I try to match the regular expression, it will construct a string, and I need to convert char to string, to use the String's method. Too smelly code, Not efficient.

> Source Code: FirstSolution.java

> Runtime: 105ms.

### Second Try
Imporve the code. Use while loop istead of for, use ascii to judge if the character is number or letter, use Character.toLowerCase() convert each character to the lower case(just works on capital letters).
>Note: If you can let the condition be single, use while loop.

> Source Code: SecondSolution.java

>Runtime: 6ms

### Third Try
No use Character's method, use their ascii to judge if they are the same character(ignore case).

>Note: Judge if the character is 'a'-'z' at first, becasse their ascii is bigger( 97 ~ 122 ), but 'A' - 'Z' is 65 ~ 90. 

> Source Code: ThirdSolution.java

>Runtime: 5ms
