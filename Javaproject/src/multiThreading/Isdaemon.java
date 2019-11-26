package multiThreading;

public class Isdaemon extends Thread {
	
	       public Isdaemon(String name) {
	    	   super(name);
	       }
	       public void run() {
	    	   if(Thread.currentThread().isDaemon()) {
	    		   
	    			   System.out.println(getName() +"is damenon thread");
	    		   }
	    		   else {
	    			   System.out.println(getName()+"is user thread");
	    		   }
	    	   }
	    	   public static void main(String[] args) {
	    		   Isdaemon t1 =new Isdaemon("t1");
	    		   Isdaemon t2 =new Isdaemon("t2");
	    		   Isdaemon t3 =new Isdaemon("t3");
                 t1.setDaemon(true);
                 t1.start();
                 t2.start();
                 t3.setDaemon(true);
                 t3.start();
	    		   
	    	   }
	       }


