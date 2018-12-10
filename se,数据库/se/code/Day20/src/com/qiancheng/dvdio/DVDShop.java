package com.qiancheng.dvdio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DVDShop {
	//定义 dvd集合属性
	private ArrayList<DVD> dvds = new ArrayList<DVD>();
	//定义 dvd信息文件
	public static final String DVD_FILE = "file\\dvd.txt";
	
	//非静态代码块，对dvd集合属性赋初始值
	{
		//如果存在文件   则从文件中读取数据
		if(exitFile()){
			dvds = readFile();
		}else{
			//文件不存在  则添加初始dvd数据
			DVD dvd1 = new DVD("罗马假日", "未借出", 1);
			DVD dvd2 = new DVD("风声鹤唳", "未借出", 1);
			DVD dvd3 = new DVD("浪漫满屋", "未借出", 1);
			dvds.add(dvd1);
			dvds.add(dvd2);
			dvds.add(dvd3);
		}
	}
	//添加dvd
	public void addDvd(DVD dvd){
		dvds.add(dvd);
	}
	//判断是否存在dvd
	public boolean exitDvd(DVD dvd){
		return dvds.contains(dvd);
	}
	//借出dvd
	public boolean borrowDvd(DVD dvd){
		boolean status = true;
		//将需要借的参数dvd从集合中取出
		DVD getDVD= null;
		for(DVD d:dvds){
			//判断是否存在名字相同 且状态为未借出的dvd
			if(d.getName().equals(dvd.getName())&&d.getStatus().equals("未借出")){
				getDVD = d;
				break;
			}
		}
		//判断是否有该dvd、判断是否已经借出了、
		if(getDVD==null){
			status = false;
		}else{
			getDVD.setStatus("已借出");
		}
		return status;
	}
	//归还
	public boolean backDVD(DVD dvd){
		boolean status = true;
		DVD getDVD = null;
		for(DVD d:dvds){
			if(d.getName().equals(dvd.getName()) && d.getStatus().equals("已借出")){
				getDVD = d;
				break;
			}
		}
		if(getDVD==null){
			status = false;
		}else{
			getDVD.setStatus("未借出");
		}
		return status;
	}
	//根据序号删除dvd
	public boolean delDVD(int index){
		boolean status = true;
		//如果dvd序号超出dvd数量、删除失败
		if(dvds.size()<index){
			status = false;
		}else{
			dvds.remove(index);
		}
		return status;
	}
	
	public ArrayList<DVD> getDvds() {
		return dvds;
	}
	public void setDvds(ArrayList<DVD> dvds) {
		this.dvds = dvds;
	}
	//判断文件是否存在
	public boolean exitFile(){
		File file = new File(DVD_FILE);
		return file.exists();
	}
	//将当前dvd集合写到文件中
	public ArrayList<DVD> readFile(){
		ArrayList<DVD> dvds = null;
		File file = new File(DVD_FILE);
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(file));
			Object obj = in.readObject();
			dvds = (ArrayList<DVD>)obj;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(in!=null){
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dvds;
	}
	//写文件
	public void writeFile(){
		File file = new File(DVD_FILE);
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(dvds);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
