package com.qiancheng.setfun1;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Pig> pigs = new HashSet<Pig>();
		//hashCode 哈希值不同的对象  一定为两个对象
		//         哈希值相同的对象  不一定是同一个对象
		//往set中存数据时，先判断是否存在相同的哈希值，如果存在相同的，则再做equals判断
		//             哈希值不相同  则一定为两个对象，直接存入集合中
		pigs.add(new Pig("xiaohua", 300.0));
		pigs.add(new Pig("xiaohua", 300.0));
		System.out.println(pigs.size());
	}
}
