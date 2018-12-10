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
	//根据名字模糊查询 获取员工数量
	public int queryCountByName(String name){
		return dao.queryByNameCount(name);
	}
	//按照名字筛选后 按照页数查询员工数据
	public List<Employee> queryByNameByPage(int page,int pageSize,String empName){
		return dao.queryEmpByNamePage(page, pageSize, empName);
	}
}
