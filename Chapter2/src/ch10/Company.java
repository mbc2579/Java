package ch10;

public class Company {
	
	// �̱��� �������� ȸ�� ��ü �����ϱ�
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
