package ch10;

public class ForTest {

	public static void main(String[] args) {
		
		// For 반복문 예제
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++, count++) {
			sum += count;
		}
		System.out.println(sum);
		
		System.out.println("---------------------------------");
		
		// while 반복문 예제
		
		int num = 1;
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);
	}
}
