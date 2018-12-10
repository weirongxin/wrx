package dao;

import java.util.List;
import bean.Employee;

public interface EmployeeDao {
	//查询员工表中员工的数量
	public abstract int queryEmployeeCount();
	
	//分页查询员工 根据查询的页数和一页显示的行数
	public abstract List<Employee> queryEmpByPage(int page,int pageSize);
	
}
