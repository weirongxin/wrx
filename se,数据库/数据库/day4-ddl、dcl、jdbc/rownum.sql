
--rownum 伪列  （从表中查询的数据的行号）

--查询每条记录的行号
--select rownum from employees;

--查询第一个员工的名字
select  rownum,last_name from employees where rownum=1;

--查询前四个员工的名字、工资
select last_name,salary from (select rownum n,last_name,salary from employees) where n<4;  






