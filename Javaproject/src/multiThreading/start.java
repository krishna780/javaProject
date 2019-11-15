package multiThreading;

public class start extends Thread {
	public void run() {
        System.out.println("running a thread");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start t1 = new start();
		t1.start();
	}

}
