package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		// 상속에서 클래스 생성 과정과 형 변환
		// test클래스
		
		
		Customer customerLee = new Customer(10010, "이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noname");
	}
}
