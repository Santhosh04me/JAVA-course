package bank.loan;

public class Myself {
	private int atm_pin=123;
	private int password=123456789;
	public int abc=123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myself ms=new Myself();
		System.out.println(ms.atm_pin);
		System.out.println(ms.password);
		ms.take_ride();
	}
	 void take_ride() {   //default -package
		// TODO Auto-generated method stub
		 System.out.println("bike riding");
		
	}
	private void set_atm_pin()
	{
		System.out.println("setting atm pin");
	}
	public void relative()
	{
		System.out.println("hi machi");
	}

}
