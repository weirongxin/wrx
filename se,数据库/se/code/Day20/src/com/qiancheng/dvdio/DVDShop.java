package com.qiancheng.dvdio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DVDShop {
	//���� dvd��������
	private ArrayList<DVD> dvds = new ArrayList<DVD>();
	//���� dvd��Ϣ�ļ�
	public static final String DVD_FILE = "file\\dvd.txt";
	
	//�Ǿ�̬����飬��dvd�������Ը���ʼֵ
	{
		//��������ļ�   ����ļ��ж�ȡ����
		if(exitFile()){
			dvds = readFile();
		}else{
			//�ļ�������  ����ӳ�ʼdvd����
			DVD dvd1 = new DVD("�������", "δ���", 1);
			DVD dvd2 = new DVD("�������", "δ���", 1);
			DVD dvd3 = new DVD("��������", "δ���", 1);
			dvds.add(dvd1);
			dvds.add(dvd2);
			dvds.add(dvd3);
		}
	}
	//���dvd
	public void addDvd(DVD dvd){
		dvds.add(dvd);
	}
	//�ж��Ƿ����dvd
	public boolean exitDvd(DVD dvd){
		return dvds.contains(dvd);
	}
	//���dvd
	public boolean borrowDvd(DVD dvd){
		boolean status = true;
		//����Ҫ��Ĳ���dvd�Ӽ�����ȡ��
		DVD getDVD= null;
		for(DVD d:dvds){
			//�ж��Ƿ����������ͬ ��״̬Ϊδ�����dvd
			if(d.getName().equals(dvd.getName())&&d.getStatus().equals("δ���")){
				getDVD = d;
				break;
			}
		}
		//�ж��Ƿ��и�dvd���ж��Ƿ��Ѿ�����ˡ�
		if(getDVD==null){
			status = false;
		}else{
			getDVD.setStatus("�ѽ��");
		}
		return status;
	}
	//�黹
	public boolean backDVD(DVD dvd){
		boolean status = true;
		DVD getDVD = null;
		for(DVD d:dvds){
			if(d.getName().equals(dvd.getName()) && d.getStatus().equals("�ѽ��")){
				getDVD = d;
				break;
			}
		}
		if(getDVD==null){
			status = false;
		}else{
			getDVD.setStatus("δ���");
		}
		return status;
	}
	//�������ɾ��dvd
	public boolean delDVD(int index){
		boolean status = true;
		//���dvd��ų���dvd������ɾ��ʧ��
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
	//�ж��ļ��Ƿ����
	public boolean exitFile(){
		File file = new File(DVD_FILE);
		return file.exists();
	}
	//����ǰdvd����д���ļ���
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
	//д�ļ�
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
