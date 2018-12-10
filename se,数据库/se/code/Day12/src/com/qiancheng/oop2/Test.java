package com.qiancheng.oop2;

public class Test {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("С��");
		
		Monkey m = new Monkey();
		m.setName("С��");
		
		Bear b = new Bear();
		b.setName("���");
		
		SeaLion s = new SeaLion();
		s.setName("С��");

		Test t = new Test();
		//���÷��� method����Ϊ��������
		t.method(b);
	}
	//��װ����  ʹ�ö��������ҽ���
	public void method(Animal an){
		//1.an����Ϊ���ݹ����Ĳ�������ʵ���Ѿ���Animal���͵�����
		an.say();
		//2.ͨ�� an����ֱ�ӷ��������еĶ��з�������ΪAnimal�в����ڸ÷���
		//an.eatBone();
		//��������an  ͨ���������͵�����ת��(ǿ����ת��)
		//instanceof�ؼ���   �÷��� A  instanceof B  
		//����ֵΪboolean����  �ж�A�Ƿ�ΪB��Ķ�����������
		if(an instanceof Dog){
			Dog dog = (Dog)an; 
			//Dog���д��ڵķ��� dog�������ֱ�ӵ���
			dog.eatBone();
		}else if(an instanceof Monkey){
			Monkey mon = (Monkey)an;
			mon.rideBike();
		}else if(an instanceof Bear){
			Bear b = (Bear)an;
			b.jumpFire();
		}
		
	}

}
