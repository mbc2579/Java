package ch11;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열로 합을 구하는 예제

		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
		}
		for(int num : arr) { // 배열의 n개 요소를 0부터 n-1까지 순차적으로 순회할 때 간단하게 사용할 수 있음
			total += num;
		}
		
		System.out.println(total);
	}

}