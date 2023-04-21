package wiley_java_core;


interface Person{
	public void getRole();
}
interface Student extends Person{
	
}

class Teacher implements Person{
      public void getRole() {
    	  System.out.println("Teaching");
      }
}
class ClassRoom extends Teacher implements Student{
	public void getRole() {
		System.out.println("Classroom teching");
	}
}
public class DiamondProblem {
	

}
