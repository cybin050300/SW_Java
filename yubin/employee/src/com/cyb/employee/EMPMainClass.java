package com.cyb.employee;

public class EMPMainClass {

	public static void main(String[] args) {
		//EMPDateClass ����
		EMPDataClass emp = new EMPDataClass();
		
		//		String str ="�̼���";
		//		
		//		if(str.contains("��")) {
		//			System.out.println("�´�");			
		//		}else {
		//			System.out.println("Ʋ����");
		//			}
		//		
		//		if(str.endsWith("��")) {
		//			System.out.println("�´�");}
		//		else {
		//			System.out.println("Ʋ����");
		//			}
		//				
		//		if(str.startsWith("��")) {
		//			System.out.println("�´�");
		//		}else {
		//			System.out.println("Ʋ����");
		//			}
		
		//���� "��"���� ����� �ο� ��?
		// 1. emp ��ü ���� name �迭
		// 2. name �迭�� ������ �� "��"�� �����ϴ� ������ ã��
		// String ��ü�� �޼��带 �̿��Ͽ� �˻�
		
		String containStr = "��";
		int count =0;
		for(int k =0; k<emp.name.length; k++) {
			if(emp.name[k].startsWith(containStr)) {
				count++;
			}	
		}
		System.out.println(containStr+" �� ���� ���� �ο� �� : "+ count);
		
		//		System.out.println(emp.age.length);		// ****���� �����Ͱ� �� ������ �׻� Ȯ���� ��!!! *****
		//		System.out.println(emp.code[30]);
		
		
		// ������ Java�̰� �ٹ����� ������ ����� ��� �޿� ���ϱ�
		int paySum =0;
	    int countNum=0;
	    String job ="java";
	    String code ="US";
	    
	    for(int k=0; k<emp.job.length;k++) {
	    	if(emp.job[k].equals(job) && emp.code[k].equals(code)) {
	    		paySum += emp.pay[k];
	    		countNum++;
	    	
	    		double payAvg =(double)paySum/countNum;
	    		
	    		System.out.println("������" +job+"�� ����� ��: "+countNum);
	    		System.out.println("������" +job+"�� ���"+countNum+"���� ��� �޿�: "+payAvg);
	    		
	    	}
	    }
	}
}