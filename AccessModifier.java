package Wiley_java_core;


class DefaultExample{
    void message(){
        System.out.println("This is a message");
    }
}
class Private{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class AccessModifier {
    public static void main(String[] args) {
    	Private p = new Private();
    	p.setName("Sneha");
    }
}
