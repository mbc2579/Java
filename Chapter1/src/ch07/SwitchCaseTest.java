package ch07;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		//Switch ~ case ~ break ���ǹ� ����(int)
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				day = 31;
				break;
				
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
				
			case 2:
				day = 28;
				break;
			default:
				day = 0;
				System.out.println("�������� �ʴ� ���Դϴ�.");
		}
		
		System.out.println(month + "����" + day + "���Դϴ�.");
		
		System.out.println("--------------------------------------");
		
		// Java14���� �����Ǵ� Switch Expression ����
		// �����ϰ� ��ǥ�� ���� ����
		// ������ ǥ�� �Ͽ� ��ȯ ���� ���� �� ����. ���� ���� ���� ���� ������ ����
		// yieldŰ���� ���
		// break; ���� ����
				
		int month1 = 3;
				
		int day1 = switch(month1) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			System.out.println("�� ���� 31�� �Դϴ�.");
			yield 31;
			}
		case 4, 6, 9, 11 -> {
			System.out.println("�� ���� 30�� �Դϴ�.");
			yield 30;
			}
				
		case 2 -> {
			System.out.println("�� ���� 28�� �Դϴ�.");
			yield 28;
		}
		default -> {
			System.out.println("�������� �ʴ� ���Դϴ�.");
			yield 0;
		}
		};

		System.out.println("--------------------------------------");
		
		// Switch ~ case ~ break ���ǹ� ����(string)
		
		String medal = "Gold";
		
		switch(medal) {
		
			case "Gold" :
				System.out.println("�ݸ޴� �Դϴ�.");
				break;
				
			case "Silver" :
				System.out.println("���޴� �Դϴ�.");
				break;
				
			case "Bronze" :
				System.out.println("���޴� �Դϴ�.");
				break;
				
			default :
				System.out.println("�޴��� �����ϴ�.");
				break;
		}
	}
}