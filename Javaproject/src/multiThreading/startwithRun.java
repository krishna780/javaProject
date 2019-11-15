package multiThreading;

public class startwithRun implements Runnable {
	
	
		public void run() {
			System.out.println("runnable interface");
		}
        public static void main(String args[]) {
        	startwithRun h1= new startwithRun();
        	
        	Thread t1= new Thread(h1);
        	t1.start();
	
}
	}


