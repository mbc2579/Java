package ch08;

public class WhileTest {

	public static void main(String[] args) {
		
		// while �ݺ��� ����
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(num);
		System.out.println(sum);
	}
}
