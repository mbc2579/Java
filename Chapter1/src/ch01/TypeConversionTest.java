package ch01;

public class TypeConversionTest {

	public static void main(String[] args) {

		
	
	  	//����ȯ ����
		
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
		
		System.out.println(iNum1); // 1.2�� 0.9�� int������ ����ȯ �� ����ϹǷ� 1 + 0 �� �Ǿ� 1�� ���
		System.out.println(iNum2); // 1.2+0.9�� ���� ������ ��(2.1) int������ ����ȯ ���ֹǷ� ��°���� 2�� ���´�.
		
		//������ ����
		
		/*
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum + yourNum;
		System.out.println(myNum);
		*/
		
		//���� �ڵ�� ���� �ڵ� +�ϴ� �������� myNum�� 2�� ������� ���� �ѹ��� ���� ������ �����ϴ� �ڵ�
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum;
		System.out.println(myNum);
	}

}