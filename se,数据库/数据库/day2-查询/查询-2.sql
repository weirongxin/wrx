--�������ݣ�
/*
 1.DDL DML DQL TCL  DCL
 2.select * from ����;
 3.select �ֶ���,...from ����;
 4.dual select 3+2 from dual;
 5."" �ϸ����ֵ�ǰ���ݵĴ�Сд
 6.����� + - * /  > < >= <= <> =
 7.null ����������Ϊnull is null  is not null
 8.where ɸѡ���� between and��in��like(% _)
 9.order by Ĭ������ asc  ����desc
 10.ɸѡ�����Ĺ�ϵ   and   or   not
 11.||
*/
--1��ѡ����30�еĹ�Ա
select ename from emp where deptno = 30;
--2���г����а���Ա����������źͲ���
select ename,empno,deptno from emp where job='CLERK';
--3���ҳ�Ӷ��COMM����н��SAL�Ĺ�Ա
select ename from emp where comm>sal;
--4���ҳ�Ӷ��COMM����н��SAL 60%�Ĺ�Ա
select ename,comm,sal from emp where comm>sal*0.6;
--5���ҳ���ȡӶ��COMM �Ĺ�Ա�Ĳ�ͬ����
select distinct job from emp where comm is not null;
--6����ʾ������'R'�Ĺ�Ա����
select ename from emp where ename not like '%R%';
--7����ʾ��Ա����ϸ���ϣ�����������
select * from emp order by ename;
--8.��ʾ��Ա������������������ޣ������ϵĹ�Ա������ǰ��
select ename,hiredate from emp order by hiredate asc;
--9����ʾ���й�Ա��������������н�𣬰������Ľ���˳�����򣬶�������ͬʱ��н������
select ename,job,sal from emp order by job desc,sal asc;
--10����ʾ��һ����Ϊ30�����������й�Ա����н��
select sal/30 as dayPay from emp;
--11����ʾ�����ֶε��κ�λ�ã����� "A" �����й�Ա������
select ename from emp where ename like '%A%';


