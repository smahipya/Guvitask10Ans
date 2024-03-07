package Task10;

public class Employee02 {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	
	public Employee02 (int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;

	}

	public String getFirstName() {
		return firstName;

	}

	public String getLastName() {
		return lastName;

	}

	public String getName() {
		return firstName + " " + lastName;

	}

	public int getsalary() {
		return salary;

	}

	public void setSalary(int Salary) {
		this.salary = salary;

	}

	public int getAnnualSalary() {
		return salary * 12;

	}

	public int raiseSalary(int percent) {
		salary = salary * percent / 100;
		return salary;

	}

}
