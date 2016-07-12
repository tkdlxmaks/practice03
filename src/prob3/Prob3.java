package prob3;

public class Prob3 {

	public static void main(String args[]) {

		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);

	}

	public static char[] reverse(String str) {
		/* 구현코드 */
		char[] ch = str.toCharArray();
		int suffle = ch.length; // 11
		for (int i = 0; i < suffle; i++) {
			suffle--;
			char temp = ch[i];
			ch[i] = ch[suffle];
			ch[suffle] = temp;
		}
		
		return ch;
	}

	public static void printCharArray(char[] array) {
		/* 구현코드 */
		System.out.println(array);
	}
}
