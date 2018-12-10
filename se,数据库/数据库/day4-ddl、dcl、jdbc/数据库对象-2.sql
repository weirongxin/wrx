--视图
--（数据安全、独立、提高访问效率）
--创建视图view
--”部门号50的所有员工创建视图emp50“
create view emp50
as select * from employees where department_id=50;

select last_name from emp50;

--with check option 视图的检查约束
--将创建视图时的筛选条件作为 视图数据的筛选条件，不满足不能插入
create view dept0
as select department_id,department_name
    from departments
    where department_id = 10
    with check option constraint view_k;
    
insert into dept0 values(12,'a');

--序列
--创建序列 以增量2、起始1 、最大值100
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
--序列的应用场景：
--往表中插入主键数据时，格式：序列名.nextval
--特点：序列中取出来的数据，回滚后不可重用
insert into seq_table values(test_seq.nextval,'xiaoming');
rollback;
--添加索引
create index test_index
on seq_table(name);