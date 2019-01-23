package train.vanvtt.session9.managementEmployee;

public class Developer extends Employee {
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Developer(int id, String name, Boolean gender, String address, float salary, String language) {
		super(id, name, gender, address, salary);
		this.language = language;
	}

	float getPaymentAmount() {
		return this.getSalary() * 10 / 100 + getSalary();
	}

	@Override
	void displayInfomation() {
		System.out.println("id = " + getId());
		System.out.println("name = " + getName());
		System.out.println("gender = " + getGender());
		System.out.println("address = " + getAddress());
		System.out.println("salary = " + getSalary());
		System.out.println("language = " + getLanguage());
	}

}
