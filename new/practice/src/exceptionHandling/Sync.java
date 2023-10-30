package exceptionHandling;


class Table{
	synchronized void print(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class Sync {

	public static void main(String[] args) {
		Table t=new Table();
		t.print(5);
		Thread t1=new Thread() {
			public void run() {
				t.print(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				t.print(10);
			}
		};
		
		
		t1.start();
		t2.start();
	}

}
