package wiley_java_core;
public class InstanceOrder{
	String name;
	int age;
	{
		name= "Sneha";
		age=21;
		System.out.println("Instance block");
	}
	public InstanceOrder() {
		System.out.println("Name: " + name + " " + "Age: " + age);
		System.out.println("constructor block");
	}
	public InstanceOrder(int a, int b) {
		System.out.println("Constructor parameterized" + (a+b));
	}
	public static void main (String[] args) {
		InstanceOrder ior = new InstanceOrder();
		new InstanceOrder(2,3);
	}
}

