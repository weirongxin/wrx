--1、找出部门10中所有经理和部门20中的所有办事员的详细资料
select *
from emp
where deptno=10 and job='MANAGER' OR deptno=20 and job='CLERK';
--2、找出部门10中所有经理、部门20中所有办事员，
--既不是经理又不是办事员但其薪金>=2000的所有雇员的详细资料
select * 
from emp
where (deptno=10 and job='MANAGER')or(deptno=20 and job='CLERK')
      or(job not in('MANAGER','CLERK') and sal>=2000);

--3、找出不收取佣金或收取的佣金低于100的雇员 (nvl函数)
select ename from emp
where nvl(comm,0)<100;
--4、找出各月最后一天受雇的所有雇员
select * from emp
where hiredate=last_day(hiredate);
--5、找出早于25年之前受雇的雇员
select * from emp
where months_between(sysdate,hiredate)>25*12;
--6、显示只有首字母大写的所有雇员的姓名
select ename
from emp
where initcap(ename)=ename;
--7、显示正好为6个字符的雇员姓名
select ename
from emp
where length(ename)=6;
--8、显示不带有'R'的雇员姓名(INSTR 函数)
select ename
from emp
where instr(ename,'R')=0;
--9、显示所有雇员的姓名的前三个字符
select substr(ename,1,3)
from emp;
--10、显示所有雇员的姓名，用a替换所有'A'
select replace(ename,'A','a')
from emp;
--11、显示所有雇员的姓名以及满10年服务年限的日期
select ename,add_months(hiredate,10*12)
from emp;
--服务满10年的雇员的姓名、日期
select ename
from emp
where add_months(hiredate,10*12)<sysdate;
--12、显示所有雇员的姓名和加入公司的年份和月份，
--按雇员受雇日所在月排序，将最早年份的项目排在最前面
select ename,to_char(hiredate,'YYYY'),to_char(hiredate,'MM')
from emp
order by to_char(hiredate,'YYYY'),to_char(hiredate,'MM');
--13、找出在（任何年份的）2月受聘的所有雇员
select *
from emp
where to_char(hiredate,'MM')='02';
--14、对于每个雇员，显示其加入公司的天数
select round(sysdate-hiredate),ename
from emp;
--15、显示姓名字段的任何位置，包含 "A" 的所有雇员的姓名(INSTR函数)
select ename
from emp
where instr(ename,'A')<>0;
--16、以年、月和日显示所有雇员的服务年限
select months_between(sysdate,hiredate)/12,
        months_between(sysdate,hiredate),
        sysdate-hiredate
from emp;