# 175. Combine Two Tables
### Description
Table: **Person**
```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
```
PersonId is the primary key column for this table.

Table: **Address**
```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
```
AddressId is the primary key column for this table.

Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:
```
FirstName, LastName, City, State
```

### First Try
一开始写的查询语句如下：
```
select Person.FirstName, Person.LastName, Address.City, Address.State from Person, Address where Person.PersonId = Address.PersonId;
```
无法通过测试用例。<br>
原因：如果一个人没有住址信息，那么使用 where 过滤记录后，不会显示姓名信息。 <br>

修改如下，使用左连接：
```
select Person.FirstName, Person.LastName, Address.City, Address.State from Person left join Address on Person.PersonId = Address.PersonId;
```

>Note: 当进行内连接时，系统会自动忽略两个表中对应不起来的数据；左连接，显示关键词 left 左边表中的所有数据，右边表数据数据少了补 NULL 值。

> Runtime: 1141 ms
