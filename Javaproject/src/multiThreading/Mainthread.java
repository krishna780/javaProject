package multiThreading;

public class Mainthread extends Thread {
      public static void main(String[] args) {
		System.out.println("current Thraed:-"+Thread.currentThread().getName());
		
		Thread.currentThread().setName("krishna");
		System.out.println("after changing Thraed name:-"+Thread.currentThread().getName());

		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("main thread priority"+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("main thread execution");
		}
		ChildThread ct = new ChildThread();
		System.out.println("child thread priority"+ct.getPriority());
		
		ct.setPriority(NORM_PRIORITY);
		System.out.println("after child thread execution"+ct.getPriority());
		
		ct.start();
	}

}class ChildThread extends Thread{
	
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("child thread");
		}
	}
}
