package demo;
import java.util.Scanner;
public class LearnThread  extends Thread{
	Scanner scanner=new Scanner(System.in);
	
   public static void main(String[] args) {
	   LearnThread lt =new LearnThread();
	   lt.mathod();
	  
   }
   
   private void mathod() {
	   System.out.println("Enter 1");
	   int option=scanner.nextInt();
	   if(option==1) {
		   threadAccess();
	   }
	   mathod();
   }
   
   private void threadAccess() {
	   new LearnThread().start();
   }
   
   public void run() {
	  
	   for(int i=0; i<10; i++) {
		  System.out.println(i+" "+Thread.currentThread());
		  //System.out.println();
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   }
}
