# 242. Valid Anagram
### Description
Given two strings s and t, write a function to determine if t is an anagram of s.

### Example:
```
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.
```
*Note:
You may assume the string contains only lowercase alphabets.*

### First Try
题目的意思就是，给定两个字符串 s 和 t，判断是否可用 s 中的所有字符构成 t。所以，第一想法是，如果 t 是 s 的字符的乱序排列构成的字符串，那么 s 和 t 的字符都是相同的，只是顺序不同，所以将 s 和 t 的所有字符进行排序后，对排序后的字符数组进行比较，若相等，返回 true，否则返回 false。
>Note: 用 toCharArray() 将字符串转换为 char[]，后利用 Arrays.sort() 将数组内容排序，最后通过 Arrays.equals() 方法比较两个字符数组的元素是否都相等。

> Source Code: FirstSolution.java

> Runtime: 8 ms.

### Second Try
用数组来构建一个 Hash 表。声明一个大小为 26 的 int 数组 counters，将所有元素初始化为 0。那么，对于 s 中的每个字符 cs，将数组中的第 (cs - 'a') 位置的元素数值加 1，而对于 t 中的每个字符 ct，将数组中的第 (ct - 'a') 位置的元素数值减 1，这样，如果 s 和 t 的字符组成相同的话，那么最后 counters 数组中的所有元素的数值依然都是 0，否则，只要有一个为非 0 的元素，那么就代表 s 和 t 不是完全由相同的字符构成的。

>Note: 利用了 Hash 表，将每个字符的对应于数组中，根据两个字符串中字符的出现情况进行 +1，-1 操作，最后遍历数组是否元素均为 0。

> Source Code: SecondSolution.java

>Runtime: 2 ms
