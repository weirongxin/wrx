package com.qiancheng.homework2;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("小明",1407,97);
		Student s2 = new Student("小红",1306,89);
		Student s3 = new Student("小军",1208,87);
		
		Student[] a = {s3,s2,s1};
		
		for(int i=0;i<=a.length-1;i++){
			for(int j=0;j<=a.length-2;j++){
				if(a[j].getScore()<a[j+1].getScore()){
					Student temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++){
			System.out.println(a[i].say());
		}
	}

}
