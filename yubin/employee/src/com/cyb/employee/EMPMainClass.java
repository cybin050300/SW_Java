package com.cyb.employee;

public class EMPMainClass {

	public static void main(String[] args) {
		//EMPDateClass 생성
		EMPDataClass emp = new EMPDataClass();
		
		//		String str ="이성용";
		//		
		//		if(str.contains("용")) {
		//			System.out.println("맞다");			
		//		}else {
		//			System.out.println("틀리다");
		//			}
		//		
		//		if(str.endsWith("이")) {
		//			System.out.println("맞다");}
		//		else {
		//			System.out.println("틀리다");
		//			}
		//				
		//		if(str.startsWith("이")) {
		//			System.out.println("맞다");
		//		}else {
		//			System.out.println("틀리다");
		//			}
		
		//성이 "이"씨인 사람들 인원 수?
		// 1. emp 객체 내의 name 배열
		// 2. name 배열의 데이터 중 "이"로 시작하는 데이터 찾기
		// String 객체의 메서드를 이용하여 검색
		
		String containStr = "이";
		int count =0;
		for(int k =0; k<emp.name.length; k++) {
			if(emp.name[k].startsWith(containStr)) {
				count++;
			}	
		}
		System.out.println(containStr+" 씨 성을 가진 인원 수 : "+ count);
		
		//		System.out.println(emp.age.length);		// ****최종 데이터가 잘 들어갔는지 항상 확인할 것!!! *****
		//		System.out.println(emp.code[30]);
		
		
		// 직업이 Java이고 근무지가 국내인 사원의 평균 급여 구하기
		int paySum =0;
	    int countNum=0;
	    String job ="java";
	    String code ="US";
	    
	    for(int k=0; k<emp.job.length;k++) {
	    	if(emp.job[k].equals(job) && emp.code[k].equals(code)) {
	    		paySum += emp.pay[k];
	    		countNum++;
	    	
	    		double payAvg =(double)paySum/countNum;
	    		
	    		System.out.println("직업이" +job+"인 사원의 수: "+countNum);
	    		System.out.println("직업이" +job+"인 사원"+countNum+"명의 평균 급여: "+payAvg);
	    		
	    	}
	    }
	}
}
