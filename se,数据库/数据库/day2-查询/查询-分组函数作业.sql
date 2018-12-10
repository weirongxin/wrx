--8.	查询各个管理者手下员工的最低工资，
--其中最低工资不能低于2000，没有管理者的员工不计算在内
select mgr,min(sal)
from emp
where mgr is not null
group by mgr
having min(sal)>=2000;
--9.查询公司的人数，以及在1995-1998年之间，
--每年雇用的人数，结果类似下面的格式(使用组函数：sum、decode)
select count(empno) "total",
sum(decode(to_char(hiredate,'YYYY'),'1981',1,0)) "1981",
sum(decode(to_char(hiredate,'YYYY'),'1995',1,0)) "1995",
sum(decode(to_char(hiredate,'YYYY'),'1996',1,0)) "1996",
sum(decode(to_char(hiredate,'YYYY'),'1997',1,0)) "1997"
from emp;
--sum(decode(to_char(hiredate,'YYYY'),'1981',1,'1995',1,'1996',1,'1997',1,0))