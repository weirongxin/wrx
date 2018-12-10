package com.qiancheng.work1;

public class Bank {
	private static double balance=10000;
	public double depost(double getmoney) throws BankException{
		if(getmoney>balance){
			throw new BankException("余额不足");
		}
		return balance-getmoney;
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		double getmoney = 600000;
		try{
			b.depost(getmoney);
		}catch(BankException r){
			System.out.println("异常对象"+r);
		}finally{
			System.out.println("账户余额："+(balance-getmoney));
		}
		System.out.println("成功取出："+getmoney+"元");
	}
	
}
