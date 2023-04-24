package Exception;

import java.util.ArrayList;

class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
}

public class UnChecked {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("Sneha");
		students.add("Aman");
		students.add("Vansh");
		students.add("Anamika");
		
		if(!students.contains("Sneh")) {
			try {
				throw new StringNotFound("This string not found");
			} catch (StringNotFound e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Message one");
		System.out.println("Message two");
	}
}
