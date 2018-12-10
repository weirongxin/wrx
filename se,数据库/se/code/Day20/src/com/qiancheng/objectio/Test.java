package com.qiancheng.objectio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		write();
		read();
	}
	public static void read(){
		File f = new File("file\\data.txt");
		if(!f.exists()){
			return;
		}
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(f));
			Object obj = in.readObject();
			if(obj instanceof List){
				ArrayList<Student> stus = (ArrayList<Student>)obj;
				System.out.println(stus);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
		
	}
	public static void write(){
		//1.����ѧ�����󼯺�
		ArrayList<Student> stus = new ArrayList<Student>();
		stus.add(new Student("xiaoming","F",19));
		stus.add(new Student("xiaoming2","M",18));
		stus.add(new Student("xiaoming3","F",13));
		//2.����·��ʵ�����ļ�����
		File f = new File("file\\data.txt");
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//3.����������
		ObjectOutputStream out = null;
		try {
			//4.����������
			out = new ObjectOutputStream(new FileOutputStream(f));
			//5.�����϶���ͨ�����������д���ļ�
			out.writeObject(stus);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
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
