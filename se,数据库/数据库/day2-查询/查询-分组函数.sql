--分组函数 AVG MAX MIN COUNT SUM
--操作步骤：1.先从表中获取筛选条件的一组数据
--         2.对该组数据取相应 组函数值
select AVG(sal),MAX(sal),MIN(sal),COUNT(sal),SUM(sal)
from emp;
--1.查询员工表中部门20的人数
select count(*)
from emp
where deptno=20 or deptno=30;
--2.计数组函数   如果数据为null则不用于计数
--  平均值组函数 （将为null的数据 不加入计算）
select count(comm)
from emp;
--查询有奖金的人的平均值
select avg(comm)
from emp;
--查询部门所有人的奖金平均值
select avg(nvl(comm,0))
from emp;
--3.组函数中使用distinct
select count(distinct deptno)
from emp;
select count(distinct job)
from emp;
--4.group by子句
--查询每个部门中的最高工资
select deptno,max(sal)
from emp
group by deptno;
--5.以多列作为分组条件
--!!!以分组条件查询时，select后字段只能为 分组条件或者组函数
select max(sal),deptno,job
from emp
group by deptno,job;
--6.过滤分组查询
--having子句
--查询最高工资大于4000的部门
select deptno,max(sal)
from emp
group by deptno
having max(sal)>4000;


