package wiley_java_core;

class test{
	public static int add(int v1, int v2) {
		int val=v1+v2;
		return val;
	}
}
public class MethodType {
	public void sub(int v1, int v2) {
		int val=v1-v2;
		System.out.println("Substraction in instance method: " + val);
	}
	public void add(int v1, int v2) {
		int val=v1+v2;
		System.out.println("Addition in instance method: " + val);
		this.sub(9,5);
	}
	public static void mul (int v1, int v2) {
		int val=v1*v2;
		System.out.println("Multiply in static method: " + val);
	}
	public static void div (int v1, int v2) {
		int val=v1/v2;
		System.out.println("Divide in static method: " + val);
	}
}