/*dml��ddl��tcl
1.rownum α��(�Բ�ѯ���Ľ�������ݼ���ʶÿ�е��к�)
  select rownum from emp;
  ���������ڽ������ ��Χ����ɸѡ
  ��emp���в���3-5�еļ�¼
  select * from (select * from emp)
  where rownum between 3 and 5;
2.dml 
  ������ݣ�insert into values
           insert into �Ӳ�ѯ
  �������ݣ�update ���� set �ֶ�=ֵ
  ɾ�����ݣ�delete from ����
  ��ɾ��ѧ������ ������С����
  update ѧ�� set ����=null where ���� = С��
  ������ݣ�truncate table ���� ��������ݱ��ڣ����ɻָ���
3.ddl
  ������create table ����(�ֶ��� ��������,...)
         create table ���� as (select �Ӳ�ѯ)
  �޸ı�alter table 
        add��modify��drop column
  �޸ı���:rename �ɱ��� to �±���
  ɾ����drop table
4.tcl
  commit  rollback  to   savepoint
*/
/*
--����ɾ�����߼�ɾ��
  ����ɾ�������ݱ��ӱ���ɾ��
  �߼�ɾ�������ݴ��ڱ�ɾ��״̬����Ȼ���ڱ���
  
  �߼�ɾ�����ڱ�������ɾ������ֶ�
           �������Ҫɾ�������ݣ�
           �����ֶ�ֵ����Ϊɾ��״̬��
           ����Ϊδɾ��״̬��
           update ���� set delete_flag = 1 where ����;
*/
--Լ��
--not null������Ϊ��
--unique��Ψһ
--primary key��Ψһ�����ظ�����Ϊ��
--foreign key�����
--check ���ֵ
--��Լ�����ڽ�������������Լ��
create table stu5(
  stuid varchar2(20),
  stuname varchar2(10) not null,
  gender varchar2(5),
  email varchar2(30),
  --���Լ����ʽ��
  --constraint Լ���� Լ������(Լ���ֶ�)
  constraint stu_id_pk2 primary key(stuid),
  constraint stu_email_unique unique(email)
);
--�������� ����Լ��
--Ϊ��Լ�� ���ܲ���nullֵ
insert into stu4 values('1',null,'Ů');
--���Լ����
create table stu6(
  stuid varchar2(20),
  stuname varchar2(10) not null,
  gender varchar2(5),
  email varchar2(30),
  courseid number,
  constraint stu_id_pk4 primary key(stuid),
  constraint stu_email_unique1 unique(email),
  --���Լ�������Ϊ�������е�����
  --constraint Լ���� Լ������(�ֶ���) references ����(�����ֶ���)
  constraint stu_course_fk foreign key(courseid)
  references tab_course(course_id)
);
--������ ������� ���ü���Լ��
--(��� ɾ������ʱ����ɾ��)
--on delete cascade�� on delete set null
create table course(
  courseid number primary key,
  name varchar2(20)
);
--on delete set null
create table teacher(
  teaid number primary key,
  courseid number,
  name varchar2(20),
  constraint c_fk foreign key(courseid)
  references course(courseid) on delete set null
);
--on delete cascade
create table teacher2(
  teaid number primary key,
  courseid number,
  name varchar2(20),
  constraint c_fk2 foreign key(courseid)
  references course(courseid) on delete cascade
);
--�γ̱�ͽ�ʦ������ɺ�����������
insert into course values(1,'java');
insert into course values(2,'html');
insert into course values(3,'oracle');
commit;
insert into teacher values(1,1,'С��1');
insert into teacher values(2,2,'С��2');
insert into teacher values(3,3,'С��3');
--��ʦ��2 �������
insert into teacher2 values(1,1,'С��1');
insert into teacher2 values(2,2,'С��2');
insert into teacher2 values(3,3,'С��3');

delete from course where Courseid=1;
--ɾ���γ̱��е�����
delete from course where Courseid=2;
--С�᣺
���Լ������ǰ���е��ֶ���Դ���������������һ�㣩
���������ʽ��
  constraint Լ������ 
      foreign key(�ֶ�) references ������(�����ֶ���)
      on delete set null/ on delete cascade;
����ļ���ɾ��Լ����
     on delete set null��
        ���������ɾ���󣬵�ǰ���еĸ�����Ϊnull��
     on delete cascade��
        �������ɾ����ʹ�õ������ݵ�һ�м�¼Ҳ��ɾ����
  
--check���Լ��
create table stu7( 
      stuno varchar2(10)primary key,
      stuname varchar2(10) not null,
      score number,
      constraint score_check check(score>0)
);
insert into stu7 values('1','С��',10);
--�޸ı�  ɾ������Լ��
alter table stu7
drop primary key cascade;
--�������Լ��������ɾ��Լ��
alter table teacher2
drop constraint c_fk2;