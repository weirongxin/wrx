package dao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.*;
import common.DBUtil;

public class DaoImpl implements Dao {

	/**
	 * 根据sql语句和可变参数
	 * 执行数据库的DML操作
	 */
	@Override
	public void update(String sql, Object... args) {
		Connection con = DBUtil.getConn();
		try {
			PreparedStatement st = con.prepareStatement(sql);
			if(args!=null){
				for(int i = 0;i<args.length;i++){
					st.setObject(i+1, args[i]);
				}
			}
			st.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(con);
		}
	}
	/**
	 * 数据库共通的查询功能
	 */
	@Override
	public <T> List<T> query(String sql, Class<T> clazz, Object... args) {
		List<T> list = new ArrayList<T>();
		Connection con = DBUtil.getConn();
		try {
			//给查询语句 预编译，将可变参数赋值到操作对象中
			PreparedStatement st = con.prepareStatement(sql);
			if(args!=null){
				for(int i=0;i<args.length;i++){
					st.setObject(i+1, args[i]);
				}
			}
			//执行查询操作  将查询结果赋值给ResultSet对象
			ResultSet rs = st.executeQuery();
			//解析查询结果：
			//1.获取查询结果中的字段数据
			ResultSetMetaData rsmd = rs.getMetaData();
			//2.获取查询到的字段的数量
			int colCount = rsmd.getColumnCount();
			
			//3.遍历结果集中的数据
			while(rs.next()){
				//4.根据参数的类型指定 通过newInstance 方法自动调用无参构造实例化对象
				//使用到了无参构造方法
				T t = clazz.newInstance();
				//遍历每个字段
				for(int i = 0;i<colCount;i++){
					//5.从字段数据中获取字段的名字
					String colName = rsmd.getColumnName(i);
					//6.转换为set访问器的赋值方法(拼接set方法的方法名)
					String colMethod = "set"
							+colName.substring(0, 1).toUpperCase()
							+colName.substring(1);
					//7.获取属性类型 (从类中根据参数名字获取属性类型Field)
					//getDeclaredField 根据属性名字获取 生成的属性Field对象
					Field f = clazz.getDeclaredField(colName);
					
					//8.从结果集中 获取字段名对应的数据
					Object obj = rs.getString(colName);
					//9.根据类构造方法 （通过方法名、方法的类型 获取类中的方法） 
					Method method = clazz.getDeclaredMethod(colMethod, f.getType());
					
					//10.通过method类型将 参数数据传入对象中
					//param1:当前对象  param2：当前字段
					method.invoke(t, String.valueOf(obj));
				}
				//将对象添加到集合中
				list.add(t);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(con);
		}
		return list;
	}

}
