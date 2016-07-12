package prob5;

public class MyBase extends Base {

	// 오버라이딩
	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}

	public void night() {
		super.night();
	}

	/***
	 * 굉장히 비효율적 - 질문 필요
	 */
	public void service(String s) {
		if (s.equals("오후")) {
			System.out.println("오후!");
		} else if (s.equals("낮")) {
			day();
		} else
			night();
	}
}
