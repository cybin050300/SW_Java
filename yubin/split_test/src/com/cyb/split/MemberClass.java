package com.cyb.split;

public class MemberClass {
	String name; // �̸�
	String joinDate; // ������
	String lastVisitDate; // �����湮��
	int numVisit; // �湮Ƚ��
	String gender; // ����
	int age; // ���ɴ�

	public MemberClass() {

	}

	public void inputRecord(String raw) {		// raw: ������ �ȵ� ���� ������		����Ŭ�������� �Ű����� raw �޾ƿ�
		
		String[] split =raw.split(",");			// String.split("������")==> String[]�� ��ȯ
		name=split[0];
		joinDate=split[1];
		lastVisitDate=split[2];
		numVisit=Integer.parseInt(split[3]);	// Integer.parseInt(��123��) �� ���ڿ����ڸ� ������ ��ȯ!!
														//�� �ϱ�!! �� javascript���� �Ȱ��� ���
		gender=split[4];
		String temp=split[5].substring(0, 2);	// String.substring(���� �ε���, �� �ε���)
		// age=Integer.parseInt(split[5]);		->> java.lang.NumberFormatException���� �߻� (���ڿ��� ���ڷ� ������ �� �߻�)
		
		// "�����" ������ ó�� -> ����� �����ʹ� ó���� ������ age���� ������ ����
		//							  => ���ڿ� �񱳴� equals ���!!
//		if(temp != "20" || temp !="30" || temp != "40" || temp !="50") {
//			temp="0";
//		}
		if(temp.equals("���")) {
			temp="0";
		}
		age=Integer.parseInt(temp);
	}
}