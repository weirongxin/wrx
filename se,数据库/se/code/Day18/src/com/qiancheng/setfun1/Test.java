package com.qiancheng.setfun1;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Pig> pigs = new HashSet<Pig>();
		//hashCode ��ϣֵ��ͬ�Ķ���  һ��Ϊ��������
		//         ��ϣֵ��ͬ�Ķ���  ��һ����ͬһ������
		//��set�д�����ʱ�����ж��Ƿ������ͬ�Ĺ�ϣֵ�����������ͬ�ģ�������equals�ж�
		//             ��ϣֵ����ͬ  ��һ��Ϊ��������ֱ�Ӵ��뼯����
		pigs.add(new Pig("xiaohua", 300.0));
		pigs.add(new Pig("xiaohua", 300.0));
		System.out.println(pigs.size());
	}
}
