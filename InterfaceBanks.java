package Wiley_java_core;

interface Bank{
	void account();
}
interface Bank1{
	void account();
}
interface ATM extends Bank, Bank1{
	void insertCard();
	void selectOption();
	void enterPassword();
}
interface AA{
	void m1();
}
abstract class NewATM implements ATM, AA{
	public void account() {
		
	}
}

public class InterfaceBanks extends NewATM {
	public void voidinsertCard() {
		System.out.println("Insert Card");
	}
	public void seelctOption() {
		System.out.println("Select Card");
	}
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterPassword() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}