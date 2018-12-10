--1.往emp表中插入empno,ename,sal数据（111,'1',1000)(222,'2',2000)
insert into emp(empno,ename,sal) values(111,'1',1000);
insert into emp(empno,ename,sal) values(222,'2',2000);
--2.把empno=111的员工comm改成100
update emp set comm=100 where empno=111;
--3.往mydept表中插入dept表中deptno=10的数据
insert into mydept 
select * from dept where deptno=10;
--4.删除empno=111的数据
delete from emp where empno=111;
--5.为所有人涨工资，标准是：10部门长10%；20部门长15%；30部门长20%其他部门长18%（要求用DECODE函数）decode
update emp set sal=decode(deptno,10,sal*1.1,20,sal*1.15,30,sal*1.2,sal*1.18);
--6.根据工作年限长工资，标准是：为公司工作了几个月就长几个百分点。
update emp set sal=sal*((trunc(months_between(sysdate,hiredate))/100)+1);

create table mydept(name varchar2(20),id number);
alter table mydept
drop column id;
select * from mydept;