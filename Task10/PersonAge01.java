package Task10;

public class PersonAge01 {

	private String name;
	private int age;

	
	public PersonAge01(String name, int age) {
		this.name = name;
		this.age = age;

	} 

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;

	}

	
	public static void main(String[] args) {
		PersonAge01 per1 = new PersonAge01("Mahendran", 30);
		PersonAge01 per2 = new PersonAge01("Santhosh", 32);
		System.out.println(per1.getName() + " is " + per1.getAge() + " years old.");
		System.out.println(per2.getName() + " is " + per2.getAge() + " years old.");
	}

}
