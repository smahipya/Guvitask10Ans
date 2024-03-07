package Task10;

public class Employeecalling02 {
	public static void main(String[] args) {
		
		Employee02 emp = new Employee02 (30, "Mahi", "Sandy", 80000);
		
		System.out.println("Employee id is : " + emp.getId());
		
		System.out.println("Employee Firstname is : " + emp.getFirstName());
		
		System.out.println("Employee Lastname is : " + emp.getLastName());
		
		System.out.println("Employee Fullname is : " + emp.getName());
		
		System.out.println("Employee Salary is : " + emp.getsalary());
		
		System.out.println("Employee Annual Salary is : " + emp.getAnnualSalary());
	
		System.out.println("Employee  incremented Salary is : " + emp.raiseSalary(55));

	}

}
