package ch02;

public class OperatorTest {

	public static void main(String[] args) {
		/* ++�� �տ� ���� ��
		int gameScore = 150;
		
		int lastScore = ++gameScore; //gameScore += 1; gameScore = gameScore + 1; �� ������ ++�� �տ� ������ ������ ������ ���� +1�� ���� ��������ش�.
		
		System.out.println(lastScore); 151���
		System.out.println(gameScore); 151���
		*/
		
		// ++�� �ڿ� ���� �� 
		int gameScore = 150;
		
		int lastScore = gameScore++; //gameScore += 1; gameScore = gameScore + 1; �� ������ ++�� �ڿ� ������ ������ ���� ������ +1�� �����ش�.
		
		System.out.println(lastScore); // 150���
		System.out.println(gameScore); // 151���
	}

}
