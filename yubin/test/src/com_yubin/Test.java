package com_yubin;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[4];
		int arr2[] =new int[4];
		arr[0] = 10;
		arr[1]=  20;
		arr[2]=  30;
		arr[3] = 40;
//		arr[4] = 50;
		
		// �������� : �ݵ�� �ʱⰪ ����
		int sum = 0;				// 0
		sum = sum +arr[0];	// 10 = 0 + 10
		sum = sum +arr[1];	// 30 = 10 + 20
		sum = sum +arr[2];	// 60 = 30 + 30
		sum = sum +arr[3];	// 100 = 60 + 40
		
		System.out.println(sum);
		
		if(10 < 20 || arr[1] == arr[2]) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
		
		// sum ������ arr�迭�� ��� ���� ����
//		for(int i=0; i<arr.length; i++) {
//			sum = sum +arr[i];
//			System.out.println(sum);
//		
		
		for(int n : arr) {
			sum = sum +n;
			System.out.println(sum);
		}
		
		System.out.println("���� �հ� = " + sum);
		System.out.println("");
		
		// arr�迭�� �� ��, 40�� index��ȣ ���
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==40) {
				System.out.println("�迭 ���� 40�� index: " + i);
			}
			
	}
		
		
		// ��(if)
		// �񱳿�����: >, <, >=, <=, ==, !=
		// �񱳿������� ����� �Ǵ� => ����������: &&, ||, !
		// �׸���, ~�̰� &&(AND) tree && true ==> true
		// �Ǵ�, || (OR) false || false ==> false
		// true <=> false => !
		/*
		//  if(�񱳰� �񱳿����� �񱳰�){	
		 * 		�񱳿����� ����� true�� ��� ���� ����
		 }else{
		 		�񱳿����� ����� false�� ��� ���� ����
		 		}
		 */
/*
 * ������ 34�� �̻��̸� �������� 100����..
 * age 34 >=  if print
 */
		int age = 40;
		String money ="100����";
		if(age >=34) {
			System.out.println("�� �������� " + money);	
		}
		/*
		 * �� �ҵ��� 300���� �����̰�, �����ο��� 2�� �̻��̸� ���ݰ���
		 * pay 300<= && num >=2    "���ݰ���"
		 */
		int pay = 200;
		int num = 4;
		if(pay <=300 && num>=2) {
			System.out.println("���ݰ��� ����Դϴ�.");
		}else {
			System.out.println("���ݰ��� ����� �ƴմϴ�.");
		}
		
		String str;
		String str2="��";
		str="����";
		
		System.out.println(arr.length);
		System.out.println();

	}

}