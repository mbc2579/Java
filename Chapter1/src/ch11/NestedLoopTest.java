package ch11;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		// for 반복문으로 구구단 예제
		
		int count = 1;
		
		
		for(int dan = 2; dan <= 9; dan ++ ) {
			for(count = 1; count <= 9; count++) {
				System.out.println(dan + "X" + count + "=" + dan * count);
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------------");
		
		// while 반복문으로 구구단 예제
		
		int dan1 = 2;
		int count1 = 1;
		while( dan1 <= 9) {
			
			count1 = 1;
			while( count1 <= 9) {
				System.out.println(dan1 + "X" + count1 + "=" + dan1 * count1);
				count1++;
			}
			dan1++;
			System.out.println();
		}
	}
}
