--plsql

--定义变量  输出
/*语法
declare
  --声明变量(部分)
begin
   --功能代码（部分）
end;
*/
declare    
  num number := 12;
begin    
  dbms_output.put_line(num);  
end;


--if语句  
/*  语法
if 条件 then 功能
elsif 条件 then 功能
else
end if；
*/
declare
 num number :=1;
begin
  if num>0 then dbms_output.put_line('正数');
  elsif num<0 then dbms_output.put_line('负数');
  else dbms_output.put_line('零');
  end if;
end;  


--数据为录入的： &变量名  （  & 取值符  让用户录入）
--录入一个数字，判断正负零
declare
  num number := &inputnum;
begin
  if num>0 then dbms_output.put_line('正');
  elsif num<0 then dbms_output.put_line('负');
  else dbms_output.put_line('零');
  end if;
end;


--循环语句
/*(语法)
loop
exit when 条件；
end loop;
*/

declare
  num number := & n ;
begin
  loop
  dbms_output.put_line(concat('数字:',num));
  exit when num=0;
  num:= num-1; 
  end loop;
end;


--游标  (相当于查询语句的结果集)    格式：   cousor 游标名 is 查询语句；
--查询员工表中 部门是50的
declare
  cursor c is select last_name from employees where employee_id=198;
  name employees.last_name%type;  --声明变量为和某个字段相同数据类型:引用数据类型  --格式:变量名  表名.字段名%type;
begin
  open c;         --代开游标：  执行sql语句，结果集在c中         
    loop          --循环遍历结果集c中元素
    fetch c into name;      --将结果集中的数据 存入遍历name中
    exit when c%notfound;   --当c中没有需要遍历的数据时循环结束
    dbms_output.put_line(name);
    end loop;
  close c;        --关闭游标
end;

declare 
  cursor c is select first_name,last_name from employees where department_id=50;
  first_name employees.first_name%type;
  last_name employees.last_name%type;
begin
  open c;
    loop
    fetch c into first_name,last_name;
    exit when c%notfound;
    dbms_output.put_line(concat(concat(first_name,'  '),last_name));
    end loop;
  close c;
end;

--带参数的游标
--查询用户指定部门的员工
declare
  cursor c(no number) is select last_name,salary,department_id from employees where department_id=no;
  n number :=&no;
  last_name employees.last_name%type;
  salary employees.salary%type;
  deptno employees.department_id%type;
begin
  open c(n);
    loop 
    fetch c into last_name,salary,deptno;
    exit when c%notfound;
    dbms_output.put_line('姓名：'||last_name||'       工资：'||salary||'    部门：'||deptno);
    end loop;
  close c;
end;

--  总裁AC_MGR 工资张1000   经理MK_MAN 工资张800   其他 400 
declare
  cursor c is select employee_id,job_id,salary from employees;
  empid employees.employee_id%type;
  job_id employees.job_id%type;
  salary employees.salary%type;
begin
  open c;
  loop
  fetch c into empid,job_id,salary;
    if job_id='AC_MGR' then dbms_output.put_line(empid||'  '||job_id||'  '||salary+1000);
    elsif job_id='MK_MAN' then dbms_output.put_line(empid||'  '||job_id||'  '||salary+800);
    else dbms_output.put_line(empid||'  '||job_id||'  '||salary+400);
    end if;
  end loop;
  close c;  
end;

--创建存储过程
--根据id查询用户名，工资
--存储过程名  selById  相当于方法
--  参数
create or replace procedure selById(empid in employees.employee_id%type,name out employees.last_name%type,
                      sal out employees.salary%type)
as
begin
  select last_name,salary into name,sal from employees where employee_id=empid;
end;


--对存储过程调用
declare 
--声明2个变量
  name employees.last_name%type;
  sal employees.salary%type;
begin
--根据存储过程的名字调用  调用时，出参也需要进行参数传递
 selById(198,name,sal);
 dbms_output.put_line(name||sal);
end;









