package ch03;

public class VIPCustomer extends Customer{
	
	// �޼��� �������ϱ�(overriding)
	// ������� Ŭ����
	
	double salesRatio;
	private String agentID;
	
	/*
	public VIPCustomer() {
		
		super(0, "no-name");
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
}