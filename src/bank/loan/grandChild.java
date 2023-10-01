package bank.loan;

public class grandChild extends child2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandChild gc = new grandChild();
		System.out.println(gc.amount);
		gc.play();
		gc.bike_ride();
		gc.study();

	}

	private void study() {
		// TODO Auto-generated method stub
		System.out.println("science");
		
	}

}
