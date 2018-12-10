package com.qiancheng.work1;

import java.io.File;
import java.io.FileFilter;

/*
���°�����ר���е� �ļ��� �����޸ģ�
  ���磺
  �°����Ӵ���1_������������_001.txt-->�°����Ӵ���1_001.txt
  �°����Ӵ���1_������������_002.txt-->�°����Ӵ���1_002.txt
 */
public class Work1 {

	public static void main(String[] args) {
		File file = new File("D:\\Java1803\\SE\\day19-�ļ���IO\\��ҵ\\�°�����ר��");
		File[] files = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				//ȡ�ļ��ĸ�·��
				String parentPath = pathname.getParent();
				//ȡ�ļ���
				String fileName = pathname.getName();
				//�����»��� ����ļ���
				String[] fileStr =  fileName.split("_");
				//�����ַ������塢ƴ�����ļ�����
				if(fileStr!=null && fileStr.length>=3){
					StringBuffer newName = new StringBuffer();
					newName.append(fileStr[0]);
					newName.append("_");
					newName.append(fileStr[2]);
					//�޸��ļ���
					pathname.renameTo(new File(parentPath+"\\"+newName.toString()));
				}
				
				return true;
			}
		});
		for(File f:files){
			System.out.println(f.getName());
		}
	}

}
