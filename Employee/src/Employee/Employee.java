package Employee;

public abstract class Employee implements Comparable<Employee> {
	private int id ;
	private String name;
	private Boolean gender;
	private String address;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, Boolean gender, String address, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.salary = salary;
	}
	
	abstract void  displayInfomation();
	@Override
	public int compareTo(Employee other) {
		return getName().compareTo(other.getName());
	}
}
