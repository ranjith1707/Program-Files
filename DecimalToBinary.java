package demo;
import java.util.Scanner;

public class DecimalToBinary {
	 Scanner scanner=new Scanner(System.in);
	 public static void main (String[] args) 
		{
		 DecimalToBinary deecimalToBinary=new DecimalToBinary();
		
		 deecimalToBinary.getBinary();
		 deecimalToBinary.getdecimal();
			}
	 
	 private void getBinary() {
		
		int t;
		String num = "";
		System.out.println("Enter Decimal Number ");
		 int given=scanner.nextInt();
		 
		 while(given!=0) {
			 t = given % 2;
			 num = t + num;
			 given=given/2;
		 }
		 System.out.println(num);
		 
   	 }
	 private void getdecimal() {
			System.out.println("Enter binary Number ");
			 int given=scanner.nextInt();
			 int decimal=0;
			 for(int i=0; given!=0; i++) {
			 int temp=given%10;
			 decimal+=temp*Math.pow(2,i);
			 given=given/10;
			 }
			 
			 System.out.println(decimal);
	 }
	
}
