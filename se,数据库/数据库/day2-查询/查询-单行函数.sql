--单行函数
--1.LOWER UPPER 字母转换大小写、
select lower(ename)
from emp;
--2.INITCAP 单词首字母转换大写
select Initcap(ename)
from emp;
--3.concat 拼接: “员工号： 姓名：”
select Concat(concat('员工号:',empno), concat(' 姓名:',ename))
from emp;
--4.SUBSTR 取子串 参数1：数据源字段  参数2：起始位置 参数3：长度
select Substr(ename,3,2)
from emp;
--5.length 取字符串长度
select Length(ename)
from emp;
--6.INSTR 查找子串位置 (参数1 为数据源   参数2 为查找参数，找不到结果为0)
select Instr(ename,'W')
from emp;
--7.填充字符串 LPAD RPAD
select Lpad(ename, 10)
from emp;
select Lpad(ename,10,'a')
from emp;
--8.修剪字符串 TRIM  LTRIM RTRIM
select Rtrim(ename, 'D')
from emp;
select ltrim('   aa  ',' ')
from dual;
select rtrim(' aa   ',' ')
from dual;
select trim('  a  a ')||'1'
from dual;
--9.replace 替换子串,param1:数据源字段 param2：被替换字符串 param3：新字符
select Replace(ename,'W','*')
from emp;
--10.trunc:	 截断  round: 四舍五入
--param2：是指将小数点后保留几位
select Trunc(15.123456,2)
from dual;
select Round(15.123456789,4) 
from dual;
--11.时间函数 sysdate  取当前系统时间
select sysdate
from dual;
--12.months_between 返回两个日期间隔多少个月
select Months_Between
       (To_Date('02-02-1995','MM-DD-YYYY'),
        To_Date('01-01-1995','MM-DD-YYYY') )
from dual;
select Months_Between(to_date('2018-10-26','YYYY-MM-DD'),
                      to_date('2018-08-02','YYYY-MM-DD'))
from dual;                      
--13.add_months 当前日期加减月份
select add_months(to_date('2018-06-25','YYYY-MM-DD'),12)
from dual;
--14.
/*
next_day
返回以指定日期为准，下一个最近的星期几的日期
last_day
返回指定日期的月最后一天的日期
*/
select Next_Day(to_date('2018-08-02','YYYY-MM-DD'),5)  
from dual;
select Last_Day(Sysdate)
from dual;
--15.通用函数 nvl 获取参数中第一个不为null的数据
select nvl(null,'aaa')
from dual;
--nvl2  参数1为空 返回参数3，不为空 返回参数2
select Nvl2('0', 'a','b') as "结果"
from dual;
--nullif 判断参数 中元素是否为空值（参数1不为空，参数2可以为空）
select Nullif('a', 'b')
from dual;
--coalesce 查找第一个不为空的元素
select Coalesce(null, null, null,null,null,'c','d')
from dual;
--查询员工的工资总数
select nvl2(comm,sal+comm,sal) as "工资总数"
from emp;
--16.case表达式
--查询部门中的所有员工，20涨薪1.1倍 30涨薪1.2倍
select empno,ename,deptno,sal,
case deptno when 20 then sal*1.1
            when 30 then sal*1.2
else sal
end "涨薪"
from emp;

select empno,ename,deptno,sal,
decode(deptno,20,sal*1.1,30,sal*1.2,sal)
from emp;
--小结单行函数：
/*
  字符串相关:lower Upper Initcap concat substr length instr
  操作：Lpad Rpad trim Ltrim Rtrim replace
  数字：round trunc
  时间：sysdate months_between add_months last_day next_day
  是否为空：nvl nvl2 nullif Coalesce
  case语句：按筛选的字段范围操作
  decode函数
  */

