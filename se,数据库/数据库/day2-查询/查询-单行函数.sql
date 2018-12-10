--���к���
--1.LOWER UPPER ��ĸת����Сд��
select lower(ename)
from emp;
--2.INITCAP ��������ĸת����д
select Initcap(ename)
from emp;
--3.concat ƴ��: ��Ա���ţ� ��������
select Concat(concat('Ա����:',empno), concat(' ����:',ename))
from emp;
--4.SUBSTR ȡ�Ӵ� ����1������Դ�ֶ�  ����2����ʼλ�� ����3������
select Substr(ename,3,2)
from emp;
--5.length ȡ�ַ�������
select Length(ename)
from emp;
--6.INSTR �����Ӵ�λ�� (����1 Ϊ����Դ   ����2 Ϊ���Ҳ������Ҳ������Ϊ0)
select Instr(ename,'W')
from emp;
--7.����ַ��� LPAD RPAD
select Lpad(ename, 10)
from emp;
select Lpad(ename,10,'a')
from emp;
--8.�޼��ַ��� TRIM  LTRIM RTRIM
select Rtrim(ename, 'D')
from emp;
select ltrim('   aa  ',' ')
from dual;
select rtrim(' aa   ',' ')
from dual;
select trim('  a  a ')||'1'
from dual;
--9.replace �滻�Ӵ�,param1:����Դ�ֶ� param2�����滻�ַ��� param3�����ַ�
select Replace(ename,'W','*')
from emp;
--10.trunc:	 �ض�  round: ��������
--param2����ָ��С���������λ
select Trunc(15.123456,2)
from dual;
select Round(15.123456789,4) 
from dual;
--11.ʱ�亯�� sysdate  ȡ��ǰϵͳʱ��
select sysdate
from dual;
--12.months_between �����������ڼ�����ٸ���
select Months_Between
       (To_Date('02-02-1995','MM-DD-YYYY'),
        To_Date('01-01-1995','MM-DD-YYYY') )
from dual;
select Months_Between(to_date('2018-10-26','YYYY-MM-DD'),
                      to_date('2018-08-02','YYYY-MM-DD'))
from dual;                      
--13.add_months ��ǰ���ڼӼ��·�
select add_months(to_date('2018-06-25','YYYY-MM-DD'),12)
from dual;
--14.
/*
next_day
������ָ������Ϊ׼����һ����������ڼ�������
last_day
����ָ�����ڵ������һ�������
*/
select Next_Day(to_date('2018-08-02','YYYY-MM-DD'),5)  
from dual;
select Last_Day(Sysdate)
from dual;
--15.ͨ�ú��� nvl ��ȡ�����е�һ����Ϊnull������
select nvl(null,'aaa')
from dual;
--nvl2  ����1Ϊ�� ���ز���3����Ϊ�� ���ز���2
select Nvl2('0', 'a','b') as "���"
from dual;
--nullif �жϲ��� ��Ԫ���Ƿ�Ϊ��ֵ������1��Ϊ�գ�����2����Ϊ�գ�
select Nullif('a', 'b')
from dual;
--coalesce ���ҵ�һ����Ϊ�յ�Ԫ��
select Coalesce(null, null, null,null,null,'c','d')
from dual;
--��ѯԱ���Ĺ�������
select nvl2(comm,sal+comm,sal) as "��������"
from emp;
--16.case���ʽ
--��ѯ�����е�����Ա����20��н1.1�� 30��н1.2��
select empno,ename,deptno,sal,
case deptno when 20 then sal*1.1
            when 30 then sal*1.2
else sal
end "��н"
from emp;

select empno,ename,deptno,sal,
decode(deptno,20,sal*1.1,30,sal*1.2,sal)
from emp;
--С�ᵥ�к�����
/*
  �ַ������:lower Upper Initcap concat substr length instr
  ������Lpad Rpad trim Ltrim Rtrim replace
  ���֣�round trunc
  ʱ�䣺sysdate months_between add_months last_day next_day
  �Ƿ�Ϊ�գ�nvl nvl2 nullif Coalesce
  case��䣺��ɸѡ���ֶη�Χ����
  decode����
  */

