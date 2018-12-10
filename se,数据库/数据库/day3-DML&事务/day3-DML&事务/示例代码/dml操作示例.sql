/*
--sql��䣺
--DDL create table\alter table\drop table
--DML insert into\update set\delete from
--DQL select
--TCL commit\rollback\savepoint
--DCL create user\grant\revoke
DQL
1.select * from ����
2.select �ֶ���,...from ����
3.dual ���
4.select �ֶ���  from  ����  where ����
  ��������ֵ  = <>  > >= < <= 
       �ǵ�ֵɸѡ between and��or��not
                in ��any ��all
       null�жϣ�is null    is not null
5.����ѯ
  select �ֶ���  from ����,����  
  1���ѿ�������cross join�漯
  2��n�ű� ������Ҫn-1������������һ��ͨ�����������ɸѡ��
  3������  as �ֶ�+����
  4�����飺   group by �����ֶ�
             having �Էֺõ����������ɸѡ
  5)��Ȼ���� natrual join(�ֶ�����ͬ������������ͬ��Ψһ�ֶ�)
    ������   join �� on �����ֶ�
    ������   ����ѯʱ���ݱ�ǡ��Ϊͬһ�ű�
  �����⣺�����ӡ���Ȼ����
         �����ӣ�����ѯʱ���ݱ�ǡ��Ϊͬһ�ű� ��Ҫָ������������
         ��Ȼ���ӣ�����ѯʱ�������ֶ�����ͬ������������ͬ��Ψһ�ֶΣ�
                  �Զ���Ϊ����������
  6)�����ӣ���ѯ�������������ݣ�����������֮������ݣ�
    oracle (+): ���⡢����
    sql������ left outer join ��on��
         ���� right outer join��on��
         ���� full outer join��on  
*/
/*
��������
��ʽ  insert into ��(�ֶ�) values(ֵ);
��������ʱ������ֻд������ʡ���ֶ� ��ÿ���ֶε����ݶ���Ҫ���룩
             �ڱ�����ָ����Ҫ��ѯ���ֶε����֣�values��Ҫ��Ӧ���ݲ��룩
*/
--��ѧ�����в���һ�м�¼��ѧ��5 ������С�� �Ա�Ů �绰123 �༶ �������2
insert into tab_stuinfo(stuinfo_id,stuinfo_name,
                      stuinfo_sex,stuinfo_tel,stuinfo_class)
values(5,'��С��','Ů','123','�������2');
insert into tab_stuinfo
values(6,'��С��','��','126','�������2');
insert into tab_stuinfo(stuinfo_id,stuinfo_name)
values(7,'��С��');
insert into tab_stuinfo(stuinfo_id,stuinfo_name)
values(8,'��С��');
--�����Ӳ�ѯ�Ľ���� �����������
--�Ѳ���30��Ա����ź����� ����ѧ������
insert into Tab_Stuinfo(stuinfo_id,stuinfo_name)
select empno,ename from emp where deptno=30;

--��������
--��ѧ����С�� �Ա����Ϊ��  ������ �Ա����ΪŮ
update Tab_Stuinfo
set Stuinfo_Sex = '��'
where Stuinfo_Name = '��С��';
-- �ع� ���ع�����һ��commit����֮���״̬
rollback;
--�ύ���������е����ݲ������ύ��ͬ�������ݿ��ļ�
commit;
update tab_stuinfo
set stuinfo_sex = 'Ů'
where stuinfo_name = '��С��';
--������ʹ���Ӳ�ѯ  
--��James�ĵ绰���³���۵ĵ绰
update Tab_Stuinfo
set Stuinfo_Tel = (select stuinfo_tel 
                    from Tab_Stuinfo 
                    where Stuinfo_Name='���')
where Stuinfo_Name = 'JAMES';

--���²���  ��emp���в���Ϊ30��Ա�����µ�����10��
update emp
set deptno = (select distinct deptno from emp where deptno=10)
where deptno = (select distinct deptno from emp where deptno=30); 

rollback;
--ɾ�����ݲ���  ɾ�����Ϊ8��ѧ��
delete from Tab_Stuinfo ;
--where Stuinfo_Id = 8;

Create table stu(
           Stuinfo_id number primary key,
           Stuinfo_name varchar2(50) not null,
           Stuinfo_sex char(2) default '��',
           Stuinfo_tel varchar2(50),
	   Stuinfo_class varchar2(50),
	   constraint sex_value_ck2 check(stuinfo_sex='��' or stuinfo_sex='Ů')
);
merge into stu s1
using tab_stuinfo s2
on(s1.stuinfo_id = s2.stuinfo_id)
when Matched then
update set s1.stuinfo_name = s2.stuinfo_name,
           s1.stuinfo_sex = s2.stuinfo_sex,
           s1.stuinfo_tel = s2.stuinfo_tel,
           s1.stuinfo_class = s2.stuinfo_class
when not Matched then
insert values(s2.stuinfo_id,s2.stuinfo_name,
              s2.stuinfo_sex,s2.stuinfo_tel,
              s2.stuinfo_class); 

