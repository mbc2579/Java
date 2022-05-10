package ch01;

public class TypeConversionTest {

	public static void main(String[] args) {

		
	
	  	//형변환 예제
		
	  	/*
	 	int iNum = 255;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		
		*/
		
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1); // 1.2와 0.9를 int형으로 형변환 후 계산하므로 1 + 0 이 되어 1이 출력
		System.out.println(iNum2); // 1.2+0.9를 먼저 수행한 후(2.1) int형으로 형변환 해주므로 출력결과는 2가 나온다.
		
		//연산자 예제
		
		/*
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum + yourNum;
		System.out.println(myNum);
		*/
		
		//위의 코드와 같은 코드 +하는 과정에서 myNum을 2번 적어야할 것을 한번만 적고 연산을 수행하는 코드
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum;
		System.out.println(myNum);
	}

}
