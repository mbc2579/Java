package ch06;

public class IfElseIfTest {

	public static void main(String[] args) {
		
		// ���� ���ǹ�(if ~ else ~ if)�� �ܵ� ���ǹ�(if if if if) ������ ����
		
		int age = 12;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ��Դϴ�.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("��, �����л� �Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		
		// age�� 12�϶� ��� ��
		// �ʵ��л� �Դϴ�. 
		// ������ 2000���Դϴ�.
		System.out.println("������ " + charge + "���Դϴ�."); 
		
		
		
		System.out.println("--------------------------------");
		
		// ���� ���ǹ�(if ~ else ~ if)�� �ܵ� ���ǹ�(if if if if) ������ ����
		
				int age1 = 12;
				int charge1;
				
				if(age1 < 8) {
					charge1 = 1000;
					System.out.println("�� ���� �Ƶ��Դϴ�.");
				}
				if(age1 < 14) {
					charge1 = 2000;
					System.out.println("�ʵ��л� �Դϴ�.");
				}
				if(age1 < 20) {
					charge1 = 2500;
					System.out.println("��, �����л� �Դϴ�.");
				}
				else {
					charge1 = 3000;
					System.out.println("�Ϲ��� �Դϴ�.");
				}
				
				// age�� 12�϶� ��� ��
				// �ʵ��л� �Դϴ�. 
				// ��, �����л� �Դϴ�. 
				// ������ 2500���Դϴ�.
				System.out.println("������ " + charge1 + "���Դϴ�.");
	}
}