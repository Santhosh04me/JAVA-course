package practice;

public class Box {
	int lenght;//instance varaiables
	int breath;
	int height;
	
	int Volume()
	{
		return lenght*breath*height;
	}
	
	public static void printLine()
	{
		System.out.println("_______________________________");
	}
	
	static int boxVolume(int lenth,int breath,int height){
		int Vol;
		Vol=lenth*breath*height;
		return Vol;
	}

	public static void main(String[] args) {
		
		Box blackbox;
		blackbox=new Box();
		Box woodbox=new Box();
		
	    blackbox.lenght=12;
		blackbox.height=10;
		blackbox.breath=6;
				
		System.out.println("Volume of blackBox is :"+blackbox.Volume());
				
				
				
				
		printLine();
		System.out.println("blackbox height"+blackbox.height);
		System.out.println("woodbox"+woodbox.lenght);
		int volume=boxVolume(10,4,6);//passing parameters
		System.out.println("volume is:"+volume);
		printLine();
	}

}
