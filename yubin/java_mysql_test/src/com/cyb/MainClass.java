package com.cyb;

import java.util.Scanner;

import com.cyb.db.DataBaseClass;

/**
 * Controller Dispatcher class => Controller(��ȸ) => Controller(����) =>
 * Controller(����) => Controller(����)
 */
public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc = new DataBaseClass();
		dbc.connMySQL(); // ����̹� �ε� �� ����
//		dbc.selectAll();		// ��ü ���ڵ� ��ȸ
//		dbc.selectOne();	// �ϳ��� ���ڵ� ��ȸ
//		dbc.selectLimit(); 	// ��ü ���ڵ� �� �Ϻ� ���ڵ�鸸 ��ȸ
//		dbc.insert();			// ���ڵ� �߰�  	
//		dbc.update();  		// ���ڵ� ����
//		dbc.delete();
//	 main() END

		/** ���蹮�� **/
// �ܼ�â���� 1�� �ϸ� ��ü��ȸ �ǵ���
// 2���ϸ� �ϳ��� ���ڵ� ��ȸ�ǵ���
		
		/** switch ~ case **/
		System.out.println("��ü �޴����� �۾��� ��ȣ �Է�!");
		System.out.println("1. ��ü��ȸ ȭ�� | 2. ���ڵ� ���� | 3. ���ڵ� ���� | 4. ���ڵ� ����");
		System.out.println("=============================================");
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			int key = scanner.nextInt();
			System.out.println("����̹� ���� �Ϸ�");
			switch (key) {
			case 1:
				System.out.println("��ü��ȸ ȭ��");
				dbc.selectAll();
				break;
			case 2:
				System.out.println("���ڵ� ����");
				dbc.insert();
				break;
			case 3:
				System.out.println("���ڵ� ����");
				dbc.update();
				break;
			case 4:
				System.out.println("���ڵ� ����");
				dbc.delete();
				break;
			case 5: // while()�� ���������� ���� �ڵ� (������ ���� ����)
				status = false;
				break;
			} // switch (key) END
		} // while (status) END
		scanner.close();
		System.out.println("�ý��� ����Ǿ����ϴ�.");
	} // main() END

}