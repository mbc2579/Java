package ch01;

public class VIPCustomer extends Customer{
	
	// ����� Ȱ���� ����� Ŭ���� �����ϱ�
	// ������� Ŭ����
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
}