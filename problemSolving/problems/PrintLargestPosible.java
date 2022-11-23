package problems;

import java.util.Scanner;

public class PrintLargestPosible {
	private Scanner scanner=new Scanner(System.in);
   public static void main(String[] args) {
	   PrintLargestPosible printLargest=new PrintLargestPosible();
	   printLargest.printElement();
   }
   
   private void printElement() {
	   System.out.println("Enetr Nuber Of String ");
	   int size=scanner.nextInt();
	   scanner.nextLine();
	   String[] arr=new String[size];
	   for(int i=0; i<size; i++) {
		   arr[i]=scanner.nextLine();
	   }
	   
	   for(int i=0; i<size; i++) {
		  int len= arr[i].length();
		  String temp=arr[i];
		  for(char k='z'; k>='a'; k--) {
		     for(int j=0; j<len; j++) {
			   
				   if(k==temp.charAt(j)) {
					   System.out.print(k);
				   }
			   }
		   }
		  System.out.println();
	   }
   }
}
