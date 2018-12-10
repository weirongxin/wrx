--PLSQL
--1.�������num��ֵ���͸�ֵ123 ���
declare
  --��������
  num number:=123;
begin
  --���ܴ��루��ӡ�����
  dbms_output.put_line(num);
end;
--2.if��� 
--����������жϸ���ֵ������ �������������ֵС��0 �����������
declare
  num number:=-10;
begin
  if num>0 then dbms_output.put_line('����');
  elsif num<0 then dbms_output.put_line('����');
  else dbms_output.put_line('��');
  end if;
end;
--����Ϊ¼��ģ�&������
--¼��һ�����֣��ж�������
declare
  num number:=&inputnum;
begin
  if num>0 then dbms_output.put_line('����');
  elsif num<0 then dbms_output.put_line('����');
  else dbms_output.put_line('��');
  end if;
end;
--ѭ�����
--ѭ������1-10�������
declare
  num number:=&n;
begin
  loop
    dbms_output.put_line('���֣�'||num);
  exit when num=0;
    num := num-1;
  end loop;
end;
--�α� �൱�ڲ�ѯ��估�����
--��ѯ Ա������Ա����198Ա������
declare
  cursor c is select last_name from employees 
                        where employee_id=198;
  --��������Ϊ��ĳ���ֶ���ͬ�������ͣ���������
  --������ ��.�ֶ���%type;
  name employees.last_name%type;
begin
  --���αִ꣬��sql��䣬�������c��
  open c;
    --ѭ�����������c�е�Ԫ��
    loop
      --��������е����� ����name������
      fetch c into name;
      --��c��û����Ҫ����������ʱѭ������
      exit when c%notfound;
      --��ӡ�����������
      dbms_output.put_line(name);
    end loop;
  close c;
end;
--���������α�
--��ѯ�û�ָ�����ŵ�Ա�� ���������ʡ����ź�
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
      dbms_output.put_line('����:'||name||' ���� '||sal||' ���ź� '||deptno);
    end loop;
  close c;
end;
--�ǹ���  �ܲ�1000������800������400
--���̶���Ա���ǹ���(��¼���Ա������ǹ���1��)
--�ܲ�AC_MGR  ����MK_MAN
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
--�����洢���̣��洢���̴����൱�ڹ��ܵķ�װ��
--�����洢���̲�ѯ ����id��ѯ�û���������
--�洢��������selById  �൱�ڷ���
--     ������in  out ������κͳ���
--     ����1��empid Ա����  ����-������2��Ա������  ����3������
create or replace procedure selById(
      empid in employees.employee_id%type,
      name out employees.last_name%type,
      sal out employees.salary%type) 
as
begin
  --�洢���̵Ĺ��ܣ�����id��ѯԱ����������
  select last_name,salary into name,sal from employees where employee_Id=empid;
end;

--�Դ洢���̵ĵ��� �����Ʒ����ĵ��ã�   
declare
  --�����������������ڴ洢�Ӵ洢�����л�ȡ���������ݣ�
  name employees.last_name%type;
  sal employees.salary%type;
begin
  --���ݴ洢���̵����ֵ��ô洢����,����ʱ������Ҳ��Ҫ���в�������
  selById(198,name,sal);
  --�洢���̵�����ɺ󣬴���ĳ��α����Ѿ�������ֵ�����Դ�ӡ
  dbms_output.put_line(name||sal);
end;

