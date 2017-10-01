# 197. Rising Temperature
### Description
Given a **Weather** table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
```
+---------+------------+------------------+
| Id(INT) | Date(DATE) | Temperature(INT) |
+---------+------------+------------------+
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |
+---------+------------+------------------+
```

### Example
Return the following Ids for the above **Weather** table:
```
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
```

### First Try
本题要求找到后一天的 Temperature 大于前一天的 Temperature 的 Id。一开始我以为是顺序排序的，即 Date 较大的 Id 也较大，但其实可能是不按照顺序的。所以应该比较 Date 的大小，且差值只能为 1。如何比较 Date 的大小？<br>
DateDiff(Date d1, Date d2) 函数，若其值为 1，那么表示 d1 比 d2 大一天，后判断 Temperature 的大小即可。
```
select w1.Id from Weather w1, Weather w2 where DateDiff(w1.Date, w2.Date) = 1 and w1.Temperature > w2.Temperature;
```

>Note: 连接两张 Weather 表。

> Runtime: 1562 ms

### Second Try
思路同上，可用 to_days(Date d) 函数，将传入的 Date 参数转换成 days 进行比较。
```
select w1.Id from Weather w1, Weather w2 where to_days(w1.date) = to_days(w2.date) + 1 and w1.Temperature > w2.Temperature;
```

>Note: to_days(Date d) 函数可将 Date 转换为 days 进行比较。

> Runtime: 1461 ms
