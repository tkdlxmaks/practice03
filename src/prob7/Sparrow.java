package prob7;

public class Sparrow extends Bird implements Action {
	@Override
	public void fly() {
		System.out.println(getName() + "는 날아다닙니다.");
	}

	@Override
	public void sing() {
		System.out.println(getName() + "는 소리내어 울지 않습니다.");
	}
	
	public String toString() {
		return "참새의 이름은 " + getName() + "입니다.";
	}
}
