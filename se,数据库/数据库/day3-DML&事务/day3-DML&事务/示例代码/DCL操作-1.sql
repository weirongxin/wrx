--DCL����
--���� �Զ����������commit������
create table dept2( deptno number(4),
      deptname varchar2(15),
      locid varchar2(10)
  );
rollback;
--ʹ���Ӳ�ѯ��佨��
--����ѧ����������Դ�� stu�е�id��name��
create table stu2
as (select stuinfo_id,stuinfo_name from stu);
--alter table �޸ı�
--׷���ֶ�
alter table stu2
add (tel varchar2(20));
--�޸��ֶ�
alter table stu2
modify (tel varchar2(11));
--ɾ���ֶ�
alter table stu2
drop column tel;

--ɾ����
drop table dept2;
--�޸ı���
rename stu2 to stu3;
--��ձ� Ч�ʸ���delete from
truncate table stu3;
comment on table stu3 is '�����õı�';
/*
DDL���ݶ�������
1.������ create table 
  ָ�����е��ֶ� �����ձ�
  �����ı���Դ���Ӳ�ѯ���  as �Ӳ�ѯ
2.�޸ı� alter table
  add modify drop
3.�ı���  rename to
4.ɾ���� drop table
5.��ձ� truncate table
*/