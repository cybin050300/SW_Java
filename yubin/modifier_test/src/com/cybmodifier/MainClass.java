package com.cybmodifier;

import com.cybmodifier.test.Methodclass;

public class MainClass {

	public MainClass() {
		}

	public static void main(String[] args) {
		TestClass test = new TestClass();
		Methodclass mc =new Methodclass(); // ���� �� ��Ű������ ��ã�ƿ� -> import�ؼ� �߰�(c+t+o)
		DataClass dc1=new DataClass(); 
		DataClass dc2=new DataClass(); 
		System.out.println(dc1.getName());
		
		//dc.setName("sdsdss'); ->setName�� ����!! => �ش纯���� setter�޼��尡 ���� ������
		
		dc1.defaultVar = 2000;
		dc1.staticVar = 3000;		//������ ��ġ�� �ٸ�  static Ŭ������ ����Ǿ����� �پ�����,  
										//Static�� �� �������� ���� ������ ��(Ŭ���� ��ü�� �پ��ֱ� ������, )
		//������ �������� �������̶�� �����ؾ��Ѵ�. (static�� �����ϱ� ������ ����)
		System.out.println(dc1.staticVar+":"+dc1.staticVar);
		System.out.println(dc1.defaultVar+":"+dc1.defaultVar);	
		
//		//DataClass dc1=new DataClass(); 
//		//DataClass dc2=new DataClass(); 
//		
//		//dc1.defaultVar = 2000;
//		dc1.staticVar = 3000;		
//		
//		DataClass.initData();
//		System.out.println(DataClass.test[0];) //DataClass dc1=new DataClass(); �����������
//		System.out.println(dc1.staticVar+":"+dc1.staticVar);
//		//System.out.println(dc1.defaultVar+":"+dc1.defaultVar);

			

	}

}