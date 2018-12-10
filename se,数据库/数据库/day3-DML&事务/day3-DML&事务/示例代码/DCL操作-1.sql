--DCL语言
--建表 自动进行事务的commit操作：
create table dept2( deptno number(4),
      deptname varchar2(15),
      locid varchar2(10)
  );
rollback;
--使用子查询语句建表
--创建学生表（数据来源于 stu中的id、name）
create table stu2
as (select stuinfo_id,stuinfo_name from stu);
--alter table 修改表
--追加字段
alter table stu2
add (tel varchar2(20));
--修改字段
alter table stu2
modify (tel varchar2(11));
--删除字段
alter table stu2
drop column tel;

--删除表
drop table dept2;
--修改表名
rename stu2 to stu3;
--清空表 效率高于delete from
truncate table stu3;
comment on table stu3 is '测试用的表';
/*
DDL数据定义语言
1.创建表 create table 
  指定表中的字段 创建空表
  创建的表来源于子查询语句  as 子查询
2.修改表 alter table
  add modify drop
3.改表名  rename to
4.删除表 drop table
5.清空表 truncate table
*/