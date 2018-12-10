package dao;

import java.util.List;
import bean.Employee;

public interface EmployeeDao {
	//查询员工表中员工的数量
	public abstract int queryEmployeeCount();
	
	//分页查询员工 根据查询的页数和一页显示的行数
	public abstract List<Employee> queryEmpByPage(int page,int pageSize);
	
	//以名字模糊查询  存在的员工数量
	public abstract int queryByNameCount(String name);
	//分页查询、按照员工名字筛选
	public abstract List<Employee> queryEmpByNamePage(int page,int pageSize,String empName);

	
}
