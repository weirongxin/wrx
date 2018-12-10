--多表查询：
--查询到的数据是 多个表的数量的乘积（尽量避免）
--select * from emp,dept;
--多表查询  “查询员工号、员工名、部门号、部门名”
/*
select emp.empno,emp.ename,emp.deptno,dept.dname
from emp,dept
where emp.deptno=dept.deptno;
*/
--多表查询
--所有的部门名、部门编号、部门所在的城市 （departments、locations）
select Departments.Department_Name,Departments.Department_Id,Locations.City
from departments,locations
where departments.location_id = locations.location_id;

select D.Department_Name,D.Department_Id,L.City
from departments d,locations l
where d.location_id = l.location_id;
--多表查询时，非等值连接（范围）
select e.last_name,e.salary,J.Job_Title
from employees e,jobs j
where e.salary between j.min_salary and j.max_salary;
--外连接
--左外连接 “查询所有的部门 及部门员工”
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E,departments D
where E.department_id(+) = D.Department_Id;
--右外连接 “查询所有的员工 及 员工所在的部门”
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E,departments D
where E.department_id = D.Department_Id(+);
--自连接：多表查询时 多张表为同一张表连接查询
--自然连接：natural join 多表查询时，
--      自动匹配名字相同且数据类型相同的字段，作为查询条件
select D.Department_Name,L.City
from departments d
natural join locations l;
--连接查询  当多个表查询时，存在多个能够匹配的字段时，
--         需要join连接表，using指定关联的查询字段
-- 查询员工名、部门号、部门名
select e.last_name,d.department_name
from employees e
join departments d
using (department_id);

select e.last_name,d.department_name
from employees e,departments d
where e.department_id = d.department_id ;

--on 子句添加额外的筛选条件
select e.last_name,d.department_name
from employees e
join departments d
on (e.department_id = d.department_id);


--左外链接
--Oracle左外连接 “查询所有的部门 及部门员工”
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E,departments D
where E.department_id(+) = D.Department_Id;
--sql 左外链接  显示全部的员工，包含没有部门的员工  
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E
left outer join departments D
on (E.department_id=D.department_id);
--！！！一般需求中提及“所有”时，会涉及到外连接


