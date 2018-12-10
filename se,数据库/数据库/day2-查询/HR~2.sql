--plsql

--�������  ���
/*�﷨
declare
  --��������(����)
begin
   --���ܴ��루���֣�
end;
*/
declare    
  num number := 12;
begin    
  dbms_output.put_line(num);  
end;


--if���  
/*  �﷨
if ���� then ����
elsif ���� then ����
else
end if��
*/
declare
 num number :=1;
begin
  if num>0 then dbms_output.put_line('����');
  elsif num<0 then dbms_output.put_line('����');
  else dbms_output.put_line('��');
  end if;
end;  


--����Ϊ¼��ģ� &������  ��  & ȡֵ��  ���û�¼�룩
--¼��һ�����֣��ж�������
declare
  num number := &inputnum;
begin
  if num>0 then dbms_output.put_line('��');
  elsif num<0 then dbms_output.put_line('��');
  else dbms_output.put_line('��');
  end if;
end;


--ѭ�����
/*(�﷨)
loop
exit when ������
end loop;
*/

declare
  num number := & n ;
begin
  loop
  dbms_output.put_line(concat('����:',num));
  exit when num=0;
  num:= num-1; 
  end loop;
end;


--�α�  (�൱�ڲ�ѯ���Ľ����)    ��ʽ��   cousor �α��� is ��ѯ��䣻
--��ѯԱ������ ������50��
declare
  cursor c is select last_name from employees where employee_id=198;
  name employees.last_name%type;  --��������Ϊ��ĳ���ֶ���ͬ��������:������������  --��ʽ:������  ����.�ֶ���%type;
begin
  open c;         --�����α꣺  ִ��sql��䣬�������c��         
    loop          --ѭ�����������c��Ԫ��
    fetch c into name;      --��������е����� �������name��
    exit when c%notfound;   --��c��û����Ҫ����������ʱѭ������
    dbms_output.put_line(name);
    end loop;
  close c;        --�ر��α�
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

--���������α�
--��ѯ�û�ָ�����ŵ�Ա��
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
    dbms_output.put_line('������'||last_name||'       ���ʣ�'||salary||'    ���ţ�'||deptno);
    end loop;
  close c;
end;

--  �ܲ�AC_MGR ������1000   ����MK_MAN ������800   ���� 400 
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

--�����洢����
--����id��ѯ�û���������
--�洢������  selById  �൱�ڷ���
--  ����
create or replace procedure selById(empid in employees.employee_id%type,name out employees.last_name%type,
                      sal out employees.salary%type)
as
begin
  select last_name,salary into name,sal from employees where employee_id=empid;
end;


--�Դ洢���̵���
declare 
--����2������
  name employees.last_name%type;
  sal employees.salary%type;
begin
--���ݴ洢���̵����ֵ���  ����ʱ������Ҳ��Ҫ���в�������
 selById(198,name,sal);
 dbms_output.put_line(name||sal);
end;









