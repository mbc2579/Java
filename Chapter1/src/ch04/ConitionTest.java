package ch04;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		// 조건연산자 예제
		
		int max;
		System.out.println("두 수를 입력 받아 더 큰 수를 출력하세요\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력1 : ");
		int num1 = scanner.nextInt();
		
		System.out.println("입력2 : ");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2) ? num1 : num2; // 조건이 참이면 앞의 숫자를 출력 거짓이면 뒤의 숫자를 출력
		System.out.println(max);

	}

}
