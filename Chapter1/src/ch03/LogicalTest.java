package ch03;

public class LogicalTest {

	public static void main(String[] args) {
		// ���� ������ ����
		// &&(���� ��) �� ���� ��� ���̸� �� ||(���� ��) �� �� �� �ϳ��� ���� ���̸� �� !(����) ���� ���� �������� ������ ������ �ٲ�
				
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
		
		// ���� ���� ���� �� ���� ��� ���̸� ���̹Ƿ� �տ� �ִ� ������ ���� �ƴϸ� �ڿ� ������ ������ ���� �ʴ´�.
		boolean value1 = ( (num1 = num1 + 10) < 10) && ( (i = i + 2 ) < 10);
		
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println("---------------------------");
		
		int num2 = 10;
		int j = 2;
		
		// ���� ���� ���� �� �� �� �ϳ��� ���� ���̸� ���̹Ƿ� ���� ������ ���̸� ���� ������ ���� �� �ʿ䰡 ����.
		boolean value2 = ( (num2 = num2 + 10) < 10) || ( (j = j + 2 ) < 10);
		
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(j);
	}

}