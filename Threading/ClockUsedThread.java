package treading;
public class ClockUsedThread extends Thread{
   public static void main(String[] args) {
	   ClockUsedThread clock=new ClockUsedThread();
	   clock.startclock();
   }
   
   
   private void startclock() {
	   ClockUsedThread clock=new ClockUsedThread();
	   clock.start();
   }
   
   
   public void run() {
	   for(int i=1; i<=24; i++) {
		   for(int j=1; j<=60; j++) {
			   for(int k=1; k<60; k++) {
				   System.out.print("  "+k);
				   try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			   }
			   System.out.println("\n Minute : "+ j);
		   }
		   System.out.println("\n Hout  : "+ i);
	   }
	   startclock();
   }
}
