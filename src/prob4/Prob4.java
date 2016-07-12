package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;

		System.out.println("5개의 숫자를 입력하시오");
		/* 키보드에서 배열 크기만큼 입력 받아 배열에 정장하는 코드 */
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(scanner.nextLine());
		}

		/* 배열에 저장된 정수 값 더하기 */
		for (int i : intArray) {
			sum += i;
		}
		/* 평균 */
		sum = sum / intArray.length;
		/* 출력 */
		System.out.println("5개 입력 수의 평균은 : " + sum + " 입니다.");
		/* 자원정리 */
		scanner.close();
	}

}
