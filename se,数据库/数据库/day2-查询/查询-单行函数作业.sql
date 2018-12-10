--1.查询员工姓和名字数相等的员工
select concat(first_name,last_name) 
from employees 
where length(first_name)=length(last_name);
--2.查询last_name以s结尾的员工（不用like）
select last_name
from employees
where substr(last_name,length(last_name),1)='s';
--3.查询所有的员工姓和名，输出以下格式S.King
select concat(concat(first_name,'.'),last_name)
from employees;
select substr(first_name,1,1)||'.'||last_name
from employees;
--4.查询所有的电话号码，把分隔符“点”换为“-”之后再输出
select replace(phone_number,'.','-') from employees;
--5.一个用户任意编号，查询此编号的员工
select * from employees where Employee_Id=198;
--6.一个用户关键字，查询last_name包含此关键字的员工（不用like）
select * from employees where instr(last_name,'d')>0;

