--分页查询
--需求：按照用户需要查询的数据页数进行 数据查询
--条件：查询筛选条件(部门号、范围、关键字)
--      页数(第几页数据，转换为 数据行数范围)
--“查询emp表中 第1页员工的名字”（每页数据5条）
--rownum 伪列做为筛选条件时，可以从1开始范围性筛选
--                         如果直接使用 不从1开始则不能直接筛选
select ename from emp where rownum>=1 and rownum<=5;
--select ename from emp where rownum>=6 and rownum<=10;
--查询第二页数据（范围被行号筛选出6-10行数据）
select ename
from (select ename,rownum r from emp)
where r>=6 and r<=10;
--查询第三页数据（范围被行号筛选出11-15行数据）
select ename
from (select ename,rownum r from emp)
where r>=11 and r<=15;
--查询员工的名字、工种、工资数据，显示第二页（每页10条）
select ename,job,sal
from (select ename,job,sal,rownum r from emp)
where r>=11 and r<=20;
