package wiley_java_core;

class V{
	
	public void steering() {
		System.out.println("steering");
	}
}
class C extends V{
	public void airbag() {
		System.out.println("airbag");
	}
}
class T extends V{
	public void pump() {
		System.out.println("pump");
	}
}



public class HybridInheritance {
	public static void main(String[] args) {
    	T sc = new T();
    	sc.pump();
    	sc.steering();
    	
    	C a = new C();
    	a.airbag();
    }
}




