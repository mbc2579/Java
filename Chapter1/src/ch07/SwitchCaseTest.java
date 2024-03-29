package ch07;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		//Switch ~ case ~ break 조건문 예제(int)
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				day = 31;
				break;
				
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
				
			case 2:
				day = 28;
				break;
			default:
				day = 0;
				System.out.println("존재하지 않는 달입니다.");
		}
		
		System.out.println(month + "월은" + day + "일입니다.");
		
		System.out.println("--------------------------------------");
		
		// Java14부터 지원되는 Switch Expression 예제
		// 간단하게 쉼표로 조건 구분
		// 식으로 표현 하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류가 생김
		// yield키워드 사용
		// break; 생략 가능
				
		int month1 = 3;
				
		int day1 = switch(month1) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			System.out.println("한 달은 31일 입니다.");
			yield 31;
			}
		case 4, 6, 9, 11 -> {
			System.out.println("한 달은 30일 입니다.");
			yield 30;
			}
				
		case 2 -> {
			System.out.println("한 달은 28일 입니다.");
			yield 28;
		}
		default -> {
			System.out.println("존재하지 않는 달입니다.");
			yield 0;
		}
		};

		System.out.println("--------------------------------------");
		
		// Switch ~ case ~ break 조건문 예제(string)
		
		String medal = "Gold";
		
		switch(medal) {
		
			case "Gold" :
				System.out.println("금메달 입니다.");
				break;
				
			case "Silver" :
				System.out.println("은메달 입니다.");
				break;
				
			case "Bronze" :
				System.out.println("동메달 입니다.");
				break;
				
			default :
				System.out.println("메달이 없습니다.");
				break;
		}
	}
}
