--子查询：查询条件为><=<>比较时，子查询的值一定需要为一行记录
--       查询条件为范围筛选，则使用 in  any  all
--子查询（查询员工表中比FORD工资高的员工）
select ename,sal
from emp
where sal>(select sal from emp where ename='JAMES');
--查询 工种和JAMES相同但工资比其高的员工
select ename
from emp
where job=(select job from emp where ename='JAMES')
      and sal>(select sal from emp where ename='JAMES');
      
--查询 低于部门10的每个部门的最高工资
select deptno,max(sal)
from emp
group by deptno
having max(sal)<(select max(sal) from emp where deptno=10);
--查询每个部门中最低工资的员工
SELECT empno, ename
FROM   emp
WHERE  sal  in
                (SELECT   MIN(sal)
                 FROM     emp
                 GROUP BY deptno);
--in  any all关键字筛选
--查询整个公司里其他部门，和部门10中员工的工资相同的员工
select deptno,ename,sal
from emp
where sal in (select sal from emp where deptno=10)
      and deptno<>10;
--比MANAGER职位  最高工资低的员工、最低工资低的员工
select ename,sal
from emp
where sal < any(select sal from emp where job='MANAGER')
      and job<>'MANAGER';

select ename,sal
from emp
where sal < all(select sal from emp where job='MANAGER')
      and job<>'MANAGER';
--练习：列出薪金比"SMITH"多的所有雇员（employees表  hr用户）

