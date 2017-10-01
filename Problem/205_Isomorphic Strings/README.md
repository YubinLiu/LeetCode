# 205. Isomorphic Strings
### Description
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

### Example:
```
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
```

### First Try
首先是理解清楚题目的意思，所谓同构字符串，即输入两个字符串 s，t，s 中的每个字符可以由另一个字符代替（可以被其本身代替），但相同的字符要被同一个字符代替，且一个字符不能被多个字符代替，即字符之间有一种一对一的映射关系。一对一的映射，首先就想到了 Map 这个数据结构，所以第一次尝试用 HashMap 来完成。<br>
用 Map 将 s 中的每一个字符，对应 t 中的每一个字符，一一对应，s 中的相同字符要对应同一个字符。<br>
以 s 中的字符作为 key，t 中的字符作为 value，那么，首先判断是否 s 的当前字符已经在 key 中，判断该字符对应的 value 是否与 t 的当前字符相等，不相等即 return false。若 s 的当前字符不在 key 中，那么要先判断 t 的当前字符是否在 value 中，若 t 的当前字符已存在于 value 中，那么就 return false。否则可以将 s 的当前字符和 t 的当前字符作为 key-value 存入 HashMap 中。<br>
例子：
1. s = "aa", t = "ab" <br>
首先，Map 为空，将 a = a 的 key-value 放入 Map 中，接着对于 s 的第二个字符 a 已经在 Map 的 key 中了，对应的 value 为 a，而 t 的第二个字符为 b，所以 return false。
2. s = "ab", t = "aa" <br>
首先，Map 为空，将 a = a 的 key-value 放入 Map 中，接着对于 s 的第二个字符 b 不在 Map 的 key 中，判断 t 的第二个字符 a，发现其已经在 value 中了，所以 return false。

>Note: 一一对应的关系，判断 s 的当前字符以及 t 的当前字符的对应关系。

> Source Code: FirstSolution.java

> Runtime: 26 ms.

### Second Try
无需构造一个 HashMap。要用两个哈希表分别来记录原字符串和目标字符串中字符出现情况，由于 ASCII 码只有 256 个字符，所以可以用一个 256 大小的数组来代替哈希表，并初始化为 0。我们遍历 s，分别从 s 和 t 取出一个字符，然后分别在两个哈希表（sChar，tChar）中查找其值，若不相等，则返回 false，若相等，将其值更新为 i + 1。<br>

>Note: 利用数组相应位置的 Hash 值是否相同来判断（Hash 值设置为当前下标 i + 1。

> Source Code: SecondSolution.java

>Runtime: 10 ms

### Third Try
思路与 Second Try 相同，用两个 char 数组，s 数组的每一个字符对应的位置保存 t 数组相应字符，t 数组的每一个字符对应的位置保存 s 数组相应字符。

>Note: char 数组初始化为 NULL。

> Source Code: ThirdSolution.java

>Runtime: 5 ms
