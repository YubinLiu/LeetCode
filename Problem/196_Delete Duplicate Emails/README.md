# 196. Delete Duplicate Emails
### Description
Write a SQL query to delete all duplicate email entries in a table named **Person**, keeping only unique emails based on its *smallest* **Id**.
```
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
Id is the primary key column for this table.
```

### Example
After running your query, the above **Person** table should have the following rows:
```
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+
```
*Note: All emails are in lowercase.*

### First Try
用 group by 语句将相同 Email 的用户聚集起来，然后将聚集起来的组中不是最小 Id 的用户删除（用 delete 语句删除）。
```
delete from Person where Id not in (select rest.Id from (select min(Id) as Id from Person group by Email) rest);
```

>Note: Email 相同，删除 Id 大的那个。

> Runtime: 796 ms

### Second Try
将两张 Person 表连接，判断两个表的用户的 Email 是否相同，若相同，删除 Id 较大的那个用户。
```
delete p1 from Person p1, Person p2 where p1.Email = p2.Email and p1.Id > p2.Id;
```

>Note: 语句、逻辑较简单，不过效率低（要连接两张 Person 表）。

> Runtime: 1175 ms
