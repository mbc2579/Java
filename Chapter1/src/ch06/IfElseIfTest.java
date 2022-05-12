package ch06;

public class IfElseIfTest {

	public static void main(String[] args) {
		
		// 다중 조건문(if ~ else ~ if)과 단독 조건문(if if if if) 차이점 예제
		
		int age = 12;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		// age가 12일때 결과 값
		// 초등학생 입니다. 
		// 입장료는 2000원입니다.
		System.out.println("입장료는 " + charge + "원입니다."); 
		
		
		
		System.out.println("--------------------------------");
		
		// 다중 조건문(if ~ else ~ if)과 단독 조건문(if if if if) 차이점 예제
		
				int age1 = 12;
				int charge1;
				
				if(age1 < 8) {
					charge1 = 1000;
					System.out.println("미 취학 아동입니다.");
				}
				if(age1 < 14) {
					charge1 = 2000;
					System.out.println("초등학생 입니다.");
				}
				if(age1 < 20) {
					charge1 = 2500;
					System.out.println("중, 고등학생 입니다.");
				}
				else {
					charge1 = 3000;
					System.out.println("일반인 입니다.");
				}
				
				// age가 12일때 결과 값
				// 초등학생 입니다. 
				// 중, 고등학생 입니다. 
				// 입장료는 2500원입니다.
				System.out.println("입장료는 " + charge1 + "원입니다.");
	}
}
