package ch02;

public class OperatorTest {

	public static void main(String[] args) {
		/* ++이 앞에 왔을 때
		int gameScore = 150;
		
		int lastScore = ++gameScore; //gameScore += 1; gameScore = gameScore + 1; 과 같지만 ++이 앞에 있으면 문장이 끝나기 전에 +1을 먼저 실행시켜준다.
		
		System.out.println(lastScore); 151출력
		System.out.println(gameScore); 151출력
		*/
		
		// ++이 뒤에 왔을 때 
		int gameScore = 150;
		
		int lastScore = gameScore++; //gameScore += 1; gameScore = gameScore + 1; 과 같지만 ++이 뒤에 있으면 문장이 끝난 다음에 +1을 더해준다.
		
		System.out.println(lastScore); // 150출력
		System.out.println(gameScore); // 151출력
	}

}
