package ch09;

public class Subway {
	
	// ��ü ���� ����(���� ����ö ž�� ����)

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(lineNumber + "���� �°� ���� " + passengerCount + "�� �̰�, ������ " + money + "���Դϴ�.");
	}
}
