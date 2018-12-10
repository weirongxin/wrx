package com.wanghua.dvd;

public class Shop {
	private DVD[] dvds;
	
	// 动态代码块     给对象的属性赋初始值
	{
		dvds = new DVD[6];
		DVD d1 = new DVD("罗马假日");
		DVD d2 = new DVD("风声鹤唳");
		DVD d3 = new DVD("浪漫满屋");
		dvds[0] = d1;
		dvds[1] = d2;
		dvds[2] = d3;	
	}
	public Shop(){
		
	}
	public DVD[] getDvds() {
		return dvds;
	}
	
	/**
	 * 新增DVD
	 * @param d
	 * @return 1：添加成功 0：已经存在 -1：仓库满
	 */
	public int addNewDvd(String name){
		int dvdCount = 0;
		//判断是否存在
		for(int n = 0;n<dvds.length;n++) {
			DVD d = dvds[n];
			if(d!=null&&d.getName() == name){
				return 0;
			}
			//计算 dvd数量
			if(d!=null){
				dvdCount++;
			}
		}
		//判断是否满仓
		if(dvdCount==dvds.length)
			return -1;
		else{
			//将dvd插入 空位置
			for(int n = 0;n<dvds.length;n++) {
				DVD d = dvds[n];
				if(d==null){
					DVD newDvd = new DVD(name);
					dvds[n] = newDvd;
					return 1;
				}
			}
		}
		return 0;
	}
	 
	/**
	 * 删除DVD
	 * @param name
	 * @return
	 */
	public boolean delDvd(String name){
		boolean status = false;
		//将要删除的 dvd对象 赋值为null
		for(int n = 0;n<dvds.length;n++) {
			DVD d = dvds[n];
			if(d!=null&&d.getName().equals(name)&&d.getState()==1){
				dvds[n] = null;
				status = true;
			}
		}
		//如果 已经删除dvd对象 则null对象 往后挪
		if(status){
			DVD[] temp = new DVD[6];
			int count = 0;
			for(int n = 0;n<dvds.length;n++) {
				if(dvds[n] !=null){
					temp[count] = dvds[n];
					count++;
				} 
			}
			dvds = temp;
		}
		return status;
	}
	/**
	 * 借 DVD
	 * @param name
	 * @return
	 */
	public boolean borrowDvd(String name) {
		DVD d = isExitDvd(name);
		if(d!=null){
			if(d.canBorrow()) {
				d.borrowDvd();	
				return true;
			}
		}
		return false;
	}
	/**
	 * 归还DVD
	 * @param name
	 */
	public boolean backDvd(String name) {
		DVD d = isExitDvd(name);
		if(d!=null){
			d.backDvd();
			return true;
		}
		return false;
	}
	/**
	 * 是否存在同名dvd
	 * @param name
	 * @return
	 */
	public DVD isExitDvd(String name) {
		for(int n = 0;n<dvds.length;n++) {
			DVD d = dvds[n];
			if(d!=null&&d.getName().equals(name)){
				return d;
			}
		}
		return null;
	}
}
