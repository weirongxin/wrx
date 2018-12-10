package com.qiancheng.tools2;

public class User {

	//如果找到当前类的游离内存，则默认调用finalize方法，进行回收释放
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
		super.finalize();
	}

}
