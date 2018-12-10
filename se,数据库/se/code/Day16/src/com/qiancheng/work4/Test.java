package com.qiancheng.work4;
/*
 * 编写一个方法，返回double类型二维数组，
 * 数组中的元素通过解析字符串参数获得。如字符串参数"1,2;3,4,5;6,7,8"
 对应的数组为：
  d[0,0]=1.0 d[0,1] = 2.0
  d[1,0]=3.0 d[1,1]=4.0 d[1,2] =5.0
  d[2,0]=6.0 d[2,1]=7.0 d[2,2]=8.0
  
  "靳程,L瑞琪;陈思远,丁亚楠,杨朔;尚方剑,王鹏,赵翰彬"
 */
public class Test {	
	public static void main(String[] args) {
		String str = "靳程,L瑞琪;陈思远,丁亚楠,杨朔;尚方剑,王鹏,赵翰彬";
		//以;将字符串 拆分
		String[] groups = str.split(";");
		//根据一维数组的长度 创建数组
		String[][] members = new String[groups.length][];
		for(int i=0;i<groups.length;i++){
			//取每组名字的字符串
			String s = groups[i];
			//将每组名字的字符串以,拆分
			String[] member = s.split(",");
			//拆分得到的组成员数组  存入二维数组中
			members[i] = member;
		}
		
		for(String[] group:members){
			for(String member:group){
				System.out.print(member+"  ");
			}
			System.out.println();
		}
	}

}
