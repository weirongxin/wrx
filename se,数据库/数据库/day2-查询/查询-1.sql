--1.��emp���в�ѯ�������ݣ�������ʹ�ã�
select * from emp;
--2.��Ա�����в�ѯ����Ա����Ա���š�����
--ͨ��������ѯ���е�ָ����
select empno,ename
from emp;
--3.˫���ŵ��÷�(��Ҫָ���ַ��Ĵ�Сдʱ���˫����)
select empno
from "emp";
--4.�鿴�û��а����ı���Ϣ
select table_name
from user_tables;
--5.��ѯ����е����������
--��ѯ����Ա������н
select sal*13
from emp;
--6.����ʹ��dual��ռλ����
select 3+5,'hello'
from dual;
--7.��ѯԱ����������Ա�������������ʡ���300�Ĺ���
select ename,sal,sal+300
from emp;
--8.��ѯԱ���ļ��ȹ��ʣ�Ա���š����������¹��ʡ����ȹ��ʣ�
select Empno,Ename,Sal,Sal*3
from emp;
--9.�Խ����ֶε��������㣨���ܴ��ڿ�ֵ��
--nullֵ�������� ���Ϊnull
select ename,comm,comm+1000 "���𷭱�"
from emp;
--10.����  ���ֶ�����������ֶ� �������ֶ� as ������
select ename Name,sal "��н"
from emp;
--11.���ӷ� || �ֶ����ӷ�
select comm||ename||sal "����"
from emp;
--12.ȥ���ظ�ֵ(��distinct ������Ҫȥ���ظ�ֵ���ֶ�ǰ)
select distinct deptno,ename
from emp;
--13.��ѯ����
select ename,deptno
from emp
where deptno=30;
--��ѯ���ʴ���1500��Ա��
select ename,sal
from emp
where sal>1500;
--14.��ѯ����30���������Ա��
-- �ȽϷ��ţ�������<>
select ename,deptno
from emp
where deptno<>30;
--15.��������
select hiredate
from emp;
--16.nullɸѡ(null����ֱ�����ڱȽϣ��ж�ʱʹ��is��is not)
select comm
from emp
where comm is not null;
--17 between  and
select ename,sal
from emp
where sal between 1500 and 3000;
--18 in  ��ѯ�ڲ���10��20��Ա��
select ename,deptno
from emp
where deptno in(10,20);
--19.ģ����ѯ like  % ������������ַ�  _ һ���ַ�
select ename
from emp
where ename like 'S%';
--20.��ѯ���ź���30����������W��ͷ
select ename,deptno
from emp
where deptno=30 and ename like 'W%';

select ename,deptno
from emp
where deptno=20 or ename like 'W%';

select ename,deptno
from emp
where not deptno=20;
--21.���� (��Ҫ������ֶκ���� desc����  Ĭ����asc����)
select ename,sal,deptno
from emp
order by deptno desc,sal desc;