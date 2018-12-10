package com.wanghua.dvd;

public class User {
	TitleInformation info = new TitleInformation();
	Shop shop = new Shop();
	/**
	 * 用户选择 操作功能 显示提示信息
	 * @param status
	 * @return  返回值：0：输入错误   1：输入功能正确 需要传入后续参数   -1：退出当前系统
	 */
	public int userSelectStatus(int status) {
		switch (status) {
		case 1://新增
			info.showAddTitle();			
			return 1;
		case 2://查看
			info.showLookTitle();
			return 1;
		case 3://删除
			info.showDelTitle();
			return 1;
		case 4://借出
			info.showBorrowTitle();
			return 1;
		case 5://归还
			info.showBackTitle();
			return 1;
		case 6://退出
			return -1;
			default:
			{
				System.out.println("选择功能不存在,请重新输入");
				return 0;
			}
		}
	}
	/**
	 * 根据用户选择操作功能
	 * @param status
	 * @param dvdName
	 * @return
	 */
	public void userSelectFunc(int status,String dvdName){
		switch (status) {
		case 1://新增
			addNew(dvdName);
			break;
		case 3://删除
			if(!shop.delDvd(dvdName)){
				info.delError();
			}else{
				info.delSuccess();
			}
			break;
		case 4://借出
			if(!shop.borrowDvd(dvdName)){
				info.borrowError();
			}else{
				info.borrowSucccess();
			}
			break;
		case 5://归还
			if(shop.backDvd(dvdName)){
				info.backSucccess();
			}else{
				info.backError();
			}
			break;
		}
	}
	/**
	 * 执行新添加 DVD 功能 根据执行结果 打印输出信息
	 * @param dvdName
	 * @return
	 */
	public boolean addNew(String dvdName){
		//如果执行成功
		if(shop.addNewDvd(dvdName)==1){
			info.addDvdSuccess(dvdName);
			return true;
		//插入失败 存在同名
		}else if(shop.addNewDvd(dvdName)==0){
			info.exitDvdFailed(dvdName);
		//插入失败 满仓
		}else{
			info.exitDvdOver(dvdName);
		}
		return false;
	}
	/**
	 * 查看dvd信息
	 */
	public void showDVDListInfo(){
		info.showDvdInfo(shop.getDvds());
	}
	 
}
