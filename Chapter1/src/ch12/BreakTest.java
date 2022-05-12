package ch12;

public class BreakTest {

	public static void main(String[] args) {
		
		// break¹® ¿¡Á¦
		
		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
