package ch04;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		// ���ǿ����� ����
		
		int max;
		System.out.println("�� ���� �Է� �޾� �� ū ���� ����ϼ���\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է�1 : ");
		int num1 = scanner.nextInt();
		
		System.out.println("�Է�2 : ");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2) ? num1 : num2; // ������ ���̸� ���� ���ڸ� ��� �����̸� ���� ���ڸ� ���
		System.out.println(max);

	}

}