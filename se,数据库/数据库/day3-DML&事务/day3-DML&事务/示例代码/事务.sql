--������� 
insert into stu(stuinfo_id,stuinfo_name)
values(9,'����');
savepoint a;

update stu set stuinfo_name='С����'
where stuinfo_id = 9;
savepoint b;

insert into stu(stuinfo_id,stuinfo_name)
values(10,'����');
savepoint c;

delete from stu
where stuinfo_id=10;
--�ع��������c
rollback to c;
rollback to a;
rollback;
merge into stu s1
using tab_stuinfo s2
on(s1.stuinfo_id = s2.stuinfo_id)
when matched then 
update set s1.stuinfo_name = s2.stuinfo_name,
           s1.stuinfo_sex = s2.stuinfo_sex,
           s1.stuinfo_class = s2.stuinfo_class,
           s1.stuinfo_tel = s2.stuinfo_tel
when not matched then
insert values(s2.stuinfo_id,s2.stuinfo_name,
  s2.stuinfo_sex,s2.stuinfo_tel,s2.stuinfo_class);
  commit;