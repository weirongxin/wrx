--8.	��ѯ��������������Ա������͹��ʣ�
--������͹��ʲ��ܵ���2000��û�й����ߵ�Ա������������
select mgr,min(sal)
from emp
where mgr is not null
group by mgr
having min(sal)>=2000;
--9.��ѯ��˾���������Լ���1995-1998��֮�䣬
--ÿ����õ������������������ĸ�ʽ(ʹ���麯����sum��decode)
select count(empno) "total",
sum(decode(to_char(hiredate,'YYYY'),'1981',1,0)) "1981",
sum(decode(to_char(hiredate,'YYYY'),'1995',1,0)) "1995",
sum(decode(to_char(hiredate,'YYYY'),'1996',1,0)) "1996",
sum(decode(to_char(hiredate,'YYYY'),'1997',1,0)) "1997"
from emp;
--sum(decode(to_char(hiredate,'YYYY'),'1981',1,'1995',1,'1996',1,'1997',1,0))