package ch01;

public class VIPCustomer extends Customer{
	
	// 상속을 활용한 멤버십 클래스 구현하기
	// 우수고객 클래스
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
}
