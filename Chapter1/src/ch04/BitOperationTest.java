package ch04;

public class BitOperationTest {

	public static void main(String[] args) {
		
		// 비트연산자 예제
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.println(num1 << 2);
		System.out.println(num1 <<= 2);
		System.out.println(num1 >> 1);

	}

}
