package ch02;

public class VIPCustomer extends Customer{
	
	// 상속에서 클래스 생성 과정과 형 변환
	// 우수고객 클래스
	
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
		
		System.out.println("VIPCustomer(int, String) call");
	}
}
