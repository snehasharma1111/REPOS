package Wiley_java_core;


class Employee{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class EmployeeImpl{
	public void show(Employee emp) {
		System.out.println("Calling show method");
		System.out.println("Name: " + emp.getName() + "age: " + emp.getAge());
	}
}
public class EmployeeEncapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setName("Sneha");
		emp.setAge(22);
	}

}
