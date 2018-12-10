package dao;

import java.util.List;

public interface Dao {
	//DML共通操作
	public abstract void update(String sql,Object ...args);
	//查询操作			共通的查询操作param1:sql语句  param2:类的类型  param3:sql中的参数（可变）
	public abstract <T> List<T> query(String sql,Class<T> clazz,Object ...args);
}
