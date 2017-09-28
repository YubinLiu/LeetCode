# 183. Customers Who Never Order
### Description
Suppose that a website contains two tables, the **Customers** table and the **Orders** table. Write a SQL query to find all customers who never order anything. <br>
Table: **Customers**.
```
+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
```
Table: **Orders**.
```
+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
```

### Example
Using the above tables as example, return the following:
```
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+
```

### First Try
题目的意思就是要找到 Customers 表中 Id 不在 Orders 表的 CustomerId 中的客户的 Name。
用子查询和 not in 语句。先从 Orders 表中，得到所有的 CustomerId，再从 Customers 表中找到不在上述查询结果中的 Id 对应的 Name 即可。
```
select Name as Customers from Customers where Id not in (select CustomerId from Orders);
```

>Note: 用 not in 语句查询不在某个集合内的结果。

> Runtime: 898 ms
