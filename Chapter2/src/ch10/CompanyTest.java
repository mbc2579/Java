package ch10;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		// �̱��� �������� ȸ�� ��ü �����ϱ�
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		//Calendar calendar = Calendar.getInstance();
	}
}