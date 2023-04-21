package wiley_java_core;

public class CreateClass implements Cloneable {
	int a=10;
	
	public void add() {
		System.out.println("Number adding");
	}
	public static void main(String[] args)throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		//create object with new keyword
		CreateClass cc= new CreateClass();
		cc.add();
		System.out.println(cc);
		
		//create object with newinstance
		try {
			Class<?> c = Class.forName("wiley_core_java.CreateClass");
			@SuppressWarnings("deprecation")
			CreateClass ci = (CreateClass) c.newInstance();
			ci.add();
			System.out.println(ci);
			}
		catch(ClassNotFoundException e){
			//TODO auto generated catch block
			e.printStackTrace();
		}
		
		//create object with Object.clone()
		CreateClass objClone = (CreateClass) cc.clone();
		objClone.add();
		System.out.println("object clone:-  "+ objClone);
	}

}
