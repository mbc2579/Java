package ch09;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		// while 반복문 예제
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		input = scanner.nextInt();
		
		while (input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
		
		System.out.println("---------------------------------");
		
		// do ~ while 반복문 예제
		
		Scanner scanner1 = new Scanner(System.in);
		int input1;
		int sum1 = 0;
				
		do {
			input = scanner.nextInt();
			sum1 += input;
		} while (input != 0); 
				
		System.out.println(sum1);

	}

}
