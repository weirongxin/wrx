--���麯�� AVG MAX MIN COUNT SUM
--�������裺1.�ȴӱ��л�ȡɸѡ������һ������
--         2.�Ը�������ȡ��Ӧ �麯��ֵ
select AVG(sal),MAX(sal),MIN(sal),COUNT(sal),SUM(sal)
from emp;
--1.��ѯԱ�����в���20������
select count(*)
from emp
where deptno=20 or deptno=30;
--2.�����麯��   �������Ϊnull�����ڼ���
--  ƽ��ֵ�麯�� ����Ϊnull������ ��������㣩
select count(comm)
from emp;
--��ѯ�н�����˵�ƽ��ֵ
select avg(comm)
from emp;
--��ѯ���������˵Ľ���ƽ��ֵ
select avg(nvl(comm,0))
from emp;
--3.�麯����ʹ��distinct
select count(distinct deptno)
from emp;
select count(distinct job)
from emp;
--4.group by�Ӿ�
--��ѯÿ�������е���߹���
select deptno,max(sal)
from emp
group by deptno;
--5.�Զ�����Ϊ��������
--!!!�Է���������ѯʱ��select���ֶ�ֻ��Ϊ �������������麯��
select max(sal),deptno,job
from emp
group by deptno,job;
--6.���˷����ѯ
--having�Ӿ�
--��ѯ��߹��ʴ���4000�Ĳ���
select deptno,max(sal)
from emp
group by deptno
having max(sal)>4000;


