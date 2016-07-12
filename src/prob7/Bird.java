package prob7;

public abstract class Bird {
	private String Name;
	private int legs;
	private int length;

	// method
	public void fly() {

	}

	public abstract void sing();

	public String toString() {
		return "무슨 새인지 정확히 정의할 수 없습니다.";
	}

	// getter & setter
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
