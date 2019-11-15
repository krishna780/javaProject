package multiThreading;

public class runMethodCallMul extends Thread {
	
	public void run() {
		for(int i =0;i<5;i++) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {System.out.println(e);}
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		runMethodCallMul t1 = new runMethodCallMul();
		runMethodCallMul t2 = new runMethodCallMul();
		t1.run();
		t2.run();
	}

}
