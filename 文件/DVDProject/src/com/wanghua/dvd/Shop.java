package com.wanghua.dvd;

public class Shop {
	private DVD[] dvds;
	
	// ��̬�����     ����������Ը���ʼֵ
	{
		dvds = new DVD[6];
		DVD d1 = new DVD("�������");
		DVD d2 = new DVD("�������");
		DVD d3 = new DVD("��������");
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
	 * ����DVD
	 * @param d
	 * @return 1����ӳɹ� 0���Ѿ����� -1���ֿ���
	 */
	public int addNewDvd(String name){
		int dvdCount = 0;
		//�ж��Ƿ����
		for(int n = 0;n<dvds.length;n++) {
			DVD d = dvds[n];
			if(d!=null&&d.getName() == name){
				return 0;
			}
			//���� dvd����
			if(d!=null){
				dvdCount++;
			}
		}
		//�ж��Ƿ�����
		if(dvdCount==dvds.length)
			return -1;
		else{
			//��dvd���� ��λ��
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
	 * ɾ��DVD
	 * @param name
	 * @return
	 */
	public boolean delDvd(String name){
		boolean status = false;
		//��Ҫɾ���� dvd���� ��ֵΪnull
		for(int n = 0;n<dvds.length;n++) {
			DVD d = dvds[n];
			if(d!=null&&d.getName().equals(name)&&d.getState()==1){
				dvds[n] = null;
				status = true;
			}
		}
		//��� �Ѿ�ɾ��dvd���� ��null���� ����Ų
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
	 * �� DVD
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
	 * �黹DVD
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
	 * �Ƿ����ͬ��dvd
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
