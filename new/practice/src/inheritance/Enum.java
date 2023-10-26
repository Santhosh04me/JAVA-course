package inheritance;

enum level{
	BEGINER("B"),INTERMEDIATER("I"),ADVANCED("123");
	private String abbr;
	level(String ab){
		abbr=ab;
	}
	String getAbbr(){
		return abbr;
	}
}

public class Enum {
	

	public static void main(String[] args) {

		level l1=level.ADVANCED;
		System.out.println(l1);
		System.out.println(l1.getAbbr());
		
	}

}
