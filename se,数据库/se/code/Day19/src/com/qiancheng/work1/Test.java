package com.qiancheng.work1;

import java.util.HashMap;
import java.util.Scanner;

//Map中存放的是诗词信息，模拟的是诗词数据库。
//诗词：Poem、名字、作者、朝代、内容
//诗词数据库中key：诗词名称  value：Poem对象
//
//（toString方法中 生成连接信息的字符串）
public class Test {
	public static void main(String[] args) {
		Poem p1 = new Poem("静夜思", "李白", "唐", "床前明月光......");
		Poem p2 = new Poem("咏鹅", "骆宾王", "唐", "鹅，鹅，鹅......");
		Poem p3 = new Poem("咏柳", "贺知章", "唐", "碧玉妆成一树高......");
		
		HashMap<String, Poem> poems = new HashMap<String,Poem>();
		poems.put(p1.getName(), p1);
		poems.put(p2.getName(), p2);
		poems.put(p3.getName(), p3);
		//录入对象的创建
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎来到图书馆诗词查阅系统");
		
		boolean status = true;
		while(status){
			//查询过程
			System.out.println("请录入查阅诗词的名字：");
			String queryPoemName = scanner.next();
			//查询得到诗词输出
			Poem getPoem = poems.get(queryPoemName);
			if(getPoem!=null){
				System.out.println("查询到的诗词:");
				System.out.println(getPoem.getName()+"  "+getPoem.getAuthor()+" "+getPoem.getDynasty());
				System.out.println(getPoem.getContent());
			}else{
				System.out.println("没有该诗词");
			}
			
			System.out.println("是否需要继续查询？ yes继续  no不继续");
			String select = scanner.next();
			if(select.equals("no")){
				status = false;
				System.out.println("谢谢使用！");
			}
		}

		scanner.close();
	}

}
