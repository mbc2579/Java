package ch11;

public class ArrayTest {

	public static void main(String[] args) {
		
		// �迭�� ���� ���ϴ� ����

		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
		}
		for(int num : arr) { // �迭�� n�� ��Ҹ� 0���� n-1���� ���������� ��ȸ�� �� �����ϰ� ����� �� ����
			total += num;
		}
		
		System.out.println(total);
	}

}