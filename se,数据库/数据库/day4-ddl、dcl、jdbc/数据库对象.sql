/*dml、ddl、tcl
1.rownum 伪列(对查询到的结果、数据集标识每行的行号)
  select rownum from emp;
  场景：用于结果集中 范围行数筛选
  从emp表中查找3-5行的记录
  select * from (select * from emp)
  where rownum between 3 and 5;
2.dml 
  添加数据：insert into values
           insert into 子查询
  更新数据：update 表名 set 字段=值
  删除数据：delete from 表名
  “删除学生表中 姓名：小明”
  update 学生 set 姓名=null where 姓名 = 小明
  清空数据：truncate table 表名 （清空数据表在，不可恢复）
3.ddl
  创建表：create table 表名(字段名 数据类型,...)
         create table 表名 as (select 子查询)
  修改表：alter table 
        add、modify、drop column
  修改表名:rename 旧表名 to 新表名
  删除表：drop table
4.tcl
  commit  rollback  to   savepoint
*/
/*
--物理删除、逻辑删除
  物理删除：数据被从表中删除
  逻辑删除：数据处于被删除状态，仍然存在表中
  
  逻辑删除：在表中增加删除标记字段
           如果是需要删除的数据，
           将该字段值更新为删除状态，
           否则为未删除状态。
           update 表名 set delete_flag = 1 where 条件;
*/
--约束
--not null、不可为空
--unique、唯一
--primary key、唯一不可重复不可为空
--foreign key、外键
--check 检查值
--表级约束：在建表语句的最后添加约束
create table stu5(
  stuid varchar2(20),
  stuname varchar2(10) not null,
  gender varchar2(5),
  email varchar2(30),
  --添加约束格式：
  --constraint 约束名 约束类型(约束字段)
  constraint stu_id_pk2 primary key(stuid),
  constraint stu_email_unique unique(email)
);
--插入数据 测试约束
--为空约束 不能插入null值
insert into stu4 values('1',null,'女');
--外键约束：
create table stu6(
  stuid varchar2(20),
  stuname varchar2(10) not null,
  gender varchar2(5),
  email varchar2(30),
  courseid number,
  constraint stu_id_pk4 primary key(stuid),
  constraint stu_email_unique1 unique(email),
  --外键约束：外键为其他表中的主键
  --constraint 约束名 约束类型(字段名) references 表名(关联字段名)
  constraint stu_course_fk foreign key(courseid)
  references tab_course(course_id)
);
--创建表 外键关联 设置及联约束
--(外键 删除数据时关联删除)
--on delete cascade、 on delete set null
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
--课程表和教师表创建完成后，增加新数据
insert into course values(1,'java');
insert into course values(2,'html');
insert into course values(3,'oracle');
commit;
insert into teacher values(1,1,'小明1');
insert into teacher values(2,2,'小明2');
insert into teacher values(3,3,'小明3');
--教师表2 添加数据
insert into teacher2 values(1,1,'小明1');
insert into teacher2 values(2,2,'小明2');
insert into teacher2 values(3,3,'小明3');

delete from course where Courseid=1;
--删除课程表中的数据
delete from course where Courseid=2;
--小结：
外键约束：当前表中的字段来源于其他表的主键（一般）
设置外键格式：
  constraint 约束名字 
      foreign key(字段) references 其他表(主键字段名)
      on delete set null/ on delete cascade;
外键的及联删除约束：
     on delete set null：
        外键数据在删除后，当前表中的该数据为null。
     on delete cascade：
        外键数据删除后，使用到该数据的一行记录也被删除。
  
--check检查约束
create table stu7( 
      stuno varchar2(10)primary key,
      stuname varchar2(10) not null,
      score number,
      constraint score_check check(score>0)
);
insert into stu7 values('1','小明',10);
--修改表  删除主键约束
alter table stu7
drop primary key cascade;
--根据外键约束的名字删除约束
alter table teacher2
drop constraint c_fk2;