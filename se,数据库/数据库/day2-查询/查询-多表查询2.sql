--����ѯ��
--��ѯ���������� �����������ĳ˻����������⣩
--select * from emp,dept;
--����ѯ  ����ѯԱ���š�Ա���������źš���������
/*
select emp.empno,emp.ename,emp.deptno,dept.dname
from emp,dept
where emp.deptno=dept.deptno;
*/
--����ѯ
--���еĲ����������ű�š��������ڵĳ��� ��departments��locations��
select Departments.Department_Name,Departments.Department_Id,Locations.City
from departments,locations
where departments.location_id = locations.location_id;

select D.Department_Name,D.Department_Id,L.City
from departments d,locations l
where d.location_id = l.location_id;
--����ѯʱ���ǵ�ֵ���ӣ���Χ��
select e.last_name,e.salary,J.Job_Title
from employees e,jobs j
where e.salary between j.min_salary and j.max_salary;
--������
--�������� ����ѯ���еĲ��� ������Ա����
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E,departments D
where E.department_id(+) = D.Department_Id;
--�������� ����ѯ���е�Ա�� �� Ա�����ڵĲ��š�
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E,departments D
where E.department_id = D.Department_Id(+);
--�����ӣ�����ѯʱ ���ű�Ϊͬһ�ű����Ӳ�ѯ
--��Ȼ���ӣ�natural join ����ѯʱ��
--      �Զ�ƥ��������ͬ������������ͬ���ֶΣ���Ϊ��ѯ����
select D.Department_Name,L.City
from departments d
natural join locations l;
--���Ӳ�ѯ  ��������ѯʱ�����ڶ���ܹ�ƥ����ֶ�ʱ��
--         ��Ҫjoin���ӱ�usingָ�������Ĳ�ѯ�ֶ�
-- ��ѯԱ���������źš�������
select e.last_name,d.department_name
from employees e
join departments d
using (department_id);

select e.last_name,d.department_name
from employees e,departments d
where e.department_id = d.department_id ;

--on �Ӿ���Ӷ����ɸѡ����
select e.last_name,d.department_name
from employees e
join departments d
on (e.department_id = d.department_id);


--��������
--Oracle�������� ����ѯ���еĲ��� ������Ա����
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E,departments D
where E.department_id(+) = D.Department_Id;
--sql ��������  ��ʾȫ����Ա��������û�в��ŵ�Ա��  
select E.Last_Name,E.Department_Id,D.Department_Name
from employees E
left outer join departments D
on (E.department_id=D.department_id);
--������һ���������ἰ�����С�ʱ�����漰��������


