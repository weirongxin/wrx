--1.��emp���в���empno,ename,sal���ݣ�111,'1',1000)(222,'2',2000)
insert into emp(empno,ename,sal) values(111,'1',1000);
insert into emp(empno,ename,sal) values(222,'2',2000);
--2.��empno=111��Ա��comm�ĳ�100
update emp set comm=100 where empno=111;
--3.��mydept���в���dept����deptno=10������
insert into mydept 
select * from dept where deptno=10;
--4.ɾ��empno=111������
delete from emp where empno=111;
--5.Ϊ�������ǹ��ʣ���׼�ǣ�10���ų�10%��20���ų�15%��30���ų�20%�������ų�18%��Ҫ����DECODE������decode
update emp set sal=decode(deptno,10,sal*1.1,20,sal*1.15,30,sal*1.2,sal*1.18);
--6.���ݹ������޳����ʣ���׼�ǣ�Ϊ��˾�����˼����¾ͳ������ٷֵ㡣
update emp set sal=sal*((trunc(months_between(sysdate,hiredate))/100)+1);

create table mydept(name varchar2(20),id number);
alter table mydept
drop column id;
select * from mydept;