package com.qiancheng.work1;

public class Work2 {
	public static void main(String[] args) {
		//定义数据源
		String str="18712001";
		//定义单位
		String[] currency={"亿","千","百","十","万","千","百","十","元"};
		//将数据源字符串 转换为char数组
		char[] chars = str.toCharArray();
		//取单位的长度
		int a = currency.length-str.length();

		StringBuffer moneyStr = new StringBuffer();
		//循环遍历数字的每一个  ，从个位数开始遍历
		for(int i=0;i<=chars.length-1;i++){
			if(chars[i]=='0'){
				a++;
				if(!moneyStr.toString().endsWith("零")){
					moneyStr.append("零");
				}
				continue;
			}else if(chars[i]=='1'){
				moneyStr.append("一");
			}else if(chars[i]=='2'){
				moneyStr.append("二");
			}else if(chars[i]=='3'){
				moneyStr.append("三");
			}else if(chars[i]=='4'){
				moneyStr.append("四");
			}else if(chars[i]=='5'){
				moneyStr.append("五");
			}else if(chars[i]=='6'){
				moneyStr.append("六");
			}else if(chars[i]=='7'){
				moneyStr.append("七");
			}else if(chars[i]=='8'){
				moneyStr.append("八");
			}else if(chars[i]=='9'){
				moneyStr.append("九");
			}
//			System.out.print(currency[a]);
			moneyStr.append(currency[a]);
			a++;
		}
		System.out.print(moneyStr);

	}
}
