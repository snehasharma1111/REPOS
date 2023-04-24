package Exception;

public class FinalBlock {

	public static void main(String[] args) {
		try {
			System.out.println("1111");
			System.out.println("wiley");
			System.out.println(10/0);
			//System.exit(0);
			System.out.println("edge");
			
		}catch(Exception e) {
			System.out.println("catch block");
			try {
				System.out.println("try catch inside catch");
				System.out.println(10/0);
			}catch(Exception ee) {
				ee.printStackTrace();
			}
			
		}finally {
		
			System.out.println("Clone connection");
			// TODO: handle finally clause
		}
		System.out.println("last statement");
	}
}
