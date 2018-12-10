package com.wanghua.dvd;

public class TitleInformation {
	/**
	 * 影碟店 打印功能信息
	 */
	public void showTitle(){
		System.out.println("欢迎使用迷你DVD管理器");
		System.out.println("-------------------------");
		System.out.println("1.新增DVD");
		System.out.println("2.查看DVD");
		System.out.println("3.删除DVD");
		System.out.println("4.借出DVD");
		System.out.println("5.归还DVD");
		System.out.println("6.退出DVD");
		System.out.println("-------------------------");
	}
	public void showDvdInfo(DVD[] dvds) {
		System.out.println("序号\t状态\t名称\t\t借出日期\t借出次数");
		for(int n = 0;n<dvds.length;n++) {
			DVD d = dvds[n];
			if(d == null)
				break;
			System.out.print(n+1);
			System.out.print("\t"+d.getState());
			System.out.print("\t"+d.getName());
			System.out.print("\t\t"+d.getDate());
			System.out.print("\t"+d.getCount());
			System.out.println("");
		}
		System.out.println("**************************");
	}
	/**
	 * “请选择”提示信息
	 */
	public void showInputTitle(){
		System.out.print("请选择：");
	}
	/**
	 * “输入0返回”提示信息
	 */
	public void showBackInitTitle(){
		System.out.print("输入0返回");
	}
	/**
	 * 新增DVD提示信息
	 */
	public void showAddTitle(){
		System.out.println("-->新增DVD");
		System.out.println("**************************");
		System.out.println("请输入新增DVD的名字");
	}
	/**
	 * 查看DVD提示信息
	 */
	public void showLookTitle(){
		System.out.println("-->查看DVD");
		System.out.println("**************************");
	}
	/**
	 * 删除DVD提示信息
	 */
	public void showDelTitle(){
		System.out.println("-->删除DVD");
		System.out.println("**************************");
		System.out.println("请输入删除DVD的名字");
	}
	/**
	 * 借出DVD提示信息
	 */
	public void showBorrowTitle(){
		System.out.println("-->借出DVD");
		System.out.println("**************************");
		System.out.println("请输入借出DVD的名字");
	}
	/**
	 * 归还DVD提示信息
	 */
	public void showBackTitle(){
		System.out.println("-->归还DVD");
		System.out.println("**************************");
		System.out.println("请输入归还DVD的名字");
	}
	/**
	 * 新增成功
	 */
	public void addDvdSuccess(String name){
		System.out.println("新增DVD"+name+"成功");
		System.out.println("**************************");
	}
	/**
	 * 新增失败 已经存在该dvd
	 */
	public void exitDvdFailed(String name){
		System.out.println("新增DVD"+name+"失败！已经存在该DVD");
		System.out.println("**************************");
	}
	/**
	 * 新增失败 仓库已满
	 */
	public void exitDvdOver(String name){
		System.out.println("新增DVD"+name+"失败！ 仓库已满");
		System.out.println("**************************");
	}
	/**
	 * 操作失败提示
	 */
	public void inputError(){
		System.out.println("操作失败，请重新输入");
	}
	/**
	 * 正在借出不能删除
	 */
	public void delError(){
		System.out.println("正在借出 不能删除");
	}
	/**
	 * 删除成功
	 */
	public void delSuccess(){
		System.out.println("删除成功");
	}
	/**
	 * 已经借出
	 */
	public void borrowError(){
		System.out.println("借出失败");
	}
	/**
	 * 借出成功
	 */
	public void borrowSucccess(){
		System.out.println("借出成功");
	}
	/**
	 * 归还失败
	 */
	public void backError(){
		System.out.println("归还失败");
	}
	/**
	 * 归还成功
	 */
	public void backSucccess(){
		System.out.println("归还成功");
	}
}
