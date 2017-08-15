# 2. Reverse Integer
### Description
Reverse digits of an integer.

### Example:
```
Example1: x = 123, return 321
Example2: x = -123, return -321
```

>Note: The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

### First Try
To reverse an integer, we need get each digits of it. So, I try to convert it to a String, use char array and a loop to reverse it. Not a good method.
>Note: Must catch NumberFormatException, when input an integer which reverse integer bigger than max value or smaller than min value, should return 0.

> Source Code: FirstSolution.java

> Runtime: 42ms.

### Second Try
Using a while loop, get each digit, don't need to convert it to String.
> Note: Java has handle int32 stackoverflow for us, we just need to judge if (newResult - digit) / 10 equals result, if not, means it overflows and return 0. (Integer.MAX_VALUE + 1 == Integer.MIN_VALUE;)

> Source Code: SecondSolution.java

>Runtime: 44ms
