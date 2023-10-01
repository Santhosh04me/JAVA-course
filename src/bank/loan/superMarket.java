package bank.loan;

public class superMarket {
	String prod_name;
	int price,discount;
	public superMarket(String s1,int no1,int no2)
    {
		prod_name=s1;
		price=no1;
		discount=no2;
//        System.out.println("hi"+s1+no1+no2);
    }
	public superMarket(String prod_name,int price)
    {
		this.prod_name=prod_name;
		this.price=price;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superMarket prod1= new superMarket("soap",20,2);
        superMarket prod2 = new superMarket("shampoo",10,2);
	
        superMarket prod3 = new superMarket("biscut",25,3);
        superMarket prod4 = new superMarket("biscut",45);
		
		prod1.sell();
		prod4.sell();
//		prod2.sell();
//		prod3.sell();
	}


	private void sell() {
		// TODO Auto-generated method stub
		System.out.println(prod_name);
		System.out.println(price);
		System.out.println(discount);
	}

}
