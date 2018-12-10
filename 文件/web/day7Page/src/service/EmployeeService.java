package service;

import java.util.List;

import bean.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

public class EmployeeService {
	EmployeeDao dao = new EmployeeDaoImpl();
	//取所有员工数量
	public int queryEmployeeSum(){
		return dao.queryEmployeeCount();
	}
	//按照页数查询员工数据
	public List<Employee> queryByPage(int page,int pageSize){
		return dao.queryEmpByPage(page, pageSize);
	}
}
