package ch03;

public class LogicalTest {

	public static void main(String[] args) {
		// 논리 연산자 예제
		// &&(논리 곱) 두 항이 모두 참이면 참 ||(논리 합) 두 항 중 하나의 항이 참이면 참 !(부정) 참인 경우는 거짓으로 거짓은 참으로 바꿈
				
		int num3 = 10;
		int num4 = 20;
				
		boolean flag = (num3 > 0) && (num4 > 0);
		System.out.println(flag);
				
		flag = (num3 < 0) && (num4 > 0);
		System.out.println(flag);
				
		flag = (num3 > 0) || (num4 > 0);
		System.out.println(flag);
				
		flag = (num3 < 0) || (num4 > 0);
		System.out.println(flag);
				
		flag = !(num3 > 0);
		System.out.println(flag);
		
		System.out.println("---------------------------");
		
		int num1 = 10;
		int i = 2;
		
		// 논리 곱일 때는 두 항이 모두 참이면 참이므로 앞에 있는 조건이 참이 아니면 뒤에 조건은 실행을 하지 않는다.
		boolean value1 = ( (num1 = num1 + 10) < 10) && ( (i = i + 2 ) < 10);
		
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println("---------------------------");
		
		int num2 = 10;
		int j = 2;
		
		// 논리 압일 때는 두 항 중 하나의 항이 참이면 참이므로 앞의 조건이 참이면 뒤의 조건을 실행 할 필요가 없다.
		boolean value2 = ( (num2 = num2 + 10) < 10) || ( (j = j + 2 ) < 10);
		
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(j);
	}

}
