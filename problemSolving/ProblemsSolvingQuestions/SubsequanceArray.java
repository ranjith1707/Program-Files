package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubsequanceArray {
   public static void main(String[] args) {
	   SubsequanceArray sequance=new SubsequanceArray();
	   sequance.sequanceArray();
   }
   
   
   private void sequanceArray() {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter The Length Of Array : ");
	   int lengthOfArray=scanner.nextInt();
	   int[] array=new int[lengthOfArray];
	   ArrayList<String> list=new ArrayList<String>();
 	   for(int i=0; i<lengthOfArray; i++) {
		   array[i]=scanner.nextInt();  
	   }
 	   Arrays.sort(array);
 	   for(int i=0; i<lengthOfArray; i++) {
 		   for(int j=i; j<lengthOfArray; j++) {
 			   for(int k=j; k<lengthOfArray; k++) {
 				   
 				   if(i!=j&&j!=k && i!=k) {
 				   if(array[i]+array[j]+array[k]==0) {
 					if(list.isEmpty())
 					  list.add("["+array[i]+","+array[j]+","+array[k]+"]"); 
 					else if(!list.contains("["+array[i]+","+array[j]+","+array[k]+"]"))
 					      list.add("["+array[i]+","+array[j]+","+array[k]+"]");
 				   }
 				   }
 			   }
 		   }
 	   }
 	   System.out.println(list);
   }
}
