package com.qiancheng.oop3;

public class Test {

	public static void main(String[] args) {
		//ʵ�����������
		MonkeyKing mon = new MonkeyKing();
		//�ȵ��ôӸ����м̳������ķ���
		System.out.println(mon.eat());
		System.out.println(mon.speak());
		System.out.println(mon.borrow());
		//���������ж��еķ���
		mon.kill();
		
		//ʵ�����������
		PigKing pig = new PigKing();
		//ͨ��������� ���ʷ���ʱ�����ʹ��̣���ȡ���౾���Ƿ���ڸ÷���
		// 						         �������������ø����еķ���
		System.out.println("�˽䣺"+pig.eat());
		System.out.println(pig.name);
	}

}
