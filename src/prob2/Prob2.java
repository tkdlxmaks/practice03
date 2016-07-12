package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner(System.in);

		int[] bill = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] count = new int[bill.length];
		String input = scanner.nextLine();
		int charge = Integer.parseInt(input);
		for (int i = 0; i < bill.length; i++) {
			while (charge >= bill[i]) { // 지폐보다 값이 크면
				count[i] = charge / bill[i];// 개수
				charge %= bill[i]; // 나머지
				System.out.println(bill[i] + "원 : " + count[i] + " 개");
				if (charge == 0) { // 값이 0이면 탈출
					break;
				}
			}
		}

		scanner.close();

	}
}
