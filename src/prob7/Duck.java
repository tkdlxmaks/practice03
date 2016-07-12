package prob7;

public class Duck extends Bird implements Action {
	
	@Override
	public void fly() {
		System.out.println(getName()+"는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.println(getName()+"는 소리내어 웁니다.");
	}
	
	public String toString() {
		return "오리의 이름은 " + getName() + "입니다.";
	}
}
