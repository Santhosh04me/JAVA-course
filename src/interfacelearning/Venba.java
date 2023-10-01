package interfacelearning;

public class Venba extends Kathir implements traffic_rules{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venba vv =new Venba();
		vv.study();
		vv.wear_helmet();
		System.out.println(Venba.fine);
	}

	@Override
	void study() {
		// TODO Auto-generated method stub
		System.out.println("Study well");
	}

	@Override
	public void wear_helmet() {
		// TODO Auto-generated method stub
		System.out.println("helmet while traveling");
		
	}

}
