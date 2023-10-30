package exceptionHandling;


class Book implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Update Db");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {}
		}
	}
	
}
class Num extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			
		
			System.out.println(i);
			try {
			Thread.sleep(4000);
			} catch (InterruptedException e) {}
		}
	}
}

public class Multithread {

	public static void main(String[] args) {
		Runnable bk=new Book();
		Num nu=new Num();
		
		Thread t1=new Thread(bk);
//		bk.updateDB();
//	 bk.start();
		t1.start();
		nu.start();
		
		
		
	}

}
