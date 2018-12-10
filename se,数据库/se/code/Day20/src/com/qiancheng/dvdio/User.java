package com.qiancheng.dvdio;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
	public static Scanner scanner  = new Scanner(System.in);
	public DVDShop shop = new DVDShop();
	public static void main(String[] args) {
		System.out.println("欢迎使用迷你DVD管理器");
		User user = new User();
		while(true){
			System.out.println("1.新增DVD");
			System.out.println("2.查看DVD");
			System.out.println("3.删除DVD");
			System.out.println("4.借出DVD");
			System.out.println("5.归还DVD");
			System.out.println("6.退出DVD");
			int sel = scanner.nextInt();
			switch (sel) {
			case 1:
				user.addNewDVD();
				break;
			case 2:
				user.lookAll();
				break;
			case 3:
				user.delDvd();
				break;
			case 4:
				user.borrowDvd();
				break;
			case 5:
				user.backDVD();
				break;
			case 6:
				user.outDVD();
				break;
			default:
				System.out.println("选择错误，请重新选择！");
				break;
			}
		}		
	}
	public void addNewDVD(){
		System.out.println("请录入新增DVD的名字：");
		String dvdName = scanner.next();
		DVD dvd = new DVD(dvdName, "未借出", 1);
		shop.addDvd(dvd);
		System.out.println("新增DVD成功");
	}
	public void lookAll(){
		System.out.println("序号\t状态\t名称\t");
		//从音像店中获取dvd集合
		ArrayList<DVD> dvds = shop.getDvds();
		//遍历得到的dvd集合，每个元素遍历打印
		for(int i = 0;i<dvds.size();i++){
			DVD d = dvds.get(i);
			System.out.println((i+1)+"\t"+d.getStatus()+"\t"+d.getName());
		}
	}
	//删除dvd操作
	public void delDvd(){
		System.out.println("请选择需要删除的DVD的序号：");
		//显示所有的dvd数据
		lookAll();
		//录入需要删除的序号
		int selectIndex = scanner.nextInt();
		//调用音像店中的删除方法 判断结果是否是成功删除状态
		boolean delStatus = shop.delDVD(selectIndex-1);
		if(delStatus){
			System.out.println("删除DVD成功!");
		}else{
			System.out.println("删除失败！");
		}
	}
	//借出DVD
	public void borrowDvd(){
		System.out.println("请录入需要借的dvd名字");
		String dvdName = scanner.next();
		//根据名字 从音像店集合中根据名字获取dvd
		boolean status = shop.borrowDvd(new DVD(dvdName, "", 1));
		if(status){
			System.out.println("借出成功！");
		}else{
			System.out.println("借出失败！");
		}
	}
	//归还DVD
	public void backDVD(){
		System.out.println("请输入归还的DVD的名字");
		//录入dvd的名字
		String dvdName = scanner.next();
		//调用音像店方法  归还指定名字的dvd
		boolean status = shop.backDVD(new DVD(dvdName, "", 1));
		if(status){
			System.out.println("归还成功！");
		}else{
			System.out.println("归还失败！");
		}
	}
	//推出dvd系统  退出之前，将集合同步到文件中 数据持久化
	public void outDVD(){
		shop.writeFile();
		System.exit(0);
	}
}
