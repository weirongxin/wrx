package com.wanghua.dvd;

public class User {
	TitleInformation info = new TitleInformation();
	Shop shop = new Shop();
	/**
	 * �û�ѡ�� �������� ��ʾ��ʾ��Ϣ
	 * @param status
	 * @return  ����ֵ��0���������   1�����빦����ȷ ��Ҫ�����������   -1���˳���ǰϵͳ
	 */
	public int userSelectStatus(int status) {
		switch (status) {
		case 1://����
			info.showAddTitle();			
			return 1;
		case 2://�鿴
			info.showLookTitle();
			return 1;
		case 3://ɾ��
			info.showDelTitle();
			return 1;
		case 4://���
			info.showBorrowTitle();
			return 1;
		case 5://�黹
			info.showBackTitle();
			return 1;
		case 6://�˳�
			return -1;
			default:
			{
				System.out.println("ѡ���ܲ�����,����������");
				return 0;
			}
		}
	}
	/**
	 * �����û�ѡ���������
	 * @param status
	 * @param dvdName
	 * @return
	 */
	public void userSelectFunc(int status,String dvdName){
		switch (status) {
		case 1://����
			addNew(dvdName);
			break;
		case 3://ɾ��
			if(!shop.delDvd(dvdName)){
				info.delError();
			}else{
				info.delSuccess();
			}
			break;
		case 4://���
			if(!shop.borrowDvd(dvdName)){
				info.borrowError();
			}else{
				info.borrowSucccess();
			}
			break;
		case 5://�黹
			if(shop.backDvd(dvdName)){
				info.backSucccess();
			}else{
				info.backError();
			}
			break;
		}
	}
	/**
	 * ִ������� DVD ���� ����ִ�н�� ��ӡ�����Ϣ
	 * @param dvdName
	 * @return
	 */
	public boolean addNew(String dvdName){
		//���ִ�гɹ�
		if(shop.addNewDvd(dvdName)==1){
			info.addDvdSuccess(dvdName);
			return true;
		//����ʧ�� ����ͬ��
		}else if(shop.addNewDvd(dvdName)==0){
			info.exitDvdFailed(dvdName);
		//����ʧ�� ����
		}else{
			info.exitDvdOver(dvdName);
		}
		return false;
	}
	/**
	 * �鿴dvd��Ϣ
	 */
	public void showDVDListInfo(){
		info.showDvdInfo(shop.getDvds());
	}
	 
}
