package multiThreading;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println(" inside a main method");
	}
 public static void main(String[] args) {
	 ThreadPriority t1 = new ThreadPriority();
	 ThreadPriority t2 = new ThreadPriority();
	 ThreadPriority t3 = new ThreadPriority();
       System.out.println("t1 thread priority: "+t1.getPriority());	
       System.out.println("t2 thread priority: "+t2.getPriority());	 
       System.out.println("t3 thread priority: "+t3.getPriority());	 
				t1.setPriority(MIN_PRIORITY);
				t2.setPriority(NORM_PRIORITY);
				t3.setPriority(MAX_PRIORITY);
						System.out.println("t1 thread priority: "+t1.getPriority());	
						System.out.println("t2 thread priority: "+t2.getPriority());	
						System.out.println("t3 thread priority: "+t3.getPriority());	
              System.out.println(Thread.currentThread().getName());
              
              System.out.println("main thread priority: "+Thread.currentThread().getPriority());
              
              Thread.currentThread().setPriority(9);
              System.out.println("main thread priority: "+Thread.currentThread().getPriority());
 }
}
