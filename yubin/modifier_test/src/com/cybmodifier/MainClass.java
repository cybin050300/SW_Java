package com.cybmodifier;

import com.cybmodifier.test.Methodclass;

public class MainClass {

	public MainClass() {
		}

	public static void main(String[] args) {
		TestClass test = new TestClass();
		Methodclass mc =new Methodclass(); // 현재 내 패키지에서 못찾아옴 -> import해서 추가(c+t+o)
		DataClass dc1=new DataClass(); 
		DataClass dc2=new DataClass(); 
		System.out.println(dc1.getName());
		
		//dc.setName("sdsdss'); ->setName은 오류!! => 해당변수의 setter메서드가 없기 때문에
		
		dc1.defaultVar = 2000;
		dc1.staticVar = 3000;		//변수의 위치가 다름  static 클래스가 선언되었을때 붙어있음,  
										//Static은 각 변수에서 공유 변수가 됨(클래스 자체에 붙어있기 때문에, )
		//변수에 붙을때는 공유값이라고 생각해야한다. (static은 공유하기 때문에 위험)
		System.out.println(dc1.staticVar+":"+dc1.staticVar);
		System.out.println(dc1.defaultVar+":"+dc1.defaultVar);	
		
//		//DataClass dc1=new DataClass(); 
//		//DataClass dc2=new DataClass(); 
//		
//		//dc1.defaultVar = 2000;
//		dc1.staticVar = 3000;		
//		
//		DataClass.initData();
//		System.out.println(DataClass.test[0];) //DataClass dc1=new DataClass(); 선언해줘야함
//		System.out.println(dc1.staticVar+":"+dc1.staticVar);
//		//System.out.println(dc1.defaultVar+":"+dc1.defaultVar);

			

	}

}
