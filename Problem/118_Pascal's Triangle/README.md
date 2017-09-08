# 118. Pascal's Triangle
### Description
Given numRows, generate the first numRows of Pascal's triangle.

### Example:
Given numRows = 5,
Return
```
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

### First Try
找规律。<br>
第一行是 1；<br>
第二行是 1 1。<br>
第三行开始，两边依旧是 1 1，中间的 2 是第二行的 1 1 之和；<br>
第四行，前后依旧是 1，第二个数 3 为第二行的第 1 个数 1 加上中间的 2，第三个数 3 为第二行的第二个数 2 最后的 1。<br>
每一行元素个数与该行行数相同（第一行 1 个元素，第二行 2 个元素...）。<br>
依次类推，如下：
```
         1
        1 1
     1 2(1+1) 1
   1 3(1+2) 3(2+1) 1
1 4(1+3) 6(3+3) 4(3+1) 1
```
根据上述语义，第一次尝试写出如下代码，有些丑陋，但语义与上述描述相同。首先，添加前两行的数据到list中（如果 numRows 不小于 1，添加第一行，如果 numRows 不小于 2，添加第二行）。接着添加之后的数据，按上述规律即可（要在前后添 1）。
>Note: 找出规律，按着规律写出代码。语义基本清楚，但质量不够，需优化。

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
相同的思想，简化了代码。不需要额外去为第一行第二行添加数据，用双重循环，内循环判断当生成当前行第一个或最后一个元素时，添加数据 1，其余情况添加上一行相应元素的和。
>Note: 还有一个规律第一次尝试时忽略了，导致代码比较复杂。例如，现在是第四行，第一个元素是 1；第二个元素是上一行第一个元素加第二个元素；第三个元素是上一行第二个元素加第三个元素...依次类推。（即相加的元素是，上一行中对应位置的元素和该元素左边一个元素）。

> Source Code: SecondSolution.java

>Runtime: 1ms

### Third Try
使用数组，逻辑同上，最后将其转为list，效率杠杠的。
>Note: 返回值是List，通过 Arrays.asList() 将数组转为List。

> Source Code: ThirdSolution.java

>Runtime: 0ms
