--昨日内容：
/*
 1.DDL DML DQL TCL  DCL
 2.select * from 表名;
 3.select 字段名,...from 表名;
 4.dual select 3+2 from dual;
 5."" 严格区分当前数据的大小写
 6.运算符 + - * /  > < >= <= <> =
 7.null 参与运算结果为null is null  is not null
 8.where 筛选条件 between and，in，like(% _)
 9.order by 默认升序 asc  降序：desc
 10.筛选条件的关系   and   or   not
 11.||
*/
--1、选择部门30中的雇员
select ename from emp where deptno = 30;
--2、列出所有办事员的姓名、编号和部门
select ename,empno,deptno from emp where job='CLERK';
--3、找出佣金COMM高于薪金SAL的雇员
select ename from emp where comm>sal;
--4、找出佣金COMM高于薪金SAL 60%的雇员
select ename,comm,sal from emp where comm>sal*0.6;
--5、找出收取佣金COMM 的雇员的不同工作
select distinct job from emp where comm is not null;
--6、显示不带有'R'的雇员姓名
select ename from emp where ename not like '%R%';
--7、显示雇员的详细资料，按姓名排序
select * from emp order by ename;
--8.显示雇员姓名，根据其服务年限，将最老的雇员排在最前面
select ename,hiredate from emp order by hiredate asc;
--9、显示所有雇员的姓名、工作和薪金，按工作的降序顺序排序，而工作相同时按薪金升序
select ename,job,sal from emp order by job desc,sal asc;
--10、显示在一个月为30天的情况下所有雇员的日薪金
select sal/30 as dayPay from emp;
--11、显示姓名字段的任何位置，包含 "A" 的所有雇员的姓名
select ename from emp where ename like '%A%';


