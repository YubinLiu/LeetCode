# 176. Second Highest Salary
### Description
Write a SQL query to get the second highest salary from the **Employee** table.
```
+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
```

### Example
Given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.
```
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
```

### First Try
查找工资表中第二高的工资。首先想到的是，将工资表中的最高工资找出来，后再查找除了最高工资以外的，剩下的工资中的最高工资，那么结果就是第二高的工资了。
```
select max(Salary) as SecondHighestSalary from Employee where Salary not in (select max(Salary) from Employee);
```

>Note: 要将查找出来的结果起名为“SecondHighestSalary”

> Runtime: 1119 ms

### Second Try
用 limit 和 offset 从句，limit 表示返回的结果数量，offset 表示从何处开始查询（偏移量）。即从 Employee 表中，按照 Salary 从高到低（order by desc）进行排序后，选择第二个元素。
```
select (select distinct Salary from Employee order by Salary desc limit 1 offset 1) as SecondHighestSalary;
```

>Note: 要根据 Salary 对 Employee 表进行排序。

> Runtime: 1068 ms

### Third Try
用 MySQL 中的 IFNULL 函数，如果无工资第二高的话，则输出 NULL。
```
select IFNULL((select distinct Salary from Employee order by Salary DESC limit 1 offset 1), NULL) as SecondHighestSalary;
```

>Note: 指明如果查询结果为空的话，输出 NULL。

> Runtime: 1117 ms
