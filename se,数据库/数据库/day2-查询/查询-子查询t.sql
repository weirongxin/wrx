--�Ӳ�ѯ����ѯ����Ϊ><=<>�Ƚ�ʱ���Ӳ�ѯ��ֵһ����ҪΪһ�м�¼
--       ��ѯ����Ϊ��Χɸѡ����ʹ�� in  any  all
--�Ӳ�ѯ����ѯԱ�����б�FORD���ʸߵ�Ա����
select ename,sal
from emp
where sal>(select sal from emp where ename='JAMES');
--��ѯ ���ֺ�JAMES��ͬ�����ʱ���ߵ�Ա��
select ename
from emp
where job=(select job from emp where ename='JAMES')
      and sal>(select sal from emp where ename='JAMES');
      
--��ѯ ���ڲ���10��ÿ�����ŵ���߹���
select deptno,max(sal)
from emp
group by deptno
having max(sal)<(select max(sal) from emp where deptno=10);
--��ѯÿ����������͹��ʵ�Ա��
SELECT empno, ename
FROM   emp
WHERE  sal  in
                (SELECT   MIN(sal)
                 FROM     emp
                 GROUP BY deptno);
--in  any all�ؼ���ɸѡ
--��ѯ������˾���������ţ��Ͳ���10��Ա���Ĺ�����ͬ��Ա��
select deptno,ename,sal
from emp
where sal in (select sal from emp where deptno=10)
      and deptno<>10;
--��MANAGERְλ  ��߹��ʵ͵�Ա������͹��ʵ͵�Ա��
select ename,sal
from emp
where sal < any(select sal from emp where job='MANAGER')
      and job<>'MANAGER';

select ename,sal
from emp
where sal < all(select sal from emp where job='MANAGER')
      and job<>'MANAGER';
--��ϰ���г�н���"SMITH"������й�Ա��employees��  hr�û���

