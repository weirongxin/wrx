/*
--sql语句：
--DDL create table\alter table\drop table
--DML insert into\update set\delete from
--DQL select
--TCL commit\rollback\savepoint
--DCL create user\grant\revoke
DQL
1.select * from 表名
2.select 字段名,...from 表名
3.dual 虚表
4.select 字段名  from  表名  where 条件
  条件：等值  = <>  > >= < <= 
       非等值筛选 between and，or，not
                in ，any ，all
       null判断：is null    is not null
5.多表查询
  select 字段名  from 表名,表名  
  1）笛卡尔积、cross join叉集
  2）n张表 至少需要n-1个连接条件（一般通过主外键连接筛选）
  3）别名  as 字段+别名
  4）分组：   group by 分组字段
             having 对分好的组进行条件筛选
  5)自然连接 natrual join(字段名相同且数据类型相同的唯一字段)
    表连接   join 表 on 连接字段
    自连接   多表查询时数据表恰好为同一张表
  面试题：自连接、自然连接
         自连接：多表查询时数据表恰好为同一张表 需要指定连接条件。
         自然连接：多表查询时，存在字段名相同、数据类型相同的唯一字段，
                  自动作为连接条件。
  6)外连接（查询满足条件的数据，及满足条件之外的数据）
    oracle (+): 左外、右外
    sql：左外 left outer join ，on、
         右外 right outer join，on、
         满外 full outer join，on  
*/
/*
插入数据
格式  insert into 表(字段) values(值);
插入数据时，可以只写表名（省略字段 则每个字段的数据都需要插入）
             在表名后指定需要查询的字段的名字（values需要对应数据插入）
*/
--往学生表中插入一行记录：学号5 姓名王小明 性别女 电话123 班级 软件工程2
insert into tab_stuinfo(stuinfo_id,stuinfo_name,
                      stuinfo_sex,stuinfo_tel,stuinfo_class)
values(5,'王小明','女','123','软件工程2');
insert into tab_stuinfo
values(6,'王小红','男','126','软件工程2');
insert into tab_stuinfo(stuinfo_id,stuinfo_name)
values(7,'王小白');
insert into tab_stuinfo(stuinfo_id,stuinfo_name)
values(8,'王小白');
--根据子查询的结果集 插入表中数据
--把部门30的员工编号和名字 插入学生表中
insert into Tab_Stuinfo(stuinfo_id,stuinfo_name)
select empno,ename from emp where deptno=30;

--更新数据
--将学生王小明 性别更新为男  王晓红 性别更新为女
update Tab_Stuinfo
set Stuinfo_Sex = '男'
where Stuinfo_Name = '王小明';
-- 回滚 ：回滚到上一次commit操作之后的状态
rollback;
--提交：将缓存中的数据操作，提交、同步到数据库文件
commit;
update tab_stuinfo
set stuinfo_sex = '女'
where stuinfo_name = '王小明';
--更新中使用子查询  
--将James的电话更新成李慧的电话
update Tab_Stuinfo
set Stuinfo_Tel = (select stuinfo_tel 
                    from Tab_Stuinfo 
                    where Stuinfo_Name='李慧')
where Stuinfo_Name = 'JAMES';

--更新操作  将emp表中部门为30的员工更新到部门10中
update emp
set deptno = (select distinct deptno from emp where deptno=10)
where deptno = (select distinct deptno from emp where deptno=30); 

rollback;
--删除数据操作  删除编号为8的学生
delete from Tab_Stuinfo ;
--where Stuinfo_Id = 8;

Create table stu(
           Stuinfo_id number primary key,
           Stuinfo_name varchar2(50) not null,
           Stuinfo_sex char(2) default '男',
           Stuinfo_tel varchar2(50),
	   Stuinfo_class varchar2(50),
	   constraint sex_value_ck2 check(stuinfo_sex='男' or stuinfo_sex='女')
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

