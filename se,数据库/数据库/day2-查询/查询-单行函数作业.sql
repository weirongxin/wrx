--1.��ѯԱ���պ���������ȵ�Ա��
select concat(first_name,last_name) 
from employees 
where length(first_name)=length(last_name);
--2.��ѯlast_name��s��β��Ա��������like��
select last_name
from employees
where substr(last_name,length(last_name),1)='s';
--3.��ѯ���е�Ա���պ�����������¸�ʽS.King
select concat(concat(first_name,'.'),last_name)
from employees;
select substr(first_name,1,1)||'.'||last_name
from employees;
--4.��ѯ���еĵ绰���룬�ѷָ������㡱��Ϊ��-��֮�������
select replace(phone_number,'.','-') from employees;
--5.һ���û������ţ���ѯ�˱�ŵ�Ա��
select * from employees where Employee_Id=198;
--6.һ���û��ؼ��֣���ѯlast_name�����˹ؼ��ֵ�Ա��������like��
select * from employees where instr(last_name,'d')>0;

