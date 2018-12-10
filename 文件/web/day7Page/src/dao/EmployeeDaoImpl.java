package dao;

import java.sql.*;
import java.util.*;
import bean.Employee;
import common.DBUtil;

public class EmployeeDaoImpl extends DaoImpl implements EmployeeDao {

	/**
	 * 查询员工表中员工的数量
	 */
	@Override
	public int queryEmployeeCount() {
		Connection con = DBUtil.getConn();
		int sum = 0;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(
					"select count(employee_id) from employees");
			while(rs.next()){
				sum = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(con);
		}
		return sum;
	}

	/*
	 *根据需要查询的页面 和 一页显示的记录数量  查询
	 */
	@Override
	public List<Employee> queryEmpByPage(int page, int pageSize) {
		String sql = "select employee_id,last_name,email "
					+"from (select rownum r,employee_id,last_name,email"
							+" from(select employee_id,last_name,email "
									+ "from employees)"
					+")where r>=? and r<=?";
		//计算起始行号、结束行号
		int startRow = (page-1)*pageSize+1;
		int endRow =startRow+pageSize-1;
		//调用父类中 实现的共通查询方法，查询当前范围的员工信息
		List<Employee> lists = query(sql, Employee.class, startRow,endRow);
		return lists;
	}

}
