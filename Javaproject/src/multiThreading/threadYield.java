package multiThreading;

public class threadYield implements Runnable{
           Thread t;
           threadYield(String str){
        	   t = new Thread(this, str);
        			   t.start();
           }
           public void run() {
        	   for (int i=0;i<5;i++) {
        		   if((i % 5) ==0) {
        			   System.out.println(Thread.currentThread().getName()+"yielding control..");
        			   Thread.yield();
        		   }
        	   }
        	   System.out.println(Thread.currentThread().getName()+"has finishing executing");
           }
           public static void main(String[] args) {
			new threadYield("thread 1 ");
			new threadYield("thread 2 ");
			new threadYield("thread 3 ");

		}
}
