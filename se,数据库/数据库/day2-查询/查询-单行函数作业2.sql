--1���ҳ�����10�����о���Ͳ���20�е����а���Ա����ϸ����
select *
from emp
where deptno=10 and job='MANAGER' OR deptno=20 and job='CLERK';
--2���ҳ�����10�����о�������20�����а���Ա��
--�Ȳ��Ǿ����ֲ��ǰ���Ա����н��>=2000�����й�Ա����ϸ����
select * 
from emp
where (deptno=10 and job='MANAGER')or(deptno=20 and job='CLERK')
      or(job not in('MANAGER','CLERK') and sal>=2000);

--3���ҳ�����ȡӶ�����ȡ��Ӷ�����100�Ĺ�Ա (nvl����)
select ename from emp
where nvl(comm,0)<100;
--4���ҳ��������һ���ܹ͵����й�Ա
select * from emp
where hiredate=last_day(hiredate);
--5���ҳ�����25��֮ǰ�ܹ͵Ĺ�Ա
select * from emp
where months_between(sysdate,hiredate)>25*12;
--6����ʾֻ������ĸ��д�����й�Ա������
select ename
from emp
where initcap(ename)=ename;
--7����ʾ����Ϊ6���ַ��Ĺ�Ա����
select ename
from emp
where length(ename)=6;
--8����ʾ������'R'�Ĺ�Ա����(INSTR ����)
select ename
from emp
where instr(ename,'R')=0;
--9����ʾ���й�Ա��������ǰ�����ַ�
select substr(ename,1,3)
from emp;
--10����ʾ���й�Ա����������a�滻����'A'
select replace(ename,'A','a')
from emp;
--11����ʾ���й�Ա�������Լ���10��������޵�����
select ename,add_months(hiredate,10*12)
from emp;
--������10��Ĺ�Ա������������
select ename
from emp
where add_months(hiredate,10*12)<sysdate;
--12����ʾ���й�Ա�������ͼ��빫˾����ݺ��·ݣ�
--����Ա�ܹ������������򣬽�������ݵ���Ŀ������ǰ��
select ename,to_char(hiredate,'YYYY'),to_char(hiredate,'MM')
from emp
order by to_char(hiredate,'YYYY'),to_char(hiredate,'MM');
--13���ҳ��ڣ��κ���ݵģ�2����Ƹ�����й�Ա
select *
from emp
where to_char(hiredate,'MM')='02';
--14������ÿ����Ա����ʾ����빫˾������
select round(sysdate-hiredate),ename
from emp;
--15����ʾ�����ֶε��κ�λ�ã����� "A" �����й�Ա������(INSTR����)
select ename
from emp
where instr(ename,'A')<>0;
--16�����ꡢ�º�����ʾ���й�Ա�ķ�������
select months_between(sysdate,hiredate)/12,
        months_between(sysdate,hiredate),
        sysdate-hiredate
from emp;