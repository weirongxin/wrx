--��ͼ
--�����ݰ�ȫ����������߷���Ч�ʣ�
--������ͼview
--�����ź�50������Ա��������ͼemp50��
create view emp50
as select * from employees where department_id=50;

select last_name from emp50;

--with check option ��ͼ�ļ��Լ��
--��������ͼʱ��ɸѡ������Ϊ ��ͼ���ݵ�ɸѡ�����������㲻�ܲ���
create view dept0
as select department_id,department_name
    from departments
    where department_id = 10
    with check option constraint view_k;
    
insert into dept0 values(12,'a');

--����
--�������� ������2����ʼ1 �����ֵ100
create sequence test_seq
       increment by 2
       start with 1
       Maxvalue 100
       nocache
       nocycle;
    
create table seq_table(
  id number primary key,
  name varchar2(10) not null
);  
--���е�Ӧ�ó�����
--�����в�����������ʱ����ʽ��������.nextval
--�ص㣺������ȡ���������ݣ��ع��󲻿�����
insert into seq_table values(test_seq.nextval,'xiaoming');
rollback;
--�������
create index test_index
on seq_table(name);