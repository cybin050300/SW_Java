package com.cyb.split;

import java.util.ArrayList;

public class SplitMainClass {

	public static void main(String[] args) {

		DataClass dc = new DataClass();

		MemberClass[] mcArray = new MemberClass[98]; // Record ó��
		for (int m = 0; m < mcArray.length; m++) {
//			MemberClass mc =new MemberClass(); 
//			mcArray[m]=mcArray;		// �迭���� �ε��� ��ȣ�� �ֱ� ������ ���� ���� ������ �ʿ�x
			mcArray[m] = new MemberClass();
			mcArray[m].inputRecord(dc.member[m]);
		}

		// ���� ���� ��ü ����
		MethodClass method = new MethodClass();
		int sum = method.sum(mcArray); // ���� �� �޼��� ȣ��
		double avg = method.avg(sum, mcArray.length); // ���� ���� �̿��Ͽ� ��� ���ϴ� �޼���
		System.out.println(avg);

		// �̸� �˻��ϱ�
		String name ="����";
		 ArrayList<Integer> visit =method.searchName(name, mcArray) {
			System.out.println(name+"�� ��"+visit.size()+"�� �̰�");
			System.out.print("�� �湮 Ƚ����");

			for(int i=0; i<visit.size(); i++) {
				if(name.equals(mcArray[i].name)) {
					System.out.println(visit.get(i-1)+",");
				}
				System.out.println("�Դϴ�.");
		}

	}

}