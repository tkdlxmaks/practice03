package prob6;

public class Depart extends Employee {

	private String depart;

	Depart(String name, int salary, String depart) {
		super.setName(name);
		super.setSalary(salary);
		this.depart = depart;
	}

	public void getInformation() {
		super.getInformation();
		System.out.println("  부서: "+ depart);

	}
}
