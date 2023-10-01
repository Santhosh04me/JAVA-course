package final_learning;

public class Branch_hotel_vasanth extends hotel_vasanth{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hotel_vasanth bhv= new hotel_vasanth();
//		bhv.meal=200;
		System.out.println(bhv.meal);
		
		bhv.prepareFood();
	}
//	void prepareFood()
//	{
//		System.out.println("low quality food");
//	}
	
	void prepareFood()
	{
		System.out.println("low quality food");
	}

}
