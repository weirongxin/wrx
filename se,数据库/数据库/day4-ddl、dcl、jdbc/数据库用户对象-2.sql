--创建用户xiaoming  密码xiaoming
create user xiaoming
Identified by xiaoming;
--给xiaoming分配创建会话、建表权限
grant create session,create table
to xiaoming;
