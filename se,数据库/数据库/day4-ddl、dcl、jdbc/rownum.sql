
--rownum α��  ���ӱ��в�ѯ�����ݵ��кţ�

--��ѯÿ����¼���к�
--select rownum from employees;

--��ѯ��һ��Ա��������
select  rownum,last_name from employees where rownum=1;

--��ѯǰ�ĸ�Ա�������֡�����
select last_name,salary from (select rownum n,last_name,salary from employees) where n<4;  






