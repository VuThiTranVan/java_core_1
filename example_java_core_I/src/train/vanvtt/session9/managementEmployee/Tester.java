package train.vanvtt.session9.managementEmployee;

public class Tester extends Employee {
	private String automationTesting;
	private int toeic;

	public Tester(int id, String name, Boolean gender, String address, float salary, String automationTesting,
			int toeic) {
		super(id, name, gender, address, salary);
		this.automationTesting = automationTesting;
		this.toeic = toeic;
	}

	public String getAutomationTesting() {
		return automationTesting;
	}

	public void setAutomationTesting(String automationTesting) {
		this.automationTesting = automationTesting;
	}

	public int getToeic() {
		return toeic;
	}

	public void setToeic(int toeic) {
		this.toeic = toeic;
	}

	float getPaymentAmount() {
		return getSalary();
	}

	@Override
	void displayInfomation() {
		System.out.println("id = " + getId());
		System.out.println("name = " + getName());
		System.out.println("gender = " + getGender());
		System.out.println("address = " + getAddress());
		System.out.println("salary = " + getSalary());
		System.out.println("automation testing = " + getAutomationTesting());
		System.out.println("toeic = " + getToeic());
	}

}
