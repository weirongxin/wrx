package com.qiancheng.work1;

public class Bank {
	private static double balance=10000;
	public double depost(double getmoney) throws BankException{
		if(getmoney>balance){
			throw new BankException("����");
		}
		return balance-getmoney;
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		double getmoney = 600000;
		try{
			b.depost(getmoney);
		}catch(BankException r){
			System.out.println("�쳣����"+r);
		}finally{
			System.out.println("�˻���"+(balance-getmoney));
		}
		System.out.println("�ɹ�ȡ����"+getmoney+"Ԫ");
	}
	
}
