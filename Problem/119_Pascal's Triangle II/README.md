# 119. Pascal's Triangle II
### Description
Given an index k, return the k<sup>th</sup> row of the Pascal's triangle.

### Example:
```
For example, given k = 3,
Return [1,3,3,1].
```

### First Try
Based on exercise 118, Pascal's Triangle. This one inputs an integer k, requires to return the k<sup>th</sup> row of the Pascal Triangle. Construct the triangle with k row(s), and return the last row.
>Note: Don't use Arrays.asList(). It will return java.util.Arrays.ArrayList, it's get() return an integer array(Because we use two-dimensional array). See the internal realization of get(): <br>
```
private final E[] a;
@Override
public E get(int index) {
    return a[index];
}
```

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
Use single-dimensional array, initialize the elements in array with 0. Then, use the same calculate way to get each elements. Here is an example: <br>
Input: 3
```
1 0 0 0
1 1 0 0
1 2 1 0
1 3 3 1
```
>Note: Use Arrays.asList(), but the array must be the Integer[].

> Source Code: SecondSolution.java

>Runtime: 1ms
