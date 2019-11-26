package multiThreading;

class MultithreadingDemo implements Runnable{
	public void run() {
		try {
			System.out.println("Thread"+Thread.currentThread().getId()+"Running thread");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is caught");
		}
	}
}

public class Multithread {
         public static void main(String[] args) {
			int n = 8;
			for(int i=0;i<8;i++) {
				Thread object = new Thread(new MultithreadingDemo());
				object.start();
			}
		}
}
