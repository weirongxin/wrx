--��ҳ��ѯ
--���󣺰����û���Ҫ��ѯ������ҳ������ ���ݲ�ѯ
--��������ѯɸѡ����(���źš���Χ���ؼ���)
--      ҳ��(�ڼ�ҳ���ݣ�ת��Ϊ ����������Χ)
--����ѯemp���� ��1ҳԱ�������֡���ÿҳ����5����
--rownum α����Ϊɸѡ����ʱ�����Դ�1��ʼ��Χ��ɸѡ
--                         ���ֱ��ʹ�� ����1��ʼ����ֱ��ɸѡ
select ename from emp where rownum>=1 and rownum<=5;
--select ename from emp where rownum>=6 and rownum<=10;
--��ѯ�ڶ�ҳ���ݣ���Χ���к�ɸѡ��6-10�����ݣ�
select ename
from (select ename,rownum r from emp)
where r>=6 and r<=10;
--��ѯ����ҳ���ݣ���Χ���к�ɸѡ��11-15�����ݣ�
select ename
from (select ename,rownum r from emp)
where r>=11 and r<=15;
--��ѯԱ�������֡����֡��������ݣ���ʾ�ڶ�ҳ��ÿҳ10����
select ename,job,sal
from (select ename,job,sal,rownum r from emp)
where r>=11 and r<=20;
