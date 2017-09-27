# 182. Duplicate Emails
### Description
Write a SQL query to find all duplicate emails in a table named **Person**.
```
+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
```

### Example
Your query should return the following for the above table:
```
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
```
*Note: All emails are in lowercase.*

### First Try
用 group by 语句，将相同的 Email 分在一起，再用 having 语句找出数量（count计算每一组的数量）大于 1 的 Email。
```
select Email from Person group by Email having count(Email) > 1;
```

>Note: 用 group by 语句将相同的分到一组。

> Runtime: 1126 ms

### Second Try
将两张 Person 表按照 Email 相等连接，找出有相同的 Email 地址。
```
select distinct p1.Email from Person p1 join Person p2 on p1.Email = p2.Email where p1.Id != p2.Id;
```

>Note: Email 相等，但是 Id 不等。

> Runtime: 1219 ms
