package com.wanghua.dvd;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//用户录入
		Scanner scan = new Scanner(System.in);
		//布尔型变量exit  是否 退出当前DVD系统 （用户录入6时 ）
		boolean exit = false;
		
		//实例化 提示信息对象
		TitleInformation info = new TitleInformation();
		//实例化用户对象
		User user = new User();
		
		while(!exit){
			//布尔型变量selectFun  是否回到初始选择功能状态
			boolean selectFun = false;
			do{
				
				//显示 音像店欢迎、功能选择提示信息
				info.showTitle();
				//提示用户输入 选项
				info.showInputTitle();
				
				//用户输入功能选项
				int userSelect = scan.nextInt();
				//根据用户录入功能选项 调用相应功能
				int status = user.userSelectStatus(userSelect);
				
				//用户输入功能 不在 1-6范围内 
				if(status ==0){
					selectFun = true;
				//用户输入6  需要 退出当前DVD系统
				}else if(status == -1){
					exit = true;
					break;
				}else{
				//用户输入功能在1-5之间  可以正常调用  则进行后续的参数输入
					if(userSelect == 2){
						user.showDVDListInfo();
						//输入0 返回
						backInit(info,scan);
					}else{
						String dvdName = scan.next();
						user.userSelectFunc(userSelect, dvdName);
						//输入0 返回
						backInit(info,scan);
					}
					selectFun = true;
				}
			}while(selectFun);
			
		}
		
		scan.close();
	}
	/**
	 * 输入0 返回
	 * @param info
	 * @param scan
	 */
	public static  void backInit(TitleInformation info,Scanner scan){
		//输入0结束
		boolean back = false;
		while(!back) {
			info.showBackInitTitle();
			int n = scan.nextInt();
			if(n==0) {
				back = true;
			}
		}
	}
}
