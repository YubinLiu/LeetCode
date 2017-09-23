# 189. Rotate Array
### Description
Rotate an array of n elements to the right by k steps.

### Example:
```
With n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
```
*Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.*

### First Try
（莫名跳过了几题关于编写 SQL 语句的题，在之后补上。）<br>
首先，读懂题目。本题意在将数组（记作 nums）的所有元素向右移动 k 步。第一次尝试，想到的是用一个额外的数组（记作 temp），来保存移位后的结果，再将该数组的元素一一赋值给原数组，完成旋转操作。用一个 for 循环，i 从 0 到 nums.length - 1，让 temp[(i + k) % nums.length] = nums[i]，这样就相当于把 nums 中的元素移位后的结果，一一放入了 temp 中对应位置。
>Note: 要先计算 k %= nums.length，因为 k 有可能大于数组的长度。

> Source Code: FirstSolution.java

> Runtime: 1ms.

### Second Try
逻辑跟 First Try 相同，但是用的是 Java 标准类库中提供的static方法 System.arrayCopy()，用它来赋值数组比用 for 循环快得多。<br>
参数说明：源数组，表示从源数组的什么位置开始复制的偏移量，目标数组，表示从目标数组的什么位置开始复制的偏移量，需要复制的元素个数。
>Note: System.arrayCopy() 对所有类型做了重载，对于基本类型和对象数组均可复制。对于对象数组，只是赋值了对象的引用而非对象本身的拷贝（浅复制）。

> Source Code: SecondSolution.java

>Runtime: 0ms

### Third Try
反转数组。<br>
例：array = [1, 2, 3, 4, 5, 6, 7]，step = 3。 <br>
* 第一次，将整个数组反转，变为 [7, 6, 5, 4, 3, 2, 1]；
* 第二次，将 0 ... k - 1 的元素反转，变为 [5, 6, 7, 4, 3, 2, 1]；
* 第三次，将 k ... nums.length - 1 的元素反转，变为 [5, 6, 7, 1, 2, 3, 4]。
按上述步骤进行三次反转后，都可以得到最终的结果。

>Note: 首先仍应将 k %= nums.length，以防 k 大于数组的长度。

> Source Code: ThirdSolution.java

> Runtime: 1ms.
