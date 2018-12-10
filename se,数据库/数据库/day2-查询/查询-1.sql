--1.从emp表中查询所有内容（不建议使用）
select * from emp;
--2.从员工表中查询所有员工的员工号、名字
--通过列名查询表中的指定列
select empno,ename
from emp;
--3.双引号的用法(需要指定字符的大小写时添加双引号)
select empno
from "emp";
--4.查看用户中包含的表信息
select table_name
from user_tables;
--5.查询语句中的算数运算符
--查询所有员工的年薪
select sal*13
from emp;
--6.虚表的使用dual（占位符）
select 3+5,'hello'
from dual;
--7.查询员工表中所有员工的姓名、工资、涨300的工资
select ename,sal,sal+300
from emp;
--8.查询员工的季度工资（员工号、姓名、单月工资、季度工资）
select Empno,Ename,Sal,Sal*3
from emp;
--9.以奖金字段的数据运算（可能存在空值）
--null值参与运算 结果为null
select ename,comm,comm+1000 "奖金翻倍"
from emp;
--10.别名  给字段名起别名（字段 别名，字段 as 别名）
select ename Name,sal "月薪"
from emp;
--11.连接符 || 字段连接符
select comm||ename||sal "收入"
from emp;
--12.去除重复值(将distinct 放在需要去除重复值的字段前)
select distinct deptno,ename
from emp;
--13.查询过滤
select ename,deptno
from emp
where deptno=30;
--查询工资大于1500的员工
select ename,sal
from emp
where sal>1500;
--14.查询部门30以外的所有员工
-- 比较符号：不等于<>
select ename,deptno
from emp
where deptno<>30;
--15.日期类型
select hiredate
from emp;
--16.null筛选(null不能直接用于比较，判断时使用is、is not)
select comm
from emp
where comm is not null;
--17 between  and
select ename,sal
from emp
where sal between 1500 and 3000;
--18 in  查询在部门10、20的员工
select ename,deptno
from emp
where deptno in(10,20);
--19.模糊查询 like  % 零个或多个任意字符  _ 一个字符
select ename
from emp
where ename like 'S%';
--20.查询部门号是30并且名字以W开头
select ename,deptno
from emp
where deptno=30 and ename like 'W%';

select ename,deptno
from emp
where deptno=20 or ename like 'W%';

select ename,deptno
from emp
where not deptno=20;
--21.排序 (需要排序的字段后添加 desc降序  默认是asc升序)
select ename,sal,deptno
from emp
order by deptno desc,sal desc;