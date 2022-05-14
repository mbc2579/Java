package ch03;

public class StudentTest {

	public static void main(String[] args) {
		
		// Student class 메소드 실행 클래스 예제

		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		
		// 인스턴스는 동적 메모리(힙)에 할당된다.
		System.out.println(studentKim); // 메모리 가상주소 출력
		System.out.println(studentLee); // 메모리 가상주소 출력
	}

}
