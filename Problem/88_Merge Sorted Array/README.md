# 88. Merge Sorted Array
### Description
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

*Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.*

### First Try
Using another array named temp to save the elements of nums1 from 0...m, compare temp's elements and nums2's elements, put the smaller one to the nums1. If not get the last element of temp or nums2, just put the rest into nums1.
>Note: Need to merge 0...m elements in nums1 and 0...n elements in nums2 to nums1.

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
Compare the (m - 1)th element of nums1 and the (n - 1)th element of nums2 at first, put the bigger one into the (m + n - 1)th of nums1. Compare from the end to the start, and so on(以此类推).
>Note: No need to use an extra array. 

> Source Code: SecondSolution.java

>Runtime: 0ms
