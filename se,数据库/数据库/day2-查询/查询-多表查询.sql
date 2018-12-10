--多表查询：
--查询到的数据是 多个表的数量的乘积（尽量避免）
--select * from emp,dept;
--多表查询  “查询员工号、员工名、部门号、部门名”
/*
select emp.empno,emp.ename,emp.deptno,dept.dname
from emp,dept
where emp.deptno=dept.deptno;
*/