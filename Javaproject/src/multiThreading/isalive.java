package multiThreading;

public class isalive extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("is run(0method isAlive: "+Thread.currentThread().isAlive());
		}catch(InterruptedException ie) {
			
		}
	}
public static void main(String[] args) {
	isalive t1= new isalive();
	System.out.println("Before starting thread: "+t1.isAlive());
	t1.start();
	System.out.println("After starting thread: "+t1.isAlive());

}
}
