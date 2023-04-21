package wiley_java_core;


class Vehicle1{
	
	public void steering() {
		System.out.println("steering");
	}
}
class Car1 extends Vehicle1{
	public void airbag() {
		System.out.println("airbag");
	}

	public void pump() {
		// TODO Auto-generated method stub
		
	}
}
class Truck extends Vehicle1{
	public void pump() {
		System.out.println("pump");
	}
}

class bike extends Truck{ 
	public void airbags() {
		System.out.println("airbags");
	}
}
class Smart extends bike{
	public void sensor() {
		System.out.println("sensor");
	}
}

public class HierarchialInheritance {
	public static void main(String[] args) {
    	Smart sc = new Smart();
    	sc.sensor();
    	sc.airbags();
        sc.pump();
    	
    	
    	Car1 a = new Car1();
        
    	a.airbag();
    	a.steering();
    }
}
