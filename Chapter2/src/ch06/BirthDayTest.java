package ch06;

public class BirthDayTest {
	
	// 접근 제어 지시자, 정보은닉 예제

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		

		date.showDate();
	}

}
