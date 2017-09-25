# 191. Number of 1 Bits
### Description
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

### Example:
```
The 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
```

### First Try
Convert the input(32-bit integer) to a binary string, and get each characters of string, judge if it is equal to '1'.
>Note: Use Java API, Integer.toBinaryString(int n) convert the input to a binary string.

> Source Code: FirstSolution.java

> Runtime: 4ms.

### Second Try
Use &(and) binary operation. The input(called "n"), is a 32-bit integer, so use a "for" loop 32 times, calculate if (n & 1) equals to 1, and n right shifts 1( n 右移 1 位 ) each times.

>Note: Need right shifts n 1 each times to make sure that you can get each bits from lowest to highest.

> Source Code: SecondSolution.java

>Runtime: 2ms

### Third Try
Compress the code. Use a variable(called "result") to record how many 1 bits in the input(called "n"). Use a "for" loop 32 times(a variable named "i" to record the times, i from 0 to 31). Each times, n right shifts i( n 右移 i 位 ), and use &(and) binary operation to get each bits.
result += ((n >>> i) & 1). <br>

>Note: n right shift i bit(s) each times, no need to right shifts 1 bit each times.

> Source Code: ThirdSolution.java

>Runtime: 2ms
