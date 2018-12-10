--PLSQL
--1.定义变量num数值类型赋值123 输出
declare
  --声明部分
  num number:=123;
begin
  --功能代码（打印输出）
  dbms_output.put_line(num);
end;
--2.if语句 
--定义变量，判断该数值大于零 输出正数，该数值小于0 输出负数，零
declare
  num number:=-10;
begin
  if num>0 then dbms_output.put_line('正数');
  elsif num<0 then dbms_output.put_line('负数');
  else dbms_output.put_line('零');
  end if;
end;
--数据为录入的：&变量名
--录入一个数字，判断正负零
declare
  num number:=&inputnum;
begin
  if num>0 then dbms_output.put_line('正数');
  elsif num<0 then dbms_output.put_line('负数');
  else dbms_output.put_line('零');
  end if;
end;
--循环语句
--循环遍历1-10数据输出
declare
  num number:=&n;
begin
  loop
    dbms_output.put_line('数字：'||num);
  exit when num=0;
    num := num-1;
  end loop;
end;
--游标 相当于查询语句及结果集
--查询 员工表中员工号198员工名字
declare
  cursor c is select last_name from employees 
                        where employee_id=198;
  --声明变量为和某个字段相同数据类型：引用类型
  --变量名 表.字段名%type;
  name employees.last_name%type;
begin
  --打开游标，执行sql语句，结果集在c中
  open c;
    --循环遍历结果集c中的元素
    loop
      --将结果集中的数据 存入name变量中
      fetch c into name;
      --当c中没有需要遍历的数据时循环结束
      exit when c%notfound;
      --打印输出变量数据
      dbms_output.put_line(name);
    end loop;
  close c;
end;
--带参数的游标
--查询用户指定部门的员工 姓名、工资、部门号
declare
  cursor c(dptno number) is select last_name,salary,department_id
        from employees where department_id=dptno;
  inputNo number := &n;
  name employees.last_name%type;
  sal employees.salary%type;
  deptno employees.department_id%type;
begin
  open c(inputNo);
    loop
      fetch c into name,sal,deptno;
     exit when c%notfound;
      dbms_output.put_line('姓名:'||name||' 工资 '||sal||' 部门号 '||deptno);
    end loop;
  close c;
end;
--涨工资  总裁1000、经理800、其他400
--给固定的员工涨工资(给录入的员工编号涨工资1块)
--总裁AC_MGR  经理MK_MAN
declare
  cursor c is select employee_id,job_id from employees;
  empid employees.employee_id%type;
  jobid employees.job_id%type;
begin
  open c;
    loop
      fetch c into empid,jobid;
      if jobid='AC_MGR' then 
          update employees set salary=salary+1000
            where employee_id = empid;
      elsif jobid='MK_MAN' then
          update employees set salary=salary+800
            where employee_id = empid;
      else update employees set salary=salary+400
            where employee_id = empid;
      end if;
      exit when c%notfound;
    end loop;
  close c;
end;
--创建存储过程（存储过程创建相当于功能的封装）
--创建存储过程查询 根据id查询用户名、工资
--存储过程名：selById  相当于方法
--     参数：in  out 区分入参和出参
--     参数1：empid 员工号  出参-》参数2：员工名字  参数3：工资
create or replace procedure selById(
      empid in employees.employee_id%type,
      name out employees.last_name%type,
      sal out employees.salary%type) 
as
begin
  --存储过程的功能：根据id查询员工名、工资
  select last_name,salary into name,sal from employees where employee_Id=empid;
end;

--对存储过程的调用 （类似方法的调用）   
declare
  --声明两个变量（用于存储从存储过程中获取的两个数据）
  name employees.last_name%type;
  sal employees.salary%type;
begin
  --根据存储过程的名字调用存储过程,调用时，出参也需要进行参数传递
  selById(198,name,sal);
  --存储过程调用完成后，传入的出参变量已经有数据值，可以打印
  dbms_output.put_line(name||sal);
end;

