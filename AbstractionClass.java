package Wiley_java_core;

abstract class Test1{
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2");
	}
	public static void main(String[] args) {
		System.out.println("test1 main method from abstract class");
	}
	public Test1() {
		System.out.println("Test1 constructor");
	}
}

class Test2 extends Test1{
	public void m1() {
		System.out.println("Test2 m1");
	}
	public Test2() {
		System.out.println("Test2 constructor");
	}
}


public class AbstractionClass {
public static void main(String[] args) {
	Test2 t2 = new Test2();
	t2.m1();
	t2.m2();
	Test1.main(args);
}
}

