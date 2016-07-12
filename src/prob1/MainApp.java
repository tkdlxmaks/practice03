package prob1;

public class MainApp {
	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

		int count = 0;
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				total += data[i];
				count++;
			}
		}
		System.out.println("3의 배수 전체 합은 :" + total + " 이고 \n3의배수의  개수는 :" + count + " 입니다.");
	}
}